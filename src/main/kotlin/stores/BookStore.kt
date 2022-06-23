package stores

//Obsolete in new branch
class BookStore(val name: String) {
    var books = mutableListOf<String>(
      "Percy Jackson: The Lightning Thief", "Dragonlance Chronicles", "Fahrenheit 451", "Ender's Game", "Star Wars " +
                "Light of the jedi"
    )
    var authors = mutableListOf<String>("Rick Riordan", "Weis & Hickman", "Ray Bradbury", "Orson Scott Card", " " +
            "Charles Soule"

    )
    var rented = arrayListOf<String>("Available", "Available", "Available", "Available", "Rented")
    fun displayBooks() {
        var i: Int = 0
        while (i < books.size) {
            print(i+1)
            print(". "+books[i] + " by " + authors[i] + "(" + rented[i] + ")\n")
            i++
        }
    }

    fun displayOneBook(trackNum: Int) {
        println(books[trackNum] + " by " + authors[trackNum])
    }

    fun greeting(){
        println("\nHello welcome to $name. Go ahead and look at our selection of songs")
    }

    fun bookSelection(trackNum: Int){
        if(isRented(trackNum)){
            println("Sorry this book is already rented")
        }else{
            println("You have rented "+books[trackNum] +" by " + authors[trackNum]+"\n")
            rented[trackNum] = "Rented"
        }
    }

    fun isRented(trackNum: Int): Boolean{
        return rented[trackNum].equals("Rented")
    }

}