package com.graduation.baseProvider.mapper;

import com.graduation.hrApi.entities.base.CuBasicData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BaseProviderMapper {

    /**
     * 测试   获取cu_basic_data全表
     * @return
     */
    @Select(" SELECT * FROM cu_basic_data ")
    public List<CuBasicData> getBasicDataAll();

    /**
     * 添加 员工基础信息
     * @param cuBasicData
     * @return
     */
    @Insert(" INSERT INTO cu_basic_data VALUES (#{jobNum},#{userName},#{sex},#{birthday},#{nativePlace},#{nation},#{nationality},#{highestEdu},#{highestDegree},#{idType},#{idNum},#{enName},#{phone},#{phoneTemp},#{email},#{politicalStatus},#{contactTemp},#{contactPhoneTemp},#{maritalStatus},#{homeAddress},#{registeredAddress},#{salary},#{loginPhone}) ")
    public int addCuBasicData(CuBasicData cuBasicData);

}
