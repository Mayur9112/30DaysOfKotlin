package AnnotationExample

data class Fish (var name: String)

fun fishExamples() {
    val fish = Fish("splashy")
    with (fish.name) {
        println(capitalize())
    }
}

fun runExample() {
    JavaRun.runNow {
        println("Last parameter is a lambda as a Runnable")
    }
}

fun main () {
    fishExamples()
    runExample()
}