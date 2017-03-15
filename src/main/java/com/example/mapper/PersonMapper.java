package com.example.mapper;

import com.example.domain.Person;

import java.util.List;

public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    Person selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Wed Mar 15 14:57:45 CST 2017
     */
    int updateByPrimaryKey(Person record);

    List<Person> getAllPerson();
}