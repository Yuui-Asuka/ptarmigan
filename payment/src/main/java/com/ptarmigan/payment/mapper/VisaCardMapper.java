package com.ptarmigan.payment.mapper;

import com.ptarmigan.payment.domain.VisaPay;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
public interface VisaCardMapper {

    @Select("select id, card_number, card_holder_name, expiration_month, expiration_year, cvv" +
            " from credit_card where card_number = #{cardNumber}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "cardNumber", column = "card_number"),
            @Result(property = "cardHolderName", column = "card_holder_name"),
            @Result(property = "expirationMonth", column = "expiration_month"),
            @Result(property = "expirationYear", column = "expiration_year"),
            @Result(property = "cvv", column = "cvv")
    })
    VisaPay findAll(@Param("cardNumber") String cardNumber);
}
