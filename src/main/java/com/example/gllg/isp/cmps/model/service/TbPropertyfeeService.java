package com.example.gllg.isp.cmps.model.service;

import com.example.gllg.isp.cmps.model.entity.TbPropertyfee;
import java.util.List;

/**
 * (TbPropertyfee)表服务接口
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public interface TbPropertyfeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbPropertyfee queryById(Integer itemid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbPropertyfee> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbPropertyfee 实例对象
     * @return 实例对象
     */
    TbPropertyfee insert(TbPropertyfee tbPropertyfee);

    /**
     * 修改数据
     *
     * @param tbPropertyfee 实例对象
     * @return 实例对象
     */
    TbPropertyfee update(TbPropertyfee tbPropertyfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer itemid);

}