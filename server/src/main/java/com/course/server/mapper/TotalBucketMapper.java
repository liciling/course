package com.course.server.mapper;

import com.course.server.domain.TotalBucket;
import com.course.server.domain.TotalBucketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalBucketMapper {
    long countByExample(TotalBucketExample example);

    int deleteByExample(TotalBucketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalBucket record);

    int insertSelective(TotalBucket record);

    List<TotalBucket> selectByExample(TotalBucketExample example);

    TotalBucket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalBucket record, @Param("example") TotalBucketExample example);

    int updateByExample(@Param("record") TotalBucket record, @Param("example") TotalBucketExample example);

    int updateByPrimaryKeySelective(TotalBucket record);

    int updateByPrimaryKey(TotalBucket record);
}