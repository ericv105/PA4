/**
 * cse250.pa4.TreeUtilitiesTest.scala
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

import cse250.pa4.TreeUtilities
import org.scalatest.{BeforeAndAfter, FlatSpec}


class TreeUtilitiesTest extends FlatSpec with BeforeAndAfter {
  behavior of "buildHeapTreeFromHeapArray:"
  // Tests for buildHeapTreeFromHeapArray
  it should "work" in {
    val heapArray = Array(10,5,4,3,1,2,0,-2,-4)
    val heapTree = TreeUtilities.buildHeapTreeFromHeapArray(heapArray)

    assert
  }
  // ----
  behavior of "flattenHeapTreeToHeapArray:"
  // Tests for flattenHeapTreeToHeapArray
  it should "work" in {

  }
  // ----
  behavior of "isValidBinaryHeap:"
  // Tests for flattenHeapTreeToHeapArray
  it should "work" in {

  }
  // ----
  behavior of "applyTree:"
  // Tests for flattenHeapTreeToHeapArray
  it should "work" in {

  }
  // ----
  behavior of "updateHeap:"
  // Tests for flattenHeapTreeToHeapArray
  it should "work" in {

  }
  // ----

}

