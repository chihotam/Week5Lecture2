package tests

import oop.tv.TV
import org.scalatest.FunSuite

class TestTV extends FunSuite{
  test("") {
    val tv: TV = new TV()
    tv.power()
    assert(tv.currentVolume() == 5)
    tv.volumeUp()
    assert(tv.currentVolume() == 6)
    tv.volumeDown()
    tv.volumeDown()
    assert(tv.currentVolume() == 4)
    tv.power()
    assert(tv.currentVolume() == 0)
    tv.volumeUp()
    assert(tv.currentVolume() == 0)
    tv.mute()
    assert(tv.currentVolume() == 0)
    tv.power()
    assert(tv.currentVolume() == 4)
    tv.mute()
    assert(tv.currentVolume() == 0)
    tv.volumeDown()
    assert(tv.currentVolume() == 4)
    tv.mute()
    tv.power()
    tv.power()
    assert(tv.currentVolume() == 4)
    tv.volumeUp()
    tv.volumeUp()
    tv.volumeUp()
    tv.volumeUp()
    tv.volumeUp()
    tv.volumeUp()
    tv.volumeUp()
    assert(tv.currentVolume() == 10)
    tv.mute()
    tv.mute()
    assert(tv.currentVolume() == 10)
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    tv.volumeDown()
    assert(tv.currentVolume() == 0)


  }

}
