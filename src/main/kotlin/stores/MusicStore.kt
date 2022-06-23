package stores

class MusicStore(val name: String) {
    var songs = mutableListOf<String>(
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
    var rented = arrayListOf<String>("Available", "Available", "Rented", "Available", "Available")

    fun displaySongs() {
        var i: Int = 0
        while (i < songs.size) {
            print(i+1)
            print(". "+songs[i] + " by " + artists[i] + "(" + rented[i] + ")\n")
            i++
        }
    }

    fun displayOneSong(trackNum: Int) {
        println(songs[trackNum] + " by " + artists[trackNum])
    }

    fun greeting(){
        println("\nHello welcome to $name. Go ahead and look at our selection of songs")
    }

    fun songSelection(trackNum: Int){
    if(isRented(trackNum)){
        println("Sorry this song is already rented")
    }else{
        println("You have rented "+songs[trackNum] +" by " + artists[trackNum]+"\n")
        rented[trackNum] = "Rented"
    }
    }

    fun isRented(trackNum: Int): Boolean{
        return rented[trackNum].equals("Rented")
    }

}