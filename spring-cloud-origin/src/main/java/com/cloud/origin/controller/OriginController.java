package com.cloud.origin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 辉 on 2017/5/29.
 */
@RestController
@RequestMapping("/orgin")
public class OriginController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloCloud() {
        return "hello orgin";
    }
}
