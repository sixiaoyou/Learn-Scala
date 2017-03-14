package pers.you.learn.gen

/**
  * Created by You on 2017/3/9.
  */
// <: 上界
// >: 下界
// <% 视图界定
// :上下文界定
class Pair[T <% Comparable[T]] (first: T, second: T){

  def bigger(): T = if(first.compareTo(second) >0) first else second
}

object Pair{
  def main(args: Array[String]): Unit = {
    val p = new Pair(1,2)
//    val p = new Pair(1,3)

    val r = p.bigger()
    println(r)
  }
}