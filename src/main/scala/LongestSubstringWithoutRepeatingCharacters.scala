import scala.collection.mutable

/*
sliding window, left and right
 */
object LongestSubstringWithoutRepeatingCharacters {
  def lengthOfLongestSubstring(s: String): Int = {
    if (s.length == 0){
      return 0
    }
    var longestSubstringLength = 1;
    var left = 0
    var right = 0
    val currentWindow = mutable.HashSet[Char]()
    while (right < s.length){
      while (left < right && currentWindow.contains(s.charAt(right))){
        val leftChar = s.charAt(left)
        currentWindow.remove(leftChar)
        left += 1
      }
      currentWindow.add(s(right))
      longestSubstringLength = longestSubstringLength.max(right-left+1)
      right += 1
    }
    longestSubstringLength
  }
}
