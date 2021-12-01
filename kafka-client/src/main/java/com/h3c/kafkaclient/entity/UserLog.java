package com.h3c.kafkaclient.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserLog {

    private String username;

    private String userid;

    private String state;
}
