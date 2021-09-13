package com.example.gllg.isp.cmps.model.service.impl;

import com.example.gllg.isp.cmps.model.entity.TbHouse;
import com.example.gllg.isp.cmps.model.dao.TbHouseDao;
import com.example.gllg.isp.cmps.model.service.TbHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbHouse)表服务实现类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
@Service("tbHouseService")
public class TbHouseServiceImpl implements TbHouseService {
    @Resource
    private TbHouseDao tbHouseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbHouse queryById(Integer itemid) {
        return this.tbHouseDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbHouse> queryAllByLimit(int offset, int limit) {
        return this.tbHouseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbHouse 实例对象
     * @return 实例对象
     */
    @Override
    public TbHouse insert(TbHouse tbHouse) {
        this.tbHouseDao.insert(tbHouse);
        return tbHouse;
    }

    /**
     * 修改数据
     *
     * @param tbHouse 实例对象
     * @return 实例对象
     */
    @Override
    public TbHouse update(TbHouse tbHouse) {
        this.tbHouseDao.update(tbHouse);
        return this.queryById(tbHouse.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbHouseDao.deleteById(itemid) > 0;
    }
}