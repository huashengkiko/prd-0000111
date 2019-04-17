package csdws.dasd.dsfcsdfe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csdws.dasd.dsfcsdfe.domain.eo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  UsersMapper extends BaseMapper<Users> {

    List<Users> findList(@Param("eo")  Users eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}