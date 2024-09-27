/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println(increment(10))
    someGreeting()

    val greeting = namedGreeting("Rex")
    println(greeting)
    
    var meetDetails = meetingTime("John", "1505", 1404)
    println(meetDetails)
    
    // named arguments:
    println("message sent ? -> " + messageQueue(sender = "Alex", recipient = "Fran", body = "Hey F, hope we're still up for coffee today! Can't wait to tell you what happened at the office!"))
	// these named arguments can also be reordered and sent:
    println("message sent ? -> " + messageQueue(recipient = "Alex", sender = "Fran", body = "Hey A! Yes, absolutely! Looking forward to meeting later! See ya!!"))
}

fun sentMessage(sending: Boolean): Boolean {
    if (!sending) {
        return false
    } else {
        return true
    }
}

fun messageQueue(sender: String, recipient: String, body: String): Boolean {
    var message: String = "\n[Sender: $sender]\n[Recipient: $recipient]\n[body: $body]\n"
    
    println(message)
    
    var sent = sentMessage(false)
    return sent
}

fun increment(x: Int): Int {
    var num = x

    return ++num
}

fun someGreeting(): Unit {
    println("something has been changed.")
}

fun namedGreeting(name: String): String {
    var greeting: String = "Hi, $name, how have you been?"
    
    return greeting
}

fun meetingTime(name: String, time: String, roomNo: Int): String {
    var details: String = "\n\n--------------------\nHello $name,\n\nThe time for the meeting is $time.\nWe are gonna meet in $roomNo.\nSee you there.\n\nRegards,\nAlex\n--------------------\n\n"
    return details
}


