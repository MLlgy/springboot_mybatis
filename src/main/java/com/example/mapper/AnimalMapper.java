package com.example.mapper;

import com.example.domain.Animal;

public interface AnimalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    int insert(Animal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    int insertSelective(Animal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    Animal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    int updateByPrimaryKeySelective(Animal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table animal
     *
     * @mbggenerated Thu Mar 16 18:19:08 CST 2017
     */
    int updateByPrimaryKey(Animal record);
}