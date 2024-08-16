package ru.Netology

fun main() {
    var likes = 211
    var text = " "
    if (likes % 10 == 1 && likes % 100 != 11) {
        text = "человеку"
    } else {
        text = "людям"
    }

    print("Ваша фотография понравилась " + likes + " " + text)

}