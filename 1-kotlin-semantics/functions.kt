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
    
    checkMessage()
    checkMessage(false)
    
    basicMath(10, 12)
    // basicMath(0, 12)
    
    val OS = "Chrome OS"
    var emailID = "sample@gmail.com"
    
    println(displayAlertMessage(OS, emailID))
    println()
    //println(displayAlertMessage("Windows", emailID))
    //println(displayAlertMessage(emailID = emailID))
    //println(displayAlertMessage("Mac OS", emailID))
    
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailID = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailID: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailID."
}

fun basicMath(num1: Int, num2: Int) {
	var sum = add(num1, num2)
    var difference = sub(num1, num2)
    var product = mult(num1, num2)
    var quotient = div(num1, num2)
    
    println(sum)
    println(difference)
    println(product)
    println(quotient)
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sub(num1: Int, num2: Int): Int {
    if (num1 >= num2) {
     return num1 - num2   
    } else {
        return num2 - num1
    }
}

fun mult(num1: Int, num2: Int): Int {
    if (num1 == 0 || num2 == 0) {
        return 0
    } else {
        return num1 * num2
    }
}

fun div(num1: Int, num2: Int): Int {
    if (num1 == 0) {
        println("Cannot divide by zero!")
        return -1
    } else {
        return num2 / num1
    }
}

// example of a default argument, that is always set to a fixed value
fun checkMessage(received: Boolean = true): Boolean {
    if (received == true) {
        println("Message was received successfully.")
        return true
    } else {
        println("Could not receive the message. Please try again.")
        return false
    }
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


