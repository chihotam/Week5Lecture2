package oop.tv

class On(tv: TV) extends State(tv: TV) {
  override def volumeUp(): Unit = {
    tv.temp = Math.min(10,tv.temp+1)
  }
  override def volumeDown(): Unit = {
    tv.temp = Math.max(0,tv.temp-1)
  }
  override def mute(): Unit = {
    tv.state = new Muted(tv)
    tv.temp2 = tv.temp
    tv.temp = 0
  }
  override def power(): Unit = {
    tv.state = new Off(tv)
    tv.temp2 = tv.temp
  }
  override def currentVolume(): Unit = {
    tv.volume = tv.temp
  }
}
