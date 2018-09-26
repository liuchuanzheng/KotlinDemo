package com.liuchuanzheng.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author 刘传政
 * @date 2018/9/26 0026 11:19
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
class KotlinActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = getText()

    }
    fun getText():String{
        return "我来自kotlin"
    }
}