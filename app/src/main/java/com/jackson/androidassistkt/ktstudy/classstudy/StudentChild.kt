package com.jackson.androidassistkt.ktstudy.classstudy

import com.jackson.androidassistkt.ktstudy.classstudy.Student


/*
* StudentChild  2020-11-19
* Copyright (c) 2020 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2020 11 19
*/

// 如果派生类有一个主构造函数，其基类必须用派生类主构造函数的参数就地初始化
class StudentChild(name:String,age:Int):
    Student(name,age) {

    // 覆盖属性
    override val firstName="James"

    // 覆盖方法
    override fun draw(){

    }

    // 派生类初始化顺序，先完成其基类的初始化

    // 使用super调用其超类的函数与属性
    val childName=super.getMyName()


}