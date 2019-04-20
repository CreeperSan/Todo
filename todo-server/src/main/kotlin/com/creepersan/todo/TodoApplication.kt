package com.creepersan.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
	// 检查数据库并建表

	// 运行程序
	runApplication<TodoApplication>(*args)
}
