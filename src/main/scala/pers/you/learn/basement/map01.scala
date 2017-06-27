package main.scala.pers.you.learn.basement

/**
  * Created by Administrator on 2017/6/27.
  */
object map01 {
  def main(args: Array[String]) {
    //    定长
    val map = Map("001" -> "tom", "002" -> "jack", "003" -> "lili")
    println(map)
    println(map("001"))
    println("================")

    //    可变的
    val map2 = scala.collection.mutable.Map("004" -> "tom", "005" -> "jack", "006" -> "lili")

    //    添加元组
    map2 += ("009" -> "enn")

    println(map2)
    println(map2("006"))
    println("================")

    //判断是否存在
    println(map2.contains("008"))
    //    如果不存在key为008的直接返回0
    var b = map2.getOrElse("008", 0)
    println(b)
    println("================")
    for ((k, v) <- map2) {
      println(k + "---->" + v)
    }
    println("================")
    for ((k) <- map2.keySet) {
      println(k)
    }
    println("================")
    for ((v) <- map2.values) {
      println(v)
    }
    println("================")
    //  有序map
    var map3 = scala.collection.immutable.SortedMap("03" -> "a", "01" -> "b", "02" -> "c")
    for ((k, v) <- map3) {
      println(k + "------->" + v)
    }
    println("================")
  }

}
