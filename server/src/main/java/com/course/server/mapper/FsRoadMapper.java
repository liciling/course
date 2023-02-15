package com.course.server.mapper;

import com.course.server.domain.FsRoad;
import com.course.server.domain.FsRoadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsRoadMapper {
    long countByExample(FsRoadExample example);

    int deleteByExample(FsRoadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FsRoad record);

    int insertSelective(FsRoad record);

    List<FsRoad> selectByExample(FsRoadExample example);

    FsRoad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FsRoad record, @Param("example") FsRoadExample example);

    int updateByExample(@Param("record") FsRoad record, @Param("example") FsRoadExample example);

    int updateByPrimaryKeySelective(FsRoad record);

    int updateByPrimaryKey(FsRoad record);
}