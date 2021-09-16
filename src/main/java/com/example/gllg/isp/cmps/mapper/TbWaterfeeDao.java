package com.example.gllg.isp.cmps.mapper;

import com.example.gllg.isp.cmps.entity.TbWaterfee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbWaterfee)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbWaterfeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbWaterfee queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbWaterfee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbWaterfee 实例对象
     * @return 对象列表
     */
    List<TbWaterfee> queryAll(TbWaterfee tbWaterfee);

    /**
     * 新增数据
     *
     * @param tbWaterfee 实例对象
     * @return 影响行数
     */
    int insert(TbWaterfee tbWaterfee);

    /**
     * 修改数据
     *
     * @param tbWaterfee 实例对象
     * @return 影响行数
     */
    int update(TbWaterfee tbWaterfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

}