package oop.tv

class Off(tv: TV) extends State(tv: TV) {
  override def volumeUp(): Unit = {
    println("Power is off.")
  }
  override def volumeDown(): Unit = {
    println("Power is off.")
  }
  override def mute(): Unit = {
    println("Power is off.")
  }
  override def power(): Unit = {
    tv.state = new On(tv)
    tv.temp = tv.temp2
  }
  override def currentVolume(): Unit = {
    tv.volume = 0
  }
}
