package com.course.server.mapper;

import com.course.server.domain.CommunityPeople;
import com.course.server.domain.CommunityPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityPeopleMapper {
    long countByExample(CommunityPeopleExample example);

    int deleteByExample(CommunityPeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommunityPeople record);

    int insertSelective(CommunityPeople record);

    List<CommunityPeople> selectByExample(CommunityPeopleExample example);

    CommunityPeople selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommunityPeople record, @Param("example") CommunityPeopleExample example);

    int updateByExample(@Param("record") CommunityPeople record, @Param("example") CommunityPeopleExample example);

    int updateByPrimaryKeySelective(CommunityPeople record);

    int updateByPrimaryKey(CommunityPeople record);
}