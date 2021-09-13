package com.example.gllg.isp.cmps.service.impl;

import com.example.gllg.isp.cmps.entity.TbAdmin;
import com.example.gllg.isp.cmps.dao.TbAdminDao;
import com.example.gllg.isp.cmps.service.TbAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAdmin)表服务实现类
 *
 * @author makejava
 * @since 2021-09-13 10:59:04
 */
@Service("tbAdminService")
public class TbAdminServiceImpl implements TbAdminService {
    @Resource
    private TbAdminDao tbAdminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param itemid 主键
     * @return 实例对象
     */
    @Override
    public TbAdmin queryById(Integer itemid) {
        return this.tbAdminDao.queryById(itemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbAdmin> queryAllByLimit(int offset, int limit) {
        return this.tbAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public TbAdmin insert(TbAdmin tbAdmin) {
        this.tbAdminDao.insert(tbAdmin);
        return tbAdmin;
    }

    /**
     * 修改数据
     *
     * @param tbAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public TbAdmin update(TbAdmin tbAdmin) {
        this.tbAdminDao.update(tbAdmin);
        return this.queryById(tbAdmin.getItemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param itemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer itemid) {
        return this.tbAdminDao.deleteById(itemid) > 0;
    }
}