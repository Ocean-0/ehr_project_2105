package com.graduation.AttProvider.mapper;

import com.graduation.hrApi.entities.base.AttCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttProviderMapper {

    /**
     * 获取 部分 attCount
     * @param account
     * @return
     */
    @Select(" SELECT * FROM attendance_count WHERE job_num = #{account} ")
    public List<AttCount> getAttCount(@Param("account")String account);

}
