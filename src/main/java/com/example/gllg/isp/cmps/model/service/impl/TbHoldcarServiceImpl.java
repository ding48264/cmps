package com.example.gllg.isp.cmps.model.service.impl;

import com.example.gllg.isp.cmps.model.entity.TbHoldcar;
import com.example.gllg.isp.cmps.model.dao.TbHoldcarDao;
import com.example.gllg.isp.cmps.model.service.TbHoldcarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbHoldcar)表服务实现类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@Service("tbHoldcarService")
public class TbHoldcarServiceImpl implements TbHoldcarService {
    @Resource
    private TbHoldcarDao tbHoldcarDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbHoldcar queryById(Integer itemid) {
        return this.tbHoldcarDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbHoldcar> queryAllByLimit(int offset, int limit) {
        return this.tbHoldcarDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbHoldcar 实例对象
     * @return 实例对象
     */
    @Override
    public TbHoldcar insert(TbHoldcar tbHoldcar) {
        this.tbHoldcarDao.insert(tbHoldcar);
        return tbHoldcar;
    }

    /**
     * 修改数据
     *
     * @param tbHoldcar 实例对象
     * @return 实例对象
     */
    @Override
    public TbHoldcar update(TbHoldcar tbHoldcar) {
        this.tbHoldcarDao.update(tbHoldcar);
        return this.queryById(tbHoldcar.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbHoldcarDao.deleteById(itemid) > 0;
    }
}