package stores

//Obsolete in new branch
class MovieStore(val name: String) {
    var movies = mutableListOf<String>(
        "Monty Python: Holy Grail", "Doctor Strange: Multiverse of Madness", "Star Wars: Revenge of the Sith",
        "Cars", "The Princess Bride"
    )
    var leadActors = mutableListOf<String>(
        "Graham Chapman", "Benedict Cumberbatch", "Hayden Christensen", "Owen Wilson", "Cary Elwes"
    )
    var rented = arrayListOf<String>("Available", "Rented", "Available", "Available", "Available")

    fun displayMovies() {
        var i: Int = 0
        while (i < movies.size) {
            print(i+1)
            print(". "+movies[i] + " staring " + leadActors[i] + "(" + rented[i] + ")\n")
            i++
        }
    }

    fun displayOneMovie(trackNum: Int) {
        println(movies[trackNum] + " staring " + leadActors[trackNum])
    }

    fun greeting(){
        println("\nHello welcome to $name. Go ahead and look at our selection of songs")
    }

    fun movieSelection(trackNum: Int){
        if(isRented(trackNum)){
            println("Sorry this movie is already rented")
        }else{
            println("You have rented "+movies[trackNum] +" staring " + leadActors[trackNum]+"\n")
            rented[trackNum] = "Rented"
        }
    }

    fun isRented(trackNum: Int): Boolean{
        return rented[trackNum].equals("Rented")
    }

}