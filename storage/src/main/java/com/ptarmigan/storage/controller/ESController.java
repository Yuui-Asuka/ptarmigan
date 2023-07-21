package com.ptarmigan.storage.controller;

import com.ptarmigan.storage.domain.ESDocument;
import com.ptarmigan.storage.service.Impl.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("log/api/v1")
@RestController
public class ESController {

    @Autowired
    DocumentService documentService;

    @GetMapping("save_doc")
    private void saveDoc(@RequestParam String id, @RequestParam String title, @RequestParam String content){
        ESDocument esDocument = new ESDocument(id, title, content);
        documentService.saveDocument(esDocument);
    }

    @GetMapping("get_doc")
    private List<ESDocument> getDoc(@RequestParam String title){
       return documentService.findByTitle(title);
    }
}
