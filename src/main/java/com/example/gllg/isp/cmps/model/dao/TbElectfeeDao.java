package com.example.gllg.isp.cmps.model.dao;

import com.example.gllg.isp.cmps.model.entity.TbElectfee;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbElectfee)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-13 10:59:07
 */
public interface TbElectfeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbElectfee queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbElectfee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbElectfee 实例对象
     * @return 对象列表
     */
    List<TbElectfee> queryAll(TbElectfee tbElectfee);

    /**
     * 新增数据
     *
     * @param tbElectfee 实例对象
     * @return 影响行数
     */
    int insert(TbElectfee tbElectfee);

    /**
     * 修改数据
     *
     * @param tbElectfee 实例对象
     * @return 影响行数
     */
    int update(TbElectfee tbElectfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

}