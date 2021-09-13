package com.example.gllg.isp.cmps.model.dao;

import com.example.gllg.isp.cmps.model.entity.TbGasfee;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbGasfee)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public interface TbGasfeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbGasfee queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbGasfee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbGasfee 实例对象
     * @return 对象列表
     */
    List<TbGasfee> queryAll(TbGasfee tbGasfee);

    /**
     * 新增数据
     *
     * @param tbGasfee 实例对象
     * @return 影响行数
     */
    int insert(TbGasfee tbGasfee);

    /**
     * 修改数据
     *
     * @param tbGasfee 实例对象
     * @return 影响行数
     */
    int update(TbGasfee tbGasfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

}