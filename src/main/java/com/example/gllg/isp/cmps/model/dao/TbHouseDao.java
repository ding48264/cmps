package com.example.gllg.isp.cmps.model.dao;

import com.example.gllg.isp.cmps.model.entity.TbHouse;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbHouse)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public interface TbHouseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbHouse queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbHouse> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbHouse 实例对象
     * @return 对象列表
     */
    List<TbHouse> queryAll(TbHouse tbHouse);

    /**
     * 新增数据
     *
     * @param tbHouse 实例对象
     * @return 影响行数
     */
    int insert(TbHouse tbHouse);

    /**
     * 修改数据
     *
     * @param tbHouse 实例对象
     * @return 影响行数
     */
    int update(TbHouse tbHouse);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

}