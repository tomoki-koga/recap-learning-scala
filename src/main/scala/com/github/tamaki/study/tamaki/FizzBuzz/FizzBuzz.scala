package com.github.tamaki.study.tamaki.FizzBuzz

/**
 * Created by tomoki.koga@bizreach.co.jp on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {

    // 数値のみの合計を求める
    val sum = (1 to 100)
      .map(sorting)
      .map(s => try { Some(s.toInt) } catch { case e:Exception => None })
      .map(_.getOrElse(0)).sum

    println(sum)
  }

  def sorting(num: Int): String = {
    (num % 3, num % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => num.toString
    }
  }
}
