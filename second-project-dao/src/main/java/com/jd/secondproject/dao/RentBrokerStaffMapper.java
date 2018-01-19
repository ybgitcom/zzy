package com.jd.secondproject.dao;

import com.jd.secondproject.domain.RentBrokerStaff;
import com.jd.secondproject.domain.RentBrokerStaffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RentBrokerStaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int insert(RentBrokerStaff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int insertSelective(RentBrokerStaff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    List<RentBrokerStaff> selectByExample(RentBrokerStaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    RentBrokerStaff selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RentBrokerStaff record, @Param("example") RentBrokerStaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RentBrokerStaff record, @Param("example") RentBrokerStaffExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RentBrokerStaff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rent_broker_staff
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RentBrokerStaff record);
}