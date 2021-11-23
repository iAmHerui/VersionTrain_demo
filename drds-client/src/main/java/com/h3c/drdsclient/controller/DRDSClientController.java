package com.h3c.drdsclient.controller;

import com.h3c.drdsclient.entity.testBO;
import com.h3c.drdsclient.mapper.DRDSClientMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "DRDS Client接口",tags = "DRDS Client接口")
@RequestMapping("drdsClient")
@RestController
public class DRDSClientController {

    @Autowired
    private DRDSClientMapper drdsClientMapper;

    @ApiOperation(value = "查询所有数据",notes = "查询所有数据")
    @GetMapping("/select")
    public List<testBO> select(){
        return drdsClientMapper.selectInfo();
    }

    @ApiOperation(value = "插入数据",notes = "插入数据")
    @GetMapping("/insert")
    public Boolean insert(String name){
        return drdsClientMapper.insertInfo(name);
    }

    @ApiOperation(value = "更新数据",notes = "更新数据")
    @GetMapping("/update")
    public Boolean update(int id,String newName){
        return drdsClientMapper.updateInfo(id,newName);
    }

    @ApiOperation(value = "删除数据",notes = "删除数据")
    @GetMapping("/delete")
    public Boolean delete(int id){
        return drdsClientMapper.deleteInfo(id);
    }
}
