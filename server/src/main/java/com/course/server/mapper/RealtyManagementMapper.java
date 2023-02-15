package com.course.server.mapper;

import com.course.server.domain.RealtyManagement;
import com.course.server.domain.RealtyManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RealtyManagementMapper {
    long countByExample(RealtyManagementExample example);

    int deleteByExample(RealtyManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RealtyManagement record);

    int insertSelective(RealtyManagement record);

    List<RealtyManagement> selectByExample(RealtyManagementExample example);

    RealtyManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RealtyManagement record, @Param("example") RealtyManagementExample example);

    int updateByExample(@Param("record") RealtyManagement record, @Param("example") RealtyManagementExample example);

    int updateByPrimaryKeySelective(RealtyManagement record);

    int updateByPrimaryKey(RealtyManagement record);
}