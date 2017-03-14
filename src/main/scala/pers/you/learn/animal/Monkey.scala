package pers.you.learn.animal

/**
  * Created by You on 2017/3/6.
  */
class Monkey /**extends Animal**/ extends Fightable with Eatable{
//  def fly(): Unit = {
//    println("乘坐筋斗云")
//  }
//
//  override def run(): Unit = {
//    println("蹦着走")
//  }

  override def fight(): Unit = {
    println("用棒子打")
  }

  override def eat(): Unit = {
    println("吃桃子")
  }
}

object Monkey{
  def main(args: Array[String]): Unit = {
    val m = new Monkey
//    m.fly()
//    m.run()
//    m.fight()
//    m.eat()

    //实现多态，必须指定类型
//    val a: Animal = new Monkey
//    a.run()

    val f: Fightable = new Monkey
    f.fight()
  }
}
