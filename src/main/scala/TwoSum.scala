import scala.collection.mutable.HashMap
import scala.collection.mutable
object TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numHashMap = new HashMap[Int, mutable.ArrayBuffer[Int]]
    var currentIndex = 0
//    var result = Array[Int](5)
    for (num <- nums){
      if (numHashMap.contains(num)){
        numHashMap(num) += currentIndex
      }
      else{
        numHashMap(num) = mutable.ArrayBuffer(currentIndex)
      }
      currentIndex += 1
    }
    for (num <- nums){
      val requiredTarget = target - num
      if (numHashMap.contains(requiredTarget)){
        if ((num == requiredTarget) && (numHashMap.getOrElse(num, mutable.ArrayBuffer()).length > 1)){
          val result = (numHashMap.get(num), numHashMap.get(requiredTarget)) match {
            case (Some(numIndices), Some(targetIndices)) => Array(numIndices(0), targetIndices(1))
            case _ => Array(-1, -1)
          }
          return result
        }
        else if (num != requiredTarget){
          val result = (numHashMap.get(num), numHashMap.get(requiredTarget)) match {
            case (Some(numIndices), Some(targetIndices)) => Array(numIndices(0), targetIndices(0))
            case _ => Array(-1, -1)
          }
          return result
        }
      }
    }
    Array(-1 ,-1)
  }
}
