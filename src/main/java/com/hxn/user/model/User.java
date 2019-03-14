package com.hxn.user.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue
    long id;

    String name;
    String email;
    String
}
