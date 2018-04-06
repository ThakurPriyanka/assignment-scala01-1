package edu.knoldus

class Sorting {

  // Git-Learning changes by Manjot.

//  def insertionSort(array: Array[Int]): Array[Int] = {
//    for(i <- 1 until array.length )
//    {
//      val key = array(i)
//      var j = i-1
//
//      while( j>=0 && array(j)>key)
//      {
//        array(j + 1) = array(j)
//        j = j-1
//      }
//      array(j + 1) = key
//    }
//    array
//  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for(i <- 0 to array.length - 1){
      var min: Int = i
      for(j <- i + 1 to array.length - 1 ){
        if(array(min) > array(j) ) {
          min = j
        }
      }
      val temp = array(i)
      array(i)= array(min)
      array(min)= temp
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for(i <- 1 to array.length - 1){
      for(j <- i - 1 to 0 by - 1 ){
        if(array(j) > array(j + 1) ){

          val temp = array(j)
          array(j)= array(j + 1)
          array(j + 1) = temp
        }
      }
    }
    array
  }

}
