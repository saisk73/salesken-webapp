package com.saikiranreddy.webapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

  private String id;
  private String email;
  private String password;
  
  public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public User(String id, String email, String password) {
    this.id = id;
    this.email = email;
    this.password = password;
}

public User() {}




}