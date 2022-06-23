import java.util.Scanner


data class Store(
    val item: List<String>,
    val creator: List<String>,
    val rentStatus: MutableList<String>,
    val name: String
){
    fun displayItems(){
        var i = 0
        while (i < item.size) {
            print(i+1)
            print(". "+item[i] + " by " + creator[i] + "(" + rentStatus[i] + ")\n")
            i++
        }
    }

    fun greeting(){
        println("\nHello welcome to $name. Go ahead and look at our selection of items")
    }

    fun isRented(trackNum: Int): Boolean{
        return rentStatus[trackNum].equals("Rented")
    }

    fun selection(trackNum: Int){

        if(isRented(trackNum)){
            println("Sorry this book is already rented")
        }else{
            println("You have rented "+item[trackNum] +" by " + creator[trackNum]+"\n")
            rentStatus[trackNum] = "Rented"

        }
    }
}


var songs = listOf<String>(
    "It's Five O'Clock Somewhere", "I Get Around", "Rubber Band Man", "Ventura " +
            "Highway",
    "Keep " +
            "On" +
            " Loving you"
)
var artists = mutableListOf<String>(
    "Alan Jackson, Jimmy Buffet", "Beach Boys", "The Spinners", "America", "REO " +
            "Speedwagon"
)
var rentedSongs = arrayListOf<String>("Available", "Available", "Rented", "Available", "Available")

var books = mutableListOf<String>(
    "Percy Jackson: The Lightning Thief", "Dragonlance Chronicles", "Fahrenheit 451", "Ender's Game", "Star Wars " +
            "Light of the jedi"
)
var authors = mutableListOf<String>("Rick Riordan", "Weis & Hickman", "Ray Bradbury", "Orson Scott Card", " " +
        "Charles Soule"

)
var rentedBooks = arrayListOf<String>("Available", "Available", "Available", "Available", "Rented")

var movies = mutableListOf<String>(
    "Monty Python: Holy Grail", "Doctor Strange: Multiverse of Madness", "Star Wars: Revenge of the Sith",
    "Cars", "The Princess Bride"
)
var leadActors = mutableListOf<String>(
    "Graham Chapman", "Benedict Cumberbatch", "Hayden Christensen", "Owen Wilson", "Cary Elwes"
)
var rentedMovies = arrayListOf<String>("Available", "Rented", "Available", "Available", "Available")

var input = Scanner(System.`in`)
val musicStore = Store(songs,artists,rentedSongs, "Ridiculous Records")
val bookStore = Store(books,authors,rentedBooks,"Barnes & Noble")
val movieStore = Store(movies,leadActors,rentedMovies,"Blockbuster")
fun main(args: Array<String>) {
do{
    println("Where would you like to go?\n1. Music Store\n2. Book Store\n3. Movie Store\n0. To quit")
   print("Answer here: ")
    var userChoice = input.nextInt()

    when(userChoice){
        1 -> musicStoreDialogue()
        2 -> bookStoreDialogue()
        3 -> movieStoreDialogue()
        0 -> break
    }
}while(userChoice != 0)
println("Farewell")
}

fun musicStoreDialogue(){
do {
    musicStore.greeting()
    println("What would you like to do?\n1. View songs\n2. Rent songs\n3. Return to store selection")
    var userMusicStoreChoice = input.nextInt()

    when (userMusicStoreChoice) {
        1 -> musicStore.displayItems()
        2 -> rentSongs()
        3 -> println("Going home");
    }
}while(userMusicStoreChoice != 3)
}

fun bookStoreDialogue(){
    do{
        bookStore.greeting()
        println("What would you like to do?\n1. View books\n2. Rent books\n3. Return to store selection")
        var userBookStoreChoice = input.nextInt()

        when (userBookStoreChoice) {
            1 -> bookStore.displayItems()
            2 -> rentBooks()
            3 -> println("Going home");
        }
    }while(userBookStoreChoice != 3)

}

fun movieStoreDialogue(){
    do{
        bookStore.greeting()
        println("What would you like to do?\n1. View movie\n2. Rent movie\n3. Return to store selection")
        var userMovieStoreChoice = input.nextInt()

        when (userMovieStoreChoice) {
            1 -> movieStore.displayItems()
            2 -> rentMovies()
            3 -> println("Going home");
        }
    }while(userMovieStoreChoice != 3)

}

fun rentSongs(){
    do {
        println("Here are the song options\n")
        musicStore.displayItems()
        println("0. Return")
        print("\nWhat song would you like to rent?: ")
        var userSong = input.nextInt()
        if(userSong == 0){
            break
        }
        userSong--
        input.nextLine()
        println("Please type CONFIRM to confirm this song or type CANCEL to go back")
        val userConfirmation = input.nextLine()
        if (userConfirmation.equals("confirm", ignoreCase = true)) {
            musicStore.selection(userSong)
        }
        println("Would you like to make another selection?(Yes/No)")
        val sentinel = input.nextLine()
    }while(sentinel.equals("yes", ignoreCase = true))
}

fun rentBooks(){
    do{
        println("Here are the book options\n")
        bookStore.displayItems()
        println("0. Return")
        print("\nWhat book would you like to rent?: ")
        var userBook = input.nextInt()
        if(userBook == 0){
            break
        }
        userBook--
        input.nextLine()
        println("Please type CONFIRM to confirm this song or type CANCEL to go back")
        val userConfirmation = input.nextLine()
        if (userConfirmation.equals("confirm", ignoreCase = true)) {
            bookStore.selection(userBook)
        }
        println("Would you like to make another selection?(Yes/No)")
        val sentinel = input.nextLine()

    }while(sentinel.equals("yes", ignoreCase = true))
}

fun rentMovies(){
    do{
        println("Here are the movie options\n")
        movieStore.displayItems()
        println("0. Return")
        print("\nWhat movie would you like to rent?: ")
        var userMovie = input.nextInt()
        if(userMovie == 0){
            break
        }
        userMovie--
        input.nextLine()
        println("Please type CONFIRM to confirm this song or type CANCEL to go back")
        var userConfirmation = input.nextLine()
        if (userConfirmation.equals("confirm", ignoreCase = true)) {
            movieStore.selection(userMovie)
        }
        println("Would you like to make another selection?(Yes/No)")
        var sentinel = input.nextLine()

    }while(sentinel.equals("yes", ignoreCase = true))
}