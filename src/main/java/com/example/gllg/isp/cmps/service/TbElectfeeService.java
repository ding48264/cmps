package com.example.gllg.isp.cmps.service;

import com.example.gllg.isp.cmps.entity.TbElectfee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbElectfee)表服务接口
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Mapper
public interface TbElectfeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    TbElectfee queryById(Integer itemid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbElectfee> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbElectfee 实例对象
     * @return 实例对象
     */
    TbElectfee insert(TbElectfee tbElectfee);

    /**
     * 修改数据
     *
     * @param tbElectfee 实例对象
     * @return 实例对象
     */
    TbElectfee update(TbElectfee tbElectfee);

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer itemid);

}