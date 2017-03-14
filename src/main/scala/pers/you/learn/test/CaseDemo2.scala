package pers.you.learn.test

/**
  * Created by You on 2017/3/7.
  */
object CaseDemo2  extends App{
  val list = List(0)
  list match {
    case 0 :: Nil => println("only 0")
    case x :: y ::Nil => println(s"x: $x,y: $y")
    case 0 :: tail => println("0 ....")
    case _ => println("something else")
  }
}
