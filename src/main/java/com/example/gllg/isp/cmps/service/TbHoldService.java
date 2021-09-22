package com.example.gllg.isp.cmps.service;

import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbHouse;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbHold)表服务接口
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbHoldService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbHold queryById(Integer itemid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbHold> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbHold 实例对象
     * @return 实例对象
     */
    TbHold insert(TbHold tbHold);

    /**
     * 修改数据
     *
     * @param tbHold 实例对象
     * @return 实例对象
     */
    TbHold update(TbHold tbHold);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer itemid);

    List<TbHold> queryAllHold(TbHold tbHold,
                                Integer pageNum,
                              Integer pageSize);


    Page<TbHold> queryAllHolds(TbHold tbHold, Integer pageNum, Integer pageSize);

    List<TbHold> queryMeb(String holdcode);

    List<TbHold> queryAllHoldOwn(TbHold tbHold, Integer pageNum, Integer pageSize);
}