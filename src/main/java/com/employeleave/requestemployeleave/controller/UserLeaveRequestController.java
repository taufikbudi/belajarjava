package com.employeleave.requestemployeleave.controller;


import com.employeleave.requestemployeleave.dto.UserLeaveRequestDTO;
import com.employeleave.requestemployeleave.models.UserLeaveRequest;
import com.io.iona.springboot.controllers.HibernateCRUDController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/userleaverequest")

public class UserLeaveRequestController extends HibernateCRUDController <UserLeaveRequest, UserLeaveRequestDTO> {
}
