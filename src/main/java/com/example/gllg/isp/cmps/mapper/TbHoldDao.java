package com.example.gllg.isp.cmps.mapper;

import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbHouse;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbHold)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbHoldDao {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbHold queryById(Integer itemid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbHold> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbHold 实例对象
     * @return 对象列表
     */
    List<TbHold> queryAll(TbHold tbHold);

    /**
     * 新增数据
     *
     * @param tbHold 实例对象
     * @return 影响行数
     */
    int insert(TbHold tbHold);

    /**
     * 修改数据
     *
     * @param tbHold 实例对象
     * @return 影响行数
     */
    int update(TbHold tbHold);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 影响行数
     */
    int deleteById(Integer itemid);

    List<TbHold> queryAllHold(@Param("tbHold") TbHold tbHold,
                                @Param("pageNum") Integer pageNum,
                              @Param("pageSize") Integer pageSize);


    Page<TbHold> queryAlls(@Param("tbHold") TbHold tbHold,
                           @Param("pageNum") Integer pageNum,
                           @Param("pageSize") Integer pageSize);

    List<TbHold> queryMeb(@Param("holdcode") String holdcode);

    List<TbHold> queryAllHoldOwn(@Param("tbHold") TbHold tbHold,
                                 @Param("pageNum") Integer pageNum,
                                 @Param("pageSize") Integer pageSize);
}