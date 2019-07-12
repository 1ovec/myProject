package com.pinyougou.mapper;

import com.pinyougou.pojo.PersonasDay;
import com.pinyougou.pojo.PersonasDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonasDayMapper {
    int countByExample(PersonasDayExample example);

    int deleteByExample(PersonasDayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonasDay record);

    int insertSelective(PersonasDay record);

    List<PersonasDay> selectByExample(PersonasDayExample example);

    PersonasDay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonasDay record, @Param("example") PersonasDayExample example);

    int updateByExample(@Param("record") PersonasDay record, @Param("example") PersonasDayExample example);

    int updateByPrimaryKeySelective(PersonasDay record);

    int updateByPrimaryKey(PersonasDay record);
}