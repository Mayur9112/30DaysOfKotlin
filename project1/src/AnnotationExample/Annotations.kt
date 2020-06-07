package AnnotationExample

import kotlin.reflect.full.*

class Plant {
    fun trim(){
        println("Trim function")
    }
    fun fertilize(){
        println("Fertilize function")
    }

    fun grow(){
        println("grow function")
    }
}

fun testAnnotations() {
    val classObj = Plant::class
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }
}

fun main() {
    testAnnotations()
}