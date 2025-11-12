package com.beluco.betvision.repo
import com.beluco.betvision.data.Match
object MockRepo { fun getMatches(): List<Match> { return listOf(Match("Lakers vs Bulls","02/12 19:00",1.75,2.05),Match("Nets vs Celtics","02/12 21:30",1.95,1.85)) } }