package csdws.dasd.dsfcsdfe.service;

import csdws.dasd.dsfcsdfe.domain.eo.Users;
import csdws.dasd.dsfcsdfe.domain.dto.UsersDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * users
 */
public interface UsersService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<Users> findPage(Users eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<Users> findAll(Users eo);

    /**
      获取详情
    * @return
    */
    Users detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,Users eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(Users eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(Integer  pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(Integer ...pk);
}