package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbPropertyfee;
import com.example.gllg.isp.cmps.mapper.TbPropertyfeeDao;
import com.example.gllg.isp.cmps.service.TbPropertyfeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbPropertyfee)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Service("tbPropertyfeeService")
public class TbPropertyfeeServiceImpl implements TbPropertyfeeService {
    @Resource
    private TbPropertyfeeDao tbPropertyfeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbPropertyfee queryById(Integer itemid) {
        return this.tbPropertyfeeDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbPropertyfee> queryAllByLimit(int offset, int limit) {
        return this.tbPropertyfeeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbPropertyfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbPropertyfee insert(TbPropertyfee tbPropertyfee) {
        this.tbPropertyfeeDao.insert(tbPropertyfee);
        return tbPropertyfee;
    }

    /**
     * 修改数据
     *
     * @param tbPropertyfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbPropertyfee update(TbPropertyfee tbPropertyfee) {
        this.tbPropertyfeeDao.update(tbPropertyfee);
        return this.queryById(tbPropertyfee.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbPropertyfeeDao.deleteById(itemid) > 0;
    }
}