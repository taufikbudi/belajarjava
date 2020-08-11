package com.employeleave.requestemployeleave.controller;

import com.employeleave.requestemployeleave.dto.PositionLeaveDTO;
import com.employeleave.requestemployeleave.models.PositionLeave;
import com.io.iona.springboot.controllers.HibernateCRUDController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/positionleave")
public class PositionLeaveController extends HibernateCRUDController<PositionLeave, PositionLeaveDTO> {
}
