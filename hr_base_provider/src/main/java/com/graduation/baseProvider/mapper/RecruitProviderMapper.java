package com.graduation.baseProvider.mapper;

import com.graduation.hrApi.entities.base.CuRecruitment;
import com.graduation.hrApi.entities.base.CuRecruitmentInfo;
import com.graduation.hrApi.entities.base.CuRecruitmentReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RecruitProviderMapper {

    /**
     * 测试   获取cu_recruitment_info全表
     * @return
     */
    @Select(" SELECT * FROM cu_recruitment_info; ")
    public List<CuRecruitmentInfo> getRecruitInfoAll();

    /**
     * 测试   获取cu_recruitment_req全表
     * @return
     */
    @Select(" SELECT * FROM cu_recruitment_req; ")
    public List<CuRecruitmentReq> getRecruitReqAll();

    /**
     * 获取 岗位列表
     * @return
     */
    @Select(" SELECT cri.row_id, cri.job, cri.station, cri.head_count, cri.written_time, cri.interview_time, cri.company, cri.department, cri.base, crr.duty, crr.requirement, crr.comments, crr.bonus_items, crr.treatment FROM cu_recruitment_info cri, cu_recruitment_req crr WHERE cri.job = crr.job; ")
    public List<CuRecruitment> getRecruitment();

    /**
     * 获取 部分岗位列表
     * @return
     */
    @Select(" SELECT * FROM (SELECT cri.row_id, cri.job, cri.station, cri.head_count, cri.written_time, cri.interview_time, cri.company, cri.department, cri.base, crr.duty, crr.requirement, crr.comments, crr.bonus_items, crr.treatment FROM cu_recruitment_info cri, cu_recruitment_req crr WHERE cri.job = crr.job) TEMP WHERE base = #{param1} OR station = #{param2}; ")
    public List<CuRecruitment> getRecruitmentPart(String base, String station);
}
