package com.jackson.androidassistkt.ktstudy.classstudy


/*
* StudentOne  2020-11-19
* Copyright (c) 2020 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2020 11 19
*/

// 可以通过加 var 或 val，实现属性的声明以及从主构造函数初始化属性
class StudentOne(var name: String, var age: Int ){


    fun getMyName(): String {
        return "my name is:$name"
    }


}