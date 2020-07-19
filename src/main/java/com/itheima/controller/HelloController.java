package com.itheima.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/add")
    @PreAuthorize("hasAuthority('add')")//调用此方法要求当前用户必须具有add权限
    public String add(){
        System.out.println("add...");
        return "success";
    }

    @RequestMapping("/delete")
    @PreAuthorize("hasRole('ROLE_ADMIN')")//调用此方法要求当前用户必须具有ROLE_ADMIN角色
    public String delete(){
        System.out.println("delete...");
        System.out.println("Testing new branch in GitHub");
        System.out.println("主干在第22行添加");
        System.out.println("分支在第22行添加");
        System.out.println("在线创建文件");
        return "success";
    }
}
