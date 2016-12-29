package com.dyq.ssm.mapper;

import com.dyq.ssm.pojo.Usergit;
import com.dyq.ssm.pojo.UsergitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergitMapper {
    int countByExample(UsergitExample example);

    int deleteByExample(UsergitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usergit record);

    int insertSelective(Usergit record);

    List<Usergit> selectByExample(UsergitExample example);

    Usergit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usergit record, @Param("example") UsergitExample example);

    int updateByExample(@Param("record") Usergit record, @Param("example") UsergitExample example);

    int updateByPrimaryKeySelective(Usergit record);

    int updateByPrimaryKey(Usergit record);
}