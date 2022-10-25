package com.example.coco.mapper;

import com.example.coco.entity.Demo;
import com.example.coco.entity.DemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    long countByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int deleteByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int insert(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int insertSelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    List<Demo> selectByExample(DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    Demo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int updateByPrimaryKeySelective(Demo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo
     *
     * @mbg.generated Wed Oct 26 01:45:57 JST 2022
     */
    int updateByPrimaryKey(Demo record);
}