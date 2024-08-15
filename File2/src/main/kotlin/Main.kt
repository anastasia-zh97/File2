package ru.Netology

fun main() {
    var likes = 11
    var text = " "
    if (likes == 1 || likes % 10 == 1 && likes != 11) {
        text = "человеку"
    } else {
        text = "людям"
    }

    print("Ваша фотография понравилась " + likes + " " + text)
}