package com.jackson.androidassistkt.ktstudy


/*
* KotlinStudy  2020-11-13
* Copyright (c) 2020 KL Co.Ltd. All right reserved.
*
*/
/*
* class description here
* @author Jackson
* @version 1.0.0
* since 2020 11 13
*/

/**
 * kotlin中，所有的东西都是对象
 */

class KotlinStudyOne {

    /**
     *   基本类型：数字，字符，布尔值，数组，字符串
     *
     */


    /**
     *  数字,包括整型和浮点型
     */


    //对于整数，有四种不同大小的类型

    /**
     * Byte -- 8        -128- 127
     * Short -- 16       -32768-32767
     * int  -- 32
     * Long -- 64
     */

    val a_one = 1
    val a_londg_one = 1L
    val a_byte: Byte = 1

    // 浮点型
    /**
     * Float 32
     * Double 64
     */

    // 对于以小数点初始化的变量，编译器会推断为Double类型
    // 如果要显式指定为Float类型，请添加 f 或者 F 后缀
    val fu_one=3.14  // Double
    val fu_two=2.718f  // Float

    // kotlin中的数字没有隐式拓宽转换

}