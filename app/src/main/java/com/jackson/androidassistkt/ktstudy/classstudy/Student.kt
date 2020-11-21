package com.jackson.androidassistkt.ktstudy.classstudy

import java.util.*


/*
* Student  2020-11-19
* Copyright (c) 2020 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2020 11 19
*/

// 一个类可以有一个主构造函数以及一个或多个次构造函数
// 如果主构造函数没有任何注解或者可见性修饰符，可以省略constructor关键字

// 默认情况下，kotlin类是final的，它们不会被继承，要使一个类可以继承，用open关键字标记它
// 如果派生类有一个主构造函数，其基类必须用派生类主构造函数的参数就地初始化
open class Student(var name: String, var age: Int) {

    // 覆盖属性
    open val firstName: String = "Jackson"

    // 延迟初始化
    lateinit var lazyName: String


    // 主构造函数不能放任何代码，初始化的代码可以放到以 init关键字作为前缀的初始化块
    // 初始化块中的代码实际上会成为主构造函数的一部分
    // 所有的初始化块和属性，初始化器中的代码都会在次构造函数之前执行。
    init {
        println("name==$name")
    }

    // 前缀constructor声明次构造函数
    // 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数
    //可以直接委托或者通过别的次构造函数间接委托
    constructor(name: String, age: Int, idCard: String) : this(name, age) {

    }


    // 覆盖方法
    open fun draw() {

    }

    // 定义一个方法
    fun getMyName(): String {
        return "my name is:$name"
    }


}