package com.credan.webapi.core.dao.mapper.sys;


import java.util.List;
import java.util.Map;

import com.credan.webapi.core.dao.entity.sys.SysDictionary;

public interface SysDictionaryDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    int insert(SysDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    int insertSelective(SysDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    SysDictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    int updateByPrimaryKeySelective(SysDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated Tue Nov 08 21:47:32 CST 2016
     */
    int updateByPrimaryKey(SysDictionary record);
    
    List<SysDictionary> findListByDictType(String dictType);
    
    SysDictionary findOneByDictTypeAndDictCode(Map<String, Object> map);
    
}