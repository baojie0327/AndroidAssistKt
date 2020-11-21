package com.jackson.androidassistkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jackson.androidassistkt.databinding.ActivityMainBinding
import com.jackson.androidassistkt.ktstudy.KotlinStudyMainActivity

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val onClick:(v:View?)->Unit={v:View?->{}}

        // 传入一个函数，参数为v，返回值为void，函数体放在{}
        binding.tvKtStudy.setOnClickListener{v:View?->{}}

        binding.tvKtStudy.setOnClickListener { startActivity(Intent(this,
            KotlinStudyMainActivity::class.java)) }

        binding.tvKtStudy.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.tv_kt_study->startActivity(Intent(this,
                KotlinStudyMainActivity::class.java))
        }
    }
}