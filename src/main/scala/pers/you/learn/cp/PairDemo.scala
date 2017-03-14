package pers.you.learn.cp

/**
  * Created by You on 2017/3/8.
  */
object PairDemo {


  //偏函数 没有match 只有case
  def func1: PartialFunction[String,Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }
  def func2(num:String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println(func2("two"))
  }
}

