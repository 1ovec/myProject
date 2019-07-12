package com.hd.mapper;

import com.hd.pojo.StopTaskinfo;
import com.hd.pojo.StopTaskinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StopTaskinfoMapper {
    int countByExample(StopTaskinfoExample example);

    int deleteByExample(StopTaskinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StopTaskinfo record);

    int insertSelective(StopTaskinfo record);

    List<StopTaskinfo> selectByExample(StopTaskinfoExample example);

    StopTaskinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StopTaskinfo record, @Param("example") StopTaskinfoExample example);

    int updateByExample(@Param("record") StopTaskinfo record, @Param("example") StopTaskinfoExample example);

    int updateByPrimaryKeySelective(StopTaskinfo record);

    int updateByPrimaryKey(StopTaskinfo record);
}