package com.jackson.androidassistkt.ktstudy.interfacestudy

/**
 * 函数式接口,只有一个抽象方法的接口
 * 可以有多个非抽象成员，但 只能有一个抽象成员
 *
 * 可以用fun声明一个函数式接口
 */
fun interface FunInterface {

    fun invoke(name:String,age:Int):String

}