/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    doubleSample()
    stringSample()
}

fun doubleSample() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    
    val totalTripLen: Double = trip1 + trip2 + trip3
    
    println("You are just starting your trip!")
    println("$totalTripLen miles left to reach the destination")
    
    val milesPerHourLimit: Double = 45.0
    
    println("If you travel at $milesPerHourLimit mph, it will take you approximately ${totalTripLen / milesPerHourLimit} hours.")
}

fun stringSample() {
	val nextMeeting = "Next Meeting"
    val date = "January 1"
    val location: String = "at Kohler 104."
    
    val reminder = nextMeeting + ": " + date + ", " + location
    
    println(reminder)
}










