package com.javastart.account.dto;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class AccountRequestDto {
    private String name;
    private String email;
    private String phone;
    private OffsetDateTime creationDate;

}
