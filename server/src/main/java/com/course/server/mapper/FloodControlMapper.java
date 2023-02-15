package com.course.server.mapper;

import com.course.server.domain.FloodControl;
import com.course.server.domain.FloodControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FloodControlMapper {
    long countByExample(FloodControlExample example);

    int deleteByExample(FloodControlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FloodControl record);

    int insertSelective(FloodControl record);

    List<FloodControl> selectByExample(FloodControlExample example);

    FloodControl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FloodControl record, @Param("example") FloodControlExample example);

    int updateByExample(@Param("record") FloodControl record, @Param("example") FloodControlExample example);

    int updateByPrimaryKeySelective(FloodControl record);

    int updateByPrimaryKey(FloodControl record);

}