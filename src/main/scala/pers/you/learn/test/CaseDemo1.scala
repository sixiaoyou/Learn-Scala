package pers.you.learn.test

import java.util.Random

/**
  * Created by You on 2017/3/7.
  */
object CaseDemo1 {
  def main(args: Array[String]): Unit = {
    val a = Array("tom","jerry","kitty")
    val r: Random = new Random()
    val i = r.nextInt(a.length)
    val a1: String = a(i)
    println("a1" + a1)
    println(s"a1 $a1" )
    a1 match {
      case  "tom" => {
        println("this is tom")
      }
      case "jerry" =>{
        println("this is jerry")
      }
      case "kitty" =>{
        println("this is kitty")
      }

    }
  }

}
