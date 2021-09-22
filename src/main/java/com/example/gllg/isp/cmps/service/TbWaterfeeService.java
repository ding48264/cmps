package com.example.gllg.isp.cmps.service;

import com.example.gllg.isp.cmps.entity.TbWaterfee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbWaterfee)表服务接口
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbWaterfeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbWaterfee queryById(Integer itemid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbWaterfee> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbWaterfee 实例对象
     * @return 实例对象
     */
    TbWaterfee insert(TbWaterfee tbWaterfee);

    /**
     * 修改数据
     *
     * @param tbWaterfee 实例对象
     * @return 实例对象
     */
    TbWaterfee update(TbWaterfee tbWaterfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer itemid);

    List<TbWaterfee> queryAllWaterFee(Integer pageNum,Integer pageSize);
}