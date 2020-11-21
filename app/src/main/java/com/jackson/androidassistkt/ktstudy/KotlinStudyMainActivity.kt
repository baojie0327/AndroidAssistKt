package com.jackson.androidassistkt.ktstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jackson.androidassistkt.R
import com.jackson.androidassistkt.ktstudy.interfacestudy.FunInterface

class KotlinStudyMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_study_main)


        //对于函数式接口，可以通过lambda表达式实现SAM转换

        // 使用匿名内部类的形式
        var name=object :FunInterface{
            override fun invoke(name: String): String {
                TODO("Not yet implemented")
            }

        }

        // 使用lambda表达式
        var name1= FunInterface { it+"" }

        //  val sum:(INt,Int)->Int ={x:Int,y:Int -> x+y}







    }


}