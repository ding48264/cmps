package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbGasfee;
import com.example.gllg.isp.cmps.mapper.TbGasfeeDao;
import com.example.gllg.isp.cmps.service.TbGasfeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbGasfee)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Service("tbGasfeeService")
public class TbGasfeeServiceImpl implements TbGasfeeService {
    @Resource
    private TbGasfeeDao tbGasfeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbGasfee queryById(Integer itemid) {
        return this.tbGasfeeDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbGasfee> queryAllByLimit(int offset, int limit) {
        return this.tbGasfeeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbGasfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbGasfee insert(TbGasfee tbGasfee) {
        this.tbGasfeeDao.insert(tbGasfee);
        return tbGasfee;
    }

    /**
     * 修改数据
     *
     * @param tbGasfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbGasfee update(TbGasfee tbGasfee) {
        this.tbGasfeeDao.update(tbGasfee);
        return this.queryById(tbGasfee.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbGasfeeDao.deleteById(itemid) > 0;
    }
}