package com.syed.controller;

import com.syed.pojo.PositionUi;
import com.syed.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by syedjafar on 21/12/16.
 */
@Controller
@RequestMapping("/pos")
public class PositionController {

   @Autowired
    PositionService positionService;
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody PositionUi e) {
        return positionService.create(e);
    }

}
