package com.example.gllg.isp.cmps.model.service.impl;

import com.example.gllg.isp.cmps.model.entity.TbParkinglot;
import com.example.gllg.isp.cmps.model.dao.TbParkinglotDao;
import com.example.gllg.isp.cmps.model.service.TbParkinglotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbParkinglot)表服务实现类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@Service("tbParkinglotService")
public class TbParkinglotServiceImpl implements TbParkinglotService {
    @Resource
    private TbParkinglotDao tbParkinglotDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbParkinglot queryById(Integer itemid) {
        return this.tbParkinglotDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbParkinglot> queryAllByLimit(int offset, int limit) {
        return this.tbParkinglotDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbParkinglot 实例对象
     * @return 实例对象
     */
    @Override
    public TbParkinglot insert(TbParkinglot tbParkinglot) {
        this.tbParkinglotDao.insert(tbParkinglot);
        return tbParkinglot;
    }

    /**
     * 修改数据
     *
     * @param tbParkinglot 实例对象
     * @return 实例对象
     */
    @Override
    public TbParkinglot update(TbParkinglot tbParkinglot) {
        this.tbParkinglotDao.update(tbParkinglot);
        return this.queryById(tbParkinglot.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbParkinglotDao.deleteById(itemid) > 0;
    }
}