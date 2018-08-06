package com.example.fanjianxiang.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val a: Int = 1
    val b = 1
    var x = 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "text"

        println("Hello world")
        Greeter("World").greet()
        val sum = sum(1, 2)

        println("sum--->println" + sum)
        Log.d("sum--->Log", sum.toString())

        sum3(30, 1)
        sum4(40, 40)

        vars(1, 2, 3, 4, 5)

        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }//lambda(匿名函数)
        println(sumLambda(1, 2))

        x += 1
        println("x-->" + x)

        val c: Int
        c = 1
        println("c-->" + c)


//      $ 表示一个变量名或者变量值
//      $varName 表示变量值
//      ${varName.fun()} 表示变量的方法返回值:
        var a = 1
        var s1 = "a is $a"
        println("s1-->" + s1)

        a = 2
        val s2 = "${s1.replace("is", "was")},but now is $a"

        println("s2-->" + s2)

        var age: String? = "23"//类型后面加?表示可为空
        val ages0 = age!!.toInt()//抛出空指针异常
        val ages1 = age?.toInt()//不做处理返回 null
        val ages2 = age?.toInt() ?: -1//age为空返回-1
        println("ages0-->" + ages0)
        println("ages1-->" + ages1)
        println("ages2-->" + ages2)

        val stringLength = getStringLength(1)
        println("stringLength-->" + stringLength)


        for (i in 1..4)// 输出“1234”
            println(i)

        if (c in 1..10)// 等同于 1 <= i && i <= 10
            println("c-->" + c)

        for (i in 1..10 step 2)//输出“13”,中间隔一个输出
            println(i)

        for (i in 4 downTo 1 step 2)// 输出“42”
            println(i)

        // 使用 until 函数排除结束元素
        for (i in 1 until 10) {// i in [1, 10) 排除了 10
            println("until-->"+i)
        }

    }

    class Greeter(val name: String) {
        fun greet() {
            println("哈哈哈哈")
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }


    fun sum1(a: Int, b: Int) = a + b

    public fun sum2(a: Int, b: Int): Int = a + b// public 方法则必须明确写出返回类型

    fun sum3(a: Int, b: Int): Unit {
        println(a + b)
    }

    // 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
    public fun sum4(a: Int, b: Int) {
        println(a + b)
    }

    //可变长参数函数
    fun vars(vararg v: Int) {
        for (va in v) {
            println(va)
        }
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }

        return null
    }

}
