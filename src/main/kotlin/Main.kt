import stores.MusicStore
import java.util.*

var input = Scanner(System.`in`)
val musicStore = MusicStore("Ridiculus Records")
fun main(args: Array<String>) {
    println("Hello World!")


do{
    println("Where would you like to go?\n1. Music Store\n2. Book Store\n3. Movie Store\n0. To quit")
   print("Answer here: ")
    var userChoice = input.nextInt()

    when(userChoice){
        1 -> musicStoreDialogue()
        2 -> println("To Book Store")
        3 -> println("To Blockbuster")
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