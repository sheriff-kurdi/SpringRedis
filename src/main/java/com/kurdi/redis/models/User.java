package com.kurdi.redis.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {
    private String id;
    private String name;
    private String email;
    private int age;
}
