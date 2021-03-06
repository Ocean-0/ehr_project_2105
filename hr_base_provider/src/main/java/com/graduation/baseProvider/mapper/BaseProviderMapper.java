package com.graduation.baseProvider.mapper;

import com.graduation.hrApi.entities.base.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BaseProviderMapper {
    /**
     * 登录
     * @param account
     * @param password
     * @return
     */
    @Select(" SELECT * FROM cu_account_info WHERE job_num = #{account} AND PASSWORD = #{password}; ")
    public List<CuAccountInfo> checkAccount(@Param("account")String account, @Param("password")String password);

    /**
     * 测试   获取cu_basic_data全表
     * @return
     */
    @Select(" SELECT * FROM cu_basic_data ")
    public List<CuBasicData> getBasicDataAll();

    /**
     * 获取cu_basic_data
     * @return
     */
    @Select(" SELECT * FROM cu_basic_data where job_num = #{account} ")
    public CuBasicData getBasicData(String account);

    /**
     * 添加 员工基础信息
     * @param cuBasicData
     * @return
     */
    @Insert(" INSERT INTO cu_basic_data VALUES (#{jobNum},#{userName},#{sex},#{birthday},#{nativePlace},#{nation},#{nationality},#{highestEdu},#{highestDegree},#{idType},#{idNum},#{enName},#{phone},#{phoneTemp},#{email},#{politicalStatus},#{contactTemp},#{contactPhoneTemp},#{maritalStatus},#{homeAddress},#{registeredAddress},#{salary},#{loginPhone}) ")
    public int addCuBasicData(CuBasicData cuBasicData);

    /**
     * 获取 个人信息
     * @param account
     * @return
     */
    @Select("SELECT wh.job_num,jic.company,jic.department,jic.station,jic.job,jic.rank,jic.base,jic.entry_date,jic.internship,jic.official_date,wh.in_begin_time,wh.in_end_time,wh.in_department,wh.in_station,jic.out_begin_time,jic.out_end_time,jic.out_company,jic.out_department,jic.out_station,jic.edu_begin_time,jic.edu_end_time,jic.school,jic.edu,jic.major,jic.edu_mode,jic.relation,jic.other_name,jic.other_sex,jic.other_birthday,jic.other_nationality,jic.other_address,jic.cert_name,jic.cert_level,jic.cert_time,jic.due_date,jic.appendix_type,jic.comments FROM (SELECT woh.out_begin_time,woh.out_end_time,woh.out_company,woh.out_department,woh.out_station,jib.job_num,jib.edu_begin_time,jib.edu_end_time,jib.school,jib.edu,jib.major,jib.edu_mode,jib.relation,jib.other_name,jib.other_sex,jib.other_birthday,jib.other_nationality,jib.other_address,jib.cert_name,jib.cert_level,jib.cert_time,jib.due_date,jib.appendix_type,jib.comments,jib.company,jib.department,jib.station,jib.job,jib.rank,jib.base,jib.entry_date,jib.internship,jib.official_date FROM (SELECT ei.edu_begin_time,ei.edu_end_time,ei.school,ei.edu,ei.major,ei.edu_mode,jia.job_num,jia.relation,jia.other_name,jia.other_sex,jia.other_birthday,jia.other_nationality,jia.other_address,jia.cert_name,jia.cert_level,jia.cert_time,jia.due_date,jia.appendix_type,jia.comments,jia.company,jia.department,jia.station,jia.job,jia.rank,jia.base,jia.entry_date,jia.internship,jia.official_date FROM (SELECT fm.relation,fm.other_name,fm.other_sex,fm.other_birthday,fm.other_nationality,fm.other_address,ji.job_num,ji.cert_name,ji.cert_level,ji.cert_time,ji.due_date,ji.appendix_type,ji.comments,ji.company,ji.department,ji.station,ji.job,ji.rank,ji.base,ji.entry_date,ji.internship,ji.official_date FROM (SELECT j.job_num,cs.cert_name,cs.cert_level,cs.cert_time,cs.due_date,cs.appendix_type,cs.comments,j.company,j.department,j.station,j.job,j.rank,j.base,j.entry_date,j.internship,j.official_date FROM cu_job_info AS j RIGHT JOIN cu_skill AS cs ON j.job_num = cs.job_num) AS ji RIGHT JOIN cu_family_members AS fm ON ji.job_num = fm.job_num) AS jia RIGHT JOIN cu_edu_info AS ei ON jia.job_num = ei.job_num) AS jib RIGHT JOIN cu_work_out_history AS woh ON jib.job_num = woh.job_num) AS jic RIGHT JOIN cu_work_history AS wh ON jic.job_num = wh.job_num WHERE wh.job_num = #{account}")
    public List<CuPersonalData> getPersonalData(@Param("account")String account);

    @Delete(" delete from moveinrecord where user_account = #{userAccount} and room_id = #{roomId} and book_time = #{bookTime} ")
    public int deleteMoveInRecord(@Param("account")String account);

    /**
     * 获取 男女比例
     * @return
     */
    @Select(" select t1.man,t2.woman from (select count(sex) as man from cu_basic_data where sex = 1) t1,(SELECT COUNT(sex) as woman FROM cu_basic_data WHERE sex = 0) t2 ")
    public AnSex getAnSex();

    /**
     * 获取员工能力图
     * @param account
     * @return
     */
    @Select(" select cba.user_name userName, ana.job_num jobNum, ana.communicate communicate, ana.administration administration, ana.team team, ana.develop develop, ana.efficiency efficiency from an_ability ana,cu_basic_data cba where ana.job_num = cba.job_num and ana.job_num = #{account} ")
    public AnAbility getAnAbility(@Param("account")String account);

    /**
     * 获取本科分布
     * @return
     */
    @Select(" select a.a a,b.b b, c.c c, d.d d, e.e e, f.f f from (select count(*) a from cu_basic_data where highest_edu = '中专') a, (select count(*) b from cu_basic_data where highest_edu = '大专') b, (select count(*) c from cu_basic_data where highest_edu = '本科') c,(SELECT COUNT(*) d FROM cu_basic_data WHERE highest_edu = '硕士') d,(SELECT COUNT(*) e FROM cu_basic_data WHERE highest_edu = '博士') e,(SELECT COUNT(*) f FROM cu_basic_data WHERE highest_edu = '博士后') f ")
    public AnEdu getAnEdu();

    /**
     * 获取所有公告
     * @return
     */
    @Select(" SELECT * FROM cu_notice ")
    public List<CuNotice> getCuNoticeAll();

}
