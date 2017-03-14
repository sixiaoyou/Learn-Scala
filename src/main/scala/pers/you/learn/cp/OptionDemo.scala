package pers.you.learn.cp

/**
  * Created by You on 2017/3/8.
  */
object OptionDemo {

  def main(args: Array[String]): Unit = {
    val m = Map("a" -> 1, "b" -> 2)
//    val maybeInt: Option[Int] = m.get("c")
    //    println(maybeInt)
    //
    val i = m.getOrElse("c",0)
      println(i)

    val a = Array(1,2,3,4,5)
    a.reduce(_+_)
    a.fold(0)(_ + _)
    //    a.map(_ + 10)
    }
  }

