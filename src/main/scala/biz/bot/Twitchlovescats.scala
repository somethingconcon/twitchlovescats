package biz.bot

import org.jibble.pircbot._

class Botty(name: String) extends PircBot {

  setName(name)

}

object Twitchlovescats extends App {

  // Now start our bot up.
  val bot = new Botty("notabot2")

  bot.setVerbose(true)
  bot.connect("irc.freenode.net")
  bot.joinChannel("#2flirty")

}
