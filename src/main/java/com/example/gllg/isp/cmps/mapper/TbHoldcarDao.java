package com.example.gllg.isp.cmps.mapper;

import com.example.gllg.isp.cmps.entity.TbHoldcar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbHoldcar)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbHoldcarDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbHoldcar queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbHoldcar> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbHoldcar 实例对象
     * @return 对象列表
     */
    List<TbHoldcar> queryAll(TbHoldcar tbHoldcar);

    /**
     * 新增数据
     *
     * @param tbHoldcar 实例对象
     * @return 影响行数
     */
    int insert(TbHoldcar tbHoldcar);

    /**
     * 修改数据
     *
     * @param tbHoldcar 实例对象
     * @return 影响行数
     */
    int update(TbHoldcar tbHoldcar);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

}