package com.jackson.androidassistkt.ktstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jackson.androidassistkt.R
import com.jackson.androidassistkt.ktstudy.classstudy.Student
import com.jackson.androidassistkt.ktstudy.fanxing.Teacher
import com.jackson.androidassistkt.ktstudy.interfacestudy.FunInterface

class KotlinStudyMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_study_main)


        //对于函数式接口，可以通过lambda表达式实现SAM转换

        // 使用匿名内部类的形式
        var name = object : FunInterface {
            override fun invoke(name: String, age: Int): String {
                TODO("Not yet implemented")
            }

        }

        // 使用lambda表达式
        var name1 = FunInterface { name, age -> TODO("Not yet implemented") }

        //  val sum:(INt,Int)->Int ={x:Int,y:Int -> x+y}
        // val sum={x:Int,y:Int -> x+y}
        // 使用lambda表达式可以替代手动创建实现函数式接口的类

        val funInter = { name: String, age: Int -> name + age + "" }
        var name2 = FunInterface(funInter)
        var name3 = FunInterface { name, age -> name + "" }


        // 扩展函数
        fun TextView.isBold() = this.apply {
            paint.isFakeBoldText = true
        }

        fun Student.printName(){
            println(firstName)
        }


        // 泛型
        var teacher=Teacher(1)
        var teacher1=Teacher("Jack")


    }


}