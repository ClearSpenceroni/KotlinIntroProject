import stores.BookStore
import stores.MovieStore
import stores.MusicStore
import java.util.*

var input = Scanner(System.`in`)
val musicStore = MusicStore("Ridiculous Records")
val bookStore = BookStore("Barnes & Noble")
val movieStore = MovieStore("Blockbuster")
fun main(args: Array<String>) {
    println("Hello World!")


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
        1 -> musicStore.displaySongs()
        2 -> rentSongs()
        3 -> print("Going home");
    }
}while(userMusicStoreChoice != 3)
}

fun bookStoreDialogue(){
    do{
        bookStore.greeting()
        println("What would you like to do?\n1. View books\n2. Rent books\n3. Return to store selection")
        var userBookStoreChoice = input.nextInt()

        when (userBookStoreChoice) {
            1 -> bookStore.displayBooks()
            2 -> rentBooks()
            3 -> print("Going home");
        }
    }while(userBookStoreChoice != 3)

}

fun movieStoreDialogue(){
    do{
        bookStore.greeting()
        println("What would you like to do?\n1. View movie\n2. Rent movie\n3. Return to store selection")
        var userMovieStoreChoice = input.nextInt()

        when (userMovieStoreChoice) {
            1 -> movieStore.displayMovies()
            2 -> rentMovies()
            3 -> print("Going home");
        }
    }while(userMovieStoreChoice != 3)

}

fun rentSongs(){
    do {
        println("Here are the song options\n")
        musicStore.displaySongs()
        println("0. Return")
        print("\nWhat song would you like to rent?: ")
        var userSong = input.nextInt()
        if(userSong == 0){
            break
        }
        userSong--
        input.nextLine()
        println("Please type CONFIRM to confirm this song or type CANCEL to go back")
        var userConfirmation = input.nextLine()
        if (userConfirmation.equals("confirm", ignoreCase = true)) {
            musicStore.songSelection(userSong)
        }
        println("Would you like to make another selection?(Yes/No)")
        var sentinel = input.nextLine()
    }while(sentinel.equals("yes", ignoreCase = true))
}

fun rentBooks(){
    do{
        println("Here are the book options\n")
        bookStore.displayBooks()
        println("0. Return")
        print("\nWhat book would you like to rent?: ")
        var userBook = input.nextInt()
        if(userBook == 0){
            break
        }
        userBook--
        input.nextLine()
        println("Please type CONFIRM to confirm this song or type CANCEL to go back")
        var userConfirmation = input.nextLine()
        if (userConfirmation.equals("confirm", ignoreCase = true)) {
            bookStore.bookSelection(userBook)
        }
        println("Would you like to make another selection?(Yes/No)")
        var sentinel = input.nextLine()

    }while(sentinel.equals("yes", ignoreCase = true))
}

fun rentMovies(){
    do{
        println("Here are the movie options\n")
        movieStore.displayMovies()
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
            movieStore.movieSelection(userMovie)
        }
        println("Would you like to make another selection?(Yes/No)")
        var sentinel = input.nextLine()

    }while(sentinel.equals("yes", ignoreCase = true))
}