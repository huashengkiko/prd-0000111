package csdws.dasd.dsfcsdfe.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc users
* @author admin
*/
//@ApiModel(description = "users")
public class Users{

// @ApiModelProperty(value = "")
    @TableId
    @TableField(value = "`id`")
    private Integer  id;
// @ApiModelProperty(value = "")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_by`")
    private Date updateBy;
// @ApiModelProperty(value = "")
    @TableField(value = "`client_name`")
    private String clientName;
// @ApiModelProperty(value = "")
    @TableField(value = "`project_number`")
    private Integer  projectNumber;
// @ApiModelProperty(value = "")
    @TableField(value = "`client_secret`")
    private String clientSecret;
// @ApiModelProperty(value = "")
    @TableField(value = "`category`")
    private String category;
// @ApiModelProperty(value = "")
    @TableField(value = "`current_phase`")
    private String currentPhase;
// @ApiModelProperty(value = "")
    @TableField(value = "`accumulate_number`")
    private Integer  accumulateNumber;

    public void setId(Integer  id){
    this.id = id;
    }

    public Integer  getId(){
    return this.id;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setUpdateBy(Date updateBy){
    this.updateBy = updateBy;
    }

    public Date getUpdateBy(){
    return this.updateBy;
    }

    public void setClientName(String clientName){
    this.clientName = clientName;
    }

    public String getClientName(){
    return this.clientName;
    }

    public void setProjectNumber(Integer  projectNumber){
    this.projectNumber = projectNumber;
    }

    public Integer  getProjectNumber(){
    return this.projectNumber;
    }

    public void setClientSecret(String clientSecret){
    this.clientSecret = clientSecret;
    }

    public String getClientSecret(){
    return this.clientSecret;
    }

    public void setCategory(String category){
    this.category = category;
    }

    public String getCategory(){
    return this.category;
    }

    public void setCurrentPhase(String currentPhase){
    this.currentPhase = currentPhase;
    }

    public String getCurrentPhase(){
    return this.currentPhase;
    }

    public void setAccumulateNumber(Integer  accumulateNumber){
    this.accumulateNumber = accumulateNumber;
    }

    public Integer  getAccumulateNumber(){
    return this.accumulateNumber;
    }


}

