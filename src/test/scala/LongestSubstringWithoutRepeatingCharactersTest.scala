import org.scalatest.*
import org.scalatest.funsuite.AnyFunSuite
import Array._

class LongestSubstringWithoutRepeatingCharactersTest extends AnyFunSuite {
  test("Longest Substring Without Repeating Characters"){
    assert(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb") == 3)
    assert(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb") == 1)
    assert(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew") == 3)
  }
}
