package com.jackson.androidassistkt.ktstudy.classstudy

import com.jackson.androidassistkt.ktstudy.classstudy.Student2


/*
* Student2Child  2020-11-19
* Copyright (c) 2020 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2020 11 19
*/
class Student2Child : Student2 {

    // 如果派生类没有主构造函数，那么每个次构造函数必须使用super关键字初始化其基类型，或者委托给另一个构造函数
    constructor(name:String):super(name)

    constructor(name:String,age:Int):super(name,age)

}