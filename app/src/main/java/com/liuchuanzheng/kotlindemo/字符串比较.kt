package com.liuchuanzheng.kotlindemo

/**
 * @author 刘传政
 * @date 2018/9/26 0026 15:11
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
fun main(args: Array<String>) {
    val str1 = "abc"
    val str2 = String(charArrayOf('a', 'b', 'c'))
    //比较值
    println(str1.equals(str2))
    //比较值
    println(str1 == str2)
    //比较地址值
    println(str1 === str2)
}
