package oop.tv

abstract class State(tv: TV) {
  def volumeUp()
  def volumeDown()
  def mute()
  def power()
  def currentVolume()
}
