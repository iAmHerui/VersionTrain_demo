package com.h3c.drdsclient.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DRDSClientMapper {

    Boolean insertInfo(@Param("name") String name);

    Boolean deleteInfo(@Param("name") String name);

    Boolean updateInfo(@Param("oldName") String oldName,@Param("newName") String newName);
}
