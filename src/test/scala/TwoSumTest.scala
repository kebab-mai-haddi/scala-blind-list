import org.scalatest.*
import org.scalatest.funsuite.AnyFunSuite
import Array._
class TwoSumTest extends AnyFunSuite{
  test("The twoSum function should find the indices of two number that add up to a target"){
    assert(TwoSum.twoSum(Array(2,7,11,15), 9).sameElements(Array(0,1)))
//    val actualValue = TwoSum.twoSum(Array(3,2,4), 6)
    assert(TwoSum.twoSum(Array(3,2,4), 6).sameElements(Array(1,2)))
  }
}
