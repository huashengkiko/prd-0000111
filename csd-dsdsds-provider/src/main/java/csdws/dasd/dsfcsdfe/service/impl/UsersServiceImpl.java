package csdws.dasd.dsfcsdfe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import csdws.dasd.dsfcsdfe.domain.eo.Users;
import csdws.dasd.dsfcsdfe.service.UsersService;
import csdws.dasd.dsfcsdfe.mapper.UsersMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class UsersServiceImpl implements UsersService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageBean<Users> findPage(Users eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Users> pages =  usersMapper.findList(eo);
        return new PageBean<Users>(pages);
    }

    @Override
    public List<Users> findAll(Users eo) {
        List<Users> list = usersMapper.findList(eo);
        return list;
    }
    @Override
    public Users detail(Integer  pk) {
        Users eo = usersMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,Users eo) {
        Users old = usersMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = usersMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(Users eo) {
        int result = usersMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = usersMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = usersMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}