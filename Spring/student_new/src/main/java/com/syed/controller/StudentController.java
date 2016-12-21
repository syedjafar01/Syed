package com.syed.controller;

import com.syed.pojo.StudentUi;
import com.syed.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class StudentController {


    @Autowired
    StudentService studentService;

    @RequestMapping("*")
    @ResponseBody
    public ResponseEntity<String> method1() {

        ResponseEntity<String> re = new ResponseEntity<String>(studentService.message(),HttpStatus.BAD_REQUEST);
            return re;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody StudentUi s) {
        return studentService.create(s);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer id ) {
        return studentService.delete(id);
    }

    @RequestMapping(value = "/getstudentbyid/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String getStudentById(@PathVariable("id") Integer id) {
        return studentService.getById(id);
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String update(@RequestBody StudentUi s, @PathVariable("id") Integer id) {
        return studentService.updateUser(s,id);
    }
}