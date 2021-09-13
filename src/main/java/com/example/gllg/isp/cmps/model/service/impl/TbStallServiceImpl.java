package com.example.gllg.isp.cmps.model.service.impl;

import com.example.gllg.isp.cmps.model.entity.TbStall;
import com.example.gllg.isp.cmps.model.dao.TbStallDao;
import com.example.gllg.isp.cmps.model.service.TbStallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbStall)表服务实现类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@Service("tbStallService")
public class TbStallServiceImpl implements TbStallService {
    @Resource
    private TbStallDao tbStallDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbStall queryById(Integer itemid) {
        return this.tbStallDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbStall> queryAllByLimit(int offset, int limit) {
        return this.tbStallDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbStall 实例对象
     * @return 实例对象
     */
    @Override
    public TbStall insert(TbStall tbStall) {
        this.tbStallDao.insert(tbStall);
        return tbStall;
    }

    /**
     * 修改数据
     *
     * @param tbStall 实例对象
     * @return 实例对象
     */
    @Override
    public TbStall update(TbStall tbStall) {
        this.tbStallDao.update(tbStall);
        return this.queryById(tbStall.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbStallDao.deleteById(itemid) > 0;
    }
}