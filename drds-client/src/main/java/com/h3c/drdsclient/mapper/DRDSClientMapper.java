package com.h3c.drdsclient.mapper;

import com.h3c.drdsclient.entity.testBO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DRDSClientMapper {

    List<testBO> selectInfo();

    Boolean insertInfo(@Param("name") String name);

    Boolean deleteInfo(@Param("id") int id);

    Boolean updateInfo(@Param("id") int id,@Param("newName") String newName);
}
