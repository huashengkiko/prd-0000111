package csdws.dasd.dsfcsdfe.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import csdws.dasd.dsfcsdfe.service.UsersService;
import csdws.dasd.dsfcsdfe.domain.eo.Users;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/users", description = "$desc")
@RestController
@RequestMapping("/api/v1/userss")
public class  UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(Users eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(usersService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(Users eo) {
        return new Payload(usersService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(usersService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改Users")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody Users eo) {
     eo.setId(pk);
     return new Payload(usersService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建Users", notes = "创建Users")
    public Payload create(@RequestBody Users eo) {
        return new Payload(usersService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除Users", notes = "根据id删除Users")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(usersService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除Users", notes = "根据id批量删除Users")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(usersService.delete(ids));
    }

}