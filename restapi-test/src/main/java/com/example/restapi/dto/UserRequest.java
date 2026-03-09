package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {
    @NotBlank(message="名前を記入してください")
    private String name;
    @NotBlank(message="メールアドレスを記入してください")
    @Email(message="正しいフォーマットで記入してください")
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

}
