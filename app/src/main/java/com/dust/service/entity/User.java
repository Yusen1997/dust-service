package com.dust.service.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String userUuid;

    private String publicAddress;

    private long nonce;
}