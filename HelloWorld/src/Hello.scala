/**
  * Created by chetan on 24/10/17.
  */

import scala.sys.process._
object Hello extends App{
  println("Hello, World!")

  type IntFn = Int => Int
  def twice(n : Int) = n*2
  def passFunction(n:Int, f: IntFn) : Int = f(n)
  def triple(n :Int) = n*3
  println(passFunction(5,twice))
  println(passFunction(5,triple))

  def sameTypeTuple[T](l:T, r:T) = (l,r)
  def genericTuple[L,R](l:L,r:R)=(l,r)
  def lengthOfList[T](xs:List[T]) = xs.length
  val listNumbers : List[Int] = List(1,2,3,4,5,6,7,8)
  println(lengthOfList(listNumbers))
//  val trains = "sl"
//  val output = trains.!
}