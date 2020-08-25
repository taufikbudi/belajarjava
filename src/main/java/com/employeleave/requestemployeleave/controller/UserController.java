package com.employeleave.requestemployeleave.controller;

import com.employeleave.requestemployeleave.dto.UserDTO;
import com.employeleave.requestemployeleave.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.io.iona.springboot.controllers.HibernateCRUDController;

import java.util.List;

// by jack //
@RestController
@RequestMapping("api/user")

public class UserController extends HibernateCRUDController  <User, UserDTO> {

}
