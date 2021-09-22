package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbUptown;
import com.example.gllg.isp.cmps.mapper.TbUptownDao;
import com.example.gllg.isp.cmps.service.TbUptownService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUptown)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:05:29
 */
@Service("tbUptownService")
public class TbUptownServiceImpl implements TbUptownService {
    @Resource
    private TbUptownDao tbUptownDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbUptown queryById(Integer itemid) {
        return this.tbUptownDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbUptown> queryAllByLimit(int offset, int limit) {
        return this.tbUptownDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbUptown 实例对象
     * @return 实例对象
     */
    @Override
    public TbUptown insert(TbUptown tbUptown) {
        this.tbUptownDao.insert(tbUptown);
        return tbUptown;
    }

    /**
     * 修改数据
     *
     * @param tbUptown 实例对象
     * @return 实例对象
     */
    @Override
    public TbUptown update(TbUptown tbUptown) {
        this.tbUptownDao.update(tbUptown);
        return this.queryById(tbUptown.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbUptownDao.deleteById(itemid) > 0;
    }

    @Override
    public List<TbUptown> queryAllUptown() {
        return this.tbUptownDao.queryAllUptown();
    }

    @Override
    public TbUptown selectByName(String uptownName) {
        return  this.tbUptownDao.selectByName(uptownName);
    }
}