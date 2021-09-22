package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbElectfee;
import com.example.gllg.isp.cmps.mapper.TbElectfeeDao;
import com.example.gllg.isp.cmps.service.TbElectfeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbElectfee)表服务实现类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Service("tbElectfeeService")
public class TbElectfeeServiceImpl implements TbElectfeeService {
    @Resource
    private TbElectfeeDao tbElectfeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbElectfee queryById(Integer itemid) {
        return this.tbElectfeeDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbElectfee> queryAllByLimit(int offset, int limit) {
        return this.tbElectfeeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbElectfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbElectfee insert(TbElectfee tbElectfee) {
        this.tbElectfeeDao.insert(tbElectfee);
        return tbElectfee;
    }

    /**
     * 修改数据
     *
     * @param tbElectfee 实例对象
     * @return 实例对象
     */
    @Override
    public TbElectfee update(TbElectfee tbElectfee) {
        this.tbElectfeeDao.update(tbElectfee);
        return this.queryById(tbElectfee.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbElectfeeDao.deleteById(itemid) > 0;
    }

    @Override
    public List<TbElectfee> queryAllElectFee(Integer pageNum, Integer pageSize) {
        return this.tbElectfeeDao.queryAllElectFee(pageNum,pageSize);
    }
}