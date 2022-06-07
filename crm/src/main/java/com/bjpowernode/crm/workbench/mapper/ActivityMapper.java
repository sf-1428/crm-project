package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.Activity;
import org.springframework.jdbc.support.nativejdbc.OracleJdbc4NativeJdbcExtractor;

import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Apr 27 19:24:11 GMT+08:00 2022
     */
    int deleteByPrimaryKey(String id);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Apr 27 19:24:11 GMT+08:00 2022
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Apr 27 19:24:11 GMT+08:00 2022
     */
    Activity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Apr 27 19:24:11 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity
     *
     * @mbggenerated Wed Apr 27 19:24:11 GMT+08:00 2022
     */
    int updateByPrimaryKey(Activity record);

    /**
     * 保存创建的市场活动
     */
    int insertActivity(Activity activity);

    /**
     * 根据条件分页查询市场活动的列表
     * @param map
     * @return
     */
    List<Activity> selectActivityByConditionForPage(Map<String,Object> map);


    /**
     * 根据条件查询市场活动的总条数
     * @param map
     * @return
     */
    int selectCountOfActivityByCondition(Map<String,Object> map);

    int deleteActivityByIds(String[] ids);

    /**
     * 根据id查询市场活动的信息
     * @param id
     * @return
     */
    Activity selectActivityById(String id);

    /**
     * 保存修改的市场活动
     * @param activity
     * @return
     */
    int updateActivity(Activity activity);

    /**
     * 查询所有的市场活动
     * @return
     */
    List<Activity> selectAllActivitys();

    /**
     * 批量保存创建的市场活动
     * @param activityList
     * @return
     */
    int insertActivityByList(List<Activity> activityList);

    /**
     * 根据id查询市场活动的明细信息
     * @param id
     * @return
     */
    Activity selectActivityForDetailById(String id);
}