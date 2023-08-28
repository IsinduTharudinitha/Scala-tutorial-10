
object question_02 {

  def main(args: Array[String]): Unit ={

    val wordList = List("apple","banana","cherry","date")
    val LetterOccurences = countLetterOccurences(wordList)
    println("Total count of letter occurrences: "+LetterOccurences)

  }

  def countLetterOccurences(words: List[String]): Int ={

    val wordLengths = words.map(s => s.length)
    val totalLetterCount = wordLengths.reduce((a,b) => a+b)

    totalLetterCount
  }

}
