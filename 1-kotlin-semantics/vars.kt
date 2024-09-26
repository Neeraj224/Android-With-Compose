/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    println("Hello, Android!")
    //emails()
    //photoBook()
    //shoppingCart()
    newMail()
}

fun shoppingCart() {
    // the 'val' keyword is for constants,
    // for a variable - use the 'var' keyword instead
    var cartTotal = 0
    
    cartTotal = cartTotal + 20
    
    println("Your total is $cartTotal")
}

fun photoBook() {
    val total = 100
    println("You have a total of $total photos in your gallery.")
    
    val deletedPhotos = 10
    println("You deleted $deletedPhotos photos.")
    
    println("You have ${total - deletedPhotos} remaining in your gallery.")
}

fun newMail() {
    var count = 10
    println("You have $count unread emails.")
    count++
    println("You have $count unread emails.")
}

fun emails() {
    val unread = 5
    val read = 100
    println("You have a total of ${unread + read} emails in your inbox.")
    
    val total = read + unread
    println("same: $total")
}

