package com.employeleave.requestemployeleave.controller;

import com.employeleave.requestemployeleave.models.BucketApproval;
import com.io.iona.springboot.controllers.HibernateCRUDController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bucketapproval")
public class BucketApprovalController extends HibernateCRUDController<BucketApproval,BucketApproval> {
}
