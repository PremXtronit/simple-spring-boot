package com.simplespringboot;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user")
    public ResponseEntity getUserInfo() {
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setName("Prem");
        userDto.setDesc("docker image");
        return new ResponseEntity(userDto, HttpStatus.OK);
    }

}
