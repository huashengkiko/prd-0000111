package csdws.dasd.dsfcsdfe.domain.dto;

import csdws.dasd.dsfcsdfe.domain.eo.Users;
import java.util.Collection;
import java.util.List;

/**
* @desc users
* @author admin
*/
public class UsersDto extends Users{

public UsersDto(){};

public UsersDto(Users eo) {
    this.setId(eo.getId());
    this.setName(eo.getName());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdateBy(eo.getUpdateBy());
    this.setClientName(eo.getClientName());
    this.setProjectNumber(eo.getProjectNumber());
    this.setClientSecret(eo.getClientSecret());
    this.setCategory(eo.getCategory());
    this.setCurrentPhase(eo.getCurrentPhase());
    this.setAccumulateNumber(eo.getAccumulateNumber());
}
}

