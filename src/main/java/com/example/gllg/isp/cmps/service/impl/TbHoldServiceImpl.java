package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbHold;
import com.example.gllg.isp.cmps.entity.TbHouse;
import com.example.gllg.isp.cmps.mapper.TbHoldDao;
import com.example.gllg.isp.cmps.service.TbHoldService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbHold)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Service("tbHoldService")
public class TbHoldServiceImpl implements TbHoldService {
    @Resource
    private TbHoldDao tbHoldDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbHold queryById(Integer itemid) {
        return this.tbHoldDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbHold> queryAllByLimit(int offset, int limit) {
        return this.tbHoldDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbHold 实例对象
     * @return 实例对象
     */
    @Override
    public TbHold insert(TbHold tbHold) {
        this.tbHoldDao.insert(tbHold);
        return tbHold;
    }

    /**
     * 修改数据
     *
     * @param tbHold 实例对象
     * @return 实例对象
     */
    @Override
    public TbHold update(TbHold tbHold) {
        this.tbHoldDao.update(tbHold);
        return this.queryById(tbHold.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbHoldDao.deleteById(itemid) > 0;
    }

    @Override
    public List<TbHold> queryAllHold(TbHold tbHold,
                                    Integer pageNum,
                                     Integer pageSize) {
        return this.tbHoldDao.queryAllHold(tbHold,pageNum,pageSize);
    }

    @Override
    public Page<TbHold> queryAllHolds(TbHold tbHold, Integer pageNum, Integer pageSize) {
        return this.tbHoldDao.queryAlls(tbHold,pageNum,pageSize);
    }

    @Override
    public List<TbHold> queryMeb(String holdcode) {
        return this.tbHoldDao.queryMeb(holdcode);
    }

    @Override
    public List<TbHold> queryAllHoldOwn(TbHold tbHold, Integer pageNum, Integer pageSize) {
        return this.tbHoldDao.queryAllHoldOwn(tbHold,pageNum,pageSize);
    }


}