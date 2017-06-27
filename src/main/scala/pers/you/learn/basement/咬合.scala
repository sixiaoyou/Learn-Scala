package main.scala.pers.you.learn.basement

/**
  * Created by Administrator on 2017/6/27.
  */
object 咬合 {
  def main(args: Array[String]) {
    var t = (1, "bbb", 12)
    println(t._1)

    //  zip咬合操作
    var list1 = List("001", "002", "003")
    var list2 = List("aa", "bb", "cc")
    var pair = list1.zip(list2)
    var map = pair.toMap
    println(pair)
    println("===================")
    println(map)
  }
}
