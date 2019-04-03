package com.epam

class MyStack<T>{

    var stackArray: ArrayList<T?> = ArrayList()

    fun push(e: T?) = stackArray.add(e)

    fun pop(): T? = if (!isEmpty()) stackArray.removeAt(stackArray.lastIndex) else null

    fun isEmpty(): Boolean = stackArray.isEmpty()

    override fun toString(): String = stackArray.asReversed().joinToString("\n")
}