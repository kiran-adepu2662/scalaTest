package scalaquestions

object ScalaQuestion2 {
   def main(args: Array[String]): Unit = {    
  val istrng = "AAAAABBBCCC"
 val countletters =  istrng.foldRight(List.empty[(Int,Char)]){
  case (c, hd::tl) if c == hd._2 => (hd._1 + 1, c) :: tl
  case (c, lst) => (1,c) :: lst
}.map{tup => if (tup._1 == 1) s"${tup._2}".mkString("") 
  else s"${tup._1}${tup._2}".mkString("") }.mkString("")
println(countletters)
}
}