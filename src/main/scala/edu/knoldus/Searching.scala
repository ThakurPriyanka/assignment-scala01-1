package edu.knoldus

class Searching {
  def binarySearchMine(array: Array[Int], elem: Int, start: Int = 0, end: Int): Int = {
    if (start > end){
       -1
    }
    val mid = start + (end - start + 1 ) / 2
    if (array(mid) == elem) {
      mid
    }
    else if (array(mid) > elem) {
      binarySearchMine(array, elem, start, mid - 1)
    }
    else {
      binarySearchMine(array, elem, mid + 1, end)
    }
  }
  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val output = binarySearchMine(array, elem, 0, array.length-1)

    if (output == -1) {
      false
    }
    else {
      true
    }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    var index = -1
    for (item <- 0 to (array.length - 1)) {
      if (array(item) == elem) {
        index = item
      }
    }
    if (index != -1) {
      true
    }
    else {
      false
    }
  }
}
