import scala.collection.mutable.Buffer

object ThisIsABoringFile extends App {
  val founders = Buffer[String]("Quan", "Aayush", "Ray", "Sergey")
  def beNice = founders.foreach( (n:String) => println("Thank you, " + n) )
}
