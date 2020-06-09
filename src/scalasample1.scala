

object scalasample1 {
  def main(args : Array[String]) : Unit = {
     println(Listrev(l1))
}
def Listrev[A](s: List[A], d: List[A] = Nil): List[A] = {
if (s == Nil) d else Listrev(s.tail, s.head :: d)
}
}