package com.employeleave.requestemployeleave.controller;

import com.employeleave.requestemployeleave.dto.UserDTO;
import com.employeleave.requestemployeleave.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.io.iona.springboot.controllers.HibernateCRUDController;
// by jack //
@RestController
@RequestMapping("api/user")
public class UserController extends HibernateCRUDController  <User, UserDTO> {

}
