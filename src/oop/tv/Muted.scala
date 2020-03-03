package oop.tv

class Muted(tv: TV) extends State(tv: TV) {
  override def volumeUp(): Unit = {
    tv.state = new On(tv)
    tv.temp = tv.temp2
  }
  override def volumeDown(): Unit = {
    tv.state = new On(tv)
    tv.temp = tv.temp2
  }
  override def mute(): Unit = {
    tv.state = new On(tv)
    tv.temp = tv.temp2
  }
  override def power(): Unit = {
    tv.state = new Off(tv)
  }
  override def currentVolume(): Unit = {
    tv.volume = tv.temp
  }
}
