package com.syed.controller;

import com.syed.pojo.EmployeeUi;
import com.syed.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by syedjafar on 20/12/16.
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> create(@RequestBody EmployeeUi e) {
        ResponseEntity re;
        try {
            String response = employeeService.create(e);
            re = new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e1) {
            re = new ResponseEntity(e1.getMessage(), HttpStatus.NOT_FOUND);
        }
        return re;
    }



}
