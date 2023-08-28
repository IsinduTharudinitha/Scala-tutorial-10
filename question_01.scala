
object question_01 {

  def main(args: Array[String]): Unit = {

    val celsiusTemps = List[Double](0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(celsiusTemps)
    println("Average Fahrenheit temperature "+averageFahrenheit)

  }

  def calculateAverage(tempsInCelsius: List[Double]): Double = {

    val tempsInFahrenheit = tempsInCelsius.map(c => (c * 9 / 5) + 32)
    val sumInFahrenheit = tempsInFahrenheit.reduce((a, b) => a + b)
    val averageInFahrenheit = sumInFahrenheit/tempsInFahrenheit.length

  averageInFahrenheit

  }

}
