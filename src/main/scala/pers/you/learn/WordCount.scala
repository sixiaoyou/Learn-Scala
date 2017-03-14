package pers.you.learn

/**
  * Created by You on 2017/3/9.
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    val words: List[String] = lines.flatMap(_.split(" "))
    val wordAndOne: List[(String, Int)] = words.map((_, 1))
    val grouped : Map[String, List[(String, Int)]] = wordAndOne.groupBy(_._1)
//    println(grouped)
    val result: Map[String, Int] = grouped.mapValues(_.foldLeft(0)(_ + _._2))
    println(result)
  }
}
