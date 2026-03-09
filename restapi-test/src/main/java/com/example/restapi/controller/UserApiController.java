package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Integer id) {
        User user=userService.findById(id);
        UserResponse response=new UserResponse(user);
        return ResponseEntity.ok(response);
    }
    
    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
       @Valid @RequestParam(required = false) String name,@Valid @RequestParam(required = false) String email) {
            User conditoin=new User();
            conditoin.setName(name);
            conditoin.setEmail(email);
            List<User> users=userService.searchUsers(conditoin);
            List<UserResponse> responses=new ArrayList<>();
            for(User user:users){
                responses.add(new UserResponse(user));
            }

        return ResponseEntity.ok(responses);
    }


    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest request) {
        User user=new User(request.getName(),request.getEmail());
        User createUser=userService.createUser(user);
        UserResponse response=new UserResponse(createUser);
        
        return ResponseEntity.ok(response);
    }
    
    

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Integer id, @Valid @RequestBody UserRequest request) {
        User user=new User(request.getName(),request.getEmail());
        User updateUser=userService.updateUser(id,user);
        UserResponse response=new UserResponse(updateUser);
        
        return ResponseEntity.ok(response);
    }

}
