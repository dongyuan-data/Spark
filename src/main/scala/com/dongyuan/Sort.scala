package com.dongyuan

/**
  * @Project_Name Spark
  * @Package_Name com.dongyuan
  * @Create_Time 2020/3/25 7:56
  */
object Sort {
  def main(args: Array[String]): Unit = {
    val a = Array[Int](7,21,1,42,3,5,134,5,6,8)
    val b = List[Int](7,21,1,42,3,5,134,5,6,8)
    val c = List[Int](7,21,1,42,3,5,134,5,6,8)
    MPSort(a)
    val ints = QuickSort(b)
    val ints1 = Merge(c,b)
    println(a.mkString(","))
    println(ints.mkString(","))
    println(ints1.mkString(","))
  }
  def MPSort(arr: Array[Int]):Unit ={
    for(i <- 0 until  arr.length - 1 ){
      for ( j <- 0 until arr.length - i - 1 ){
        if(arr(j) > arr(j+1)){
          val temp = arr(j)
          arr(j) = arr(j+1)
          arr(j+1) = temp
        }
      }
    }
  }
  def QuickSort(list: List[Int]):List[Int] = list match {
    case Nil => Nil
    case List() => List()
    case head :: tail =>
      val (left,right) = tail.partition(_ < head)
      QuickSort(left) ::: head :: QuickSort(right)

  }
  def Merge(left: List[Int],right: List[Int]):List[Int]= (left,right) match {
    case (Nil,_) => right
    case (_,Nil) => left
    case (x :: xTail,y :: yTail) =>
      if (x <= y)  x :: Merge(xTail,right)
      else  y :: Merge(left,yTail)
  }
}
