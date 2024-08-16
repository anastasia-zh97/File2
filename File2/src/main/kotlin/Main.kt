package ru.Netology

fun main() {
    var likes = 11
    var result = likes % 100
    var text = " "
    if (likes % 10 == 1 && result != 11) {
        text = "человеку"
    } else {
        text = "людям"
    }

    print("Ваша фотография понравилась " + likes + " " + text)

}