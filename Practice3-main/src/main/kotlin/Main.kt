import java.util.Random

fun main(args: Array<String>) {
    // Задание 1
    val isTeenager = (myAge > 13) && (myAge < 19);
    //--------

    // Задание 2
    val  theirAge = 30
    val bothTeenagers = (myAge > 13 && myAge < 19) && (theirAge > 13 && theirAge < 19);
    //--------

    // Задание 3
    val reader = "Timur"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    //--------

    // Задание 4
    val readerBeforeAuthor = reader < author
    println(readerBeforeAuthor)
    //--------

    // Задание 5
    val myAge2=18;
    if(myAge2 > 13 && myAge2 < 19)
    {
        println("Подросток");
    }
    else {
        println("Не подросток");
    }
    //--------

    // Задание 6
    val answer = if((myAge2 > 13) && (myAge2 < 19)) "Подросток"; else "Не подросток";
    println(answer)
    //--------

    // Задание 7
    var counter = 0
    while (counter < 10) {
        println(counter)
        counter++
    }
    //--------

    // Задание 8
    counter = 0
    var roll = 0
    do {
        roll = Random().nextInt(6)
        println("После $counter бросков, roll = $roll")
        counter++
    }
    while(roll != 0)
    //-------

    // Задание 9
    val range = 1..10
    for(i in range) {
        println(Math.pow(i.toDouble(),2.toDouble()))
    }
    //-------

    // Задание 10
    for(i in range) {
        println(Math.sqrt(i.toDouble()))
    }
    //-------

    //Задание 11
    var sum = 0
    for (row in 1 until  8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
    //--------

}
