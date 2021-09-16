package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbWaterfee;
import com.example.gllg.isp.cmps.mapper.TbWaterfeeDao;
import com.example.gllg.isp.cmps.service.TbWaterfeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbWaterfee)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Service("tbWaterfeeService")
public class TbWaterfeeServiceImpl implements TbWaterfeeService {
    @Resource
    private TbWaterfeeDao tbWaterfeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbWaterfee queryById(Integer itemid) {
        return this.tbWaterfeeDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbWaterfee> queryAllByLimit(int offset, int limit) {
        return this.tbWaterfeeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbWaterfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbWaterfee insert(TbWaterfee tbWaterfee) {
        this.tbWaterfeeDao.insert(tbWaterfee);
        return tbWaterfee;
    }

    /**
     * 修改数据
     *
     * @param tbWaterfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbWaterfee update(TbWaterfee tbWaterfee) {
        this.tbWaterfeeDao.update(tbWaterfee);
        return this.queryById(tbWaterfee.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbWaterfeeDao.deleteById(itemid) > 0;
    }
}