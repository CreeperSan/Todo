package com.creepersan.todo.controller

import com.creepersan.todo.bean.TestBean
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController{

    @RequestMapping("/")
    fun index(@RequestParam(value = "name", defaultValue = "Unnamed") name:String): TestBean {
        return TestBean(System.currentTimeMillis(), name)
    }

}
