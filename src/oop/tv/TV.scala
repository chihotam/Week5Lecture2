package oop.tv

class TV() {
  var state: State = new Off(this)
  var volume: Int = 5
  var temp: Int = 5
  var temp2: Int = 5
  def volumeUp(): Unit = {
    this.state.volumeUp()
  }
  def volumeDown(): Unit = {
    this.state.volumeDown()
  }
  def mute(): Unit = {
    this.state.mute()
  }
  def power(): Unit = {
    this.state.power()
  }
  def currentVolume(): Int = {
    this.state.currentVolume()
    this.volume
  }
}
