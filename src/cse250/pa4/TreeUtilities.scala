/**
 * cse250.pa4.TreeUtilities.scala
 *
 * Copyright 2019 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * Submission author
 * UBIT:
 * Person#:
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */
package cse250.pa4

import cse250.objects.{Empty, Node, Tree}
import javax.swing.tree.TreeNode

import scala.collection.mutable
import scala.reflect.ClassTag

object TreeUtilities {
  def buildHeapTreeFromHeapArray[A](heapArray: Array[A]): Tree[A] = {
    def linkage(arr: Array[A], index: Int): Tree[A] ={
      if(index > arr.length-1){ //base case: leaf of the tree
        Empty
      } else {
        val node: Node[A] = new Node[A](heapArray(index),
          linkage(arr, 2*index+1), //left child
          linkage(arr, 2*index+2)  //right child
        )
        node
      }
    }
    if(heapArray.nonEmpty){
      val root: Node[A] = new Node[A](heapArray(0),
        linkage(heapArray, 1),
        linkage(heapArray, 2)
      )
      root
    } else {
      Empty
    }
  }

  def flattenHeapTreeToHeapArray[A: ClassTag](root: Tree[A]): Array[A] = {
    Array()
  }

  def isValidBinaryHeap[A](root: Tree[A])(implicit comp: Ordering[A]): Boolean = {
    false
  }

  def applyTree[A](root: Tree[A], index: Int): Option[A] = {
    None
  }

  def updateHeap[A](root: Tree[A], index: Int, elem: A)(implicit comp: Ordering[A]): Tree[A] = {
    root
  }
}
