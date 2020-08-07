package com.employeleave.requestemployeleave.controller;

import com.employeleave.requestemployeleave.dto.PositionDTO;
import com.employeleave.requestemployeleave.models.Position;
import com.io.iona.springboot.controllers.HibernateCRUDController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ini controler
//test 1
//test2
@RestController
@RequestMapping("api/position")
public class PositionController extends HibernateCRUDController <Position, PositionDTO> {
}
