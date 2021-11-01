package com.h3c.drdsclient.controller;

import com.h3c.drdsclient.mapper.DRDSClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("drdsClient")
@RestController
public class DRDSClientController {

    @Autowired
    private DRDSClientMapper drdsClientMapper;


    @GetMapping("/insert")
    public Boolean insert(String name){
        return drdsClientMapper.insertInfo(name);
    }

    @GetMapping("/update")
    public Boolean update(String name){
        return drdsClientMapper.updateInfo(name);
    }

    @GetMapping("/delete")
    public Boolean delete(String name){
        return drdsClientMapper.deleteInfo(name);
    }
}
