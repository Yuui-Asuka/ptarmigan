package com.ptarmigan.usermodule.intercepter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ParameterInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求参数
        String queryString = request.getQueryString();

        // 如果请求参数为空，即没有携带参数
        if (queryString == null) {
            // 返回自定义界面，这里可以返回一个HTML页面或其他视图
            response.sendRedirect("/not_found.html");
            return false; // 返回false表示拦截请求，不继续执行后续的Controller处理
        }

        // 参数不为空，放行请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 在处理完请求后，视图渲染前执行（可以在这里对视图进行处理）
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 在整个请求结束后执行，通常用于资源清理操作
    }




}
