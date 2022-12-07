package ru.geekbrains.stopwatch.data

interface TimestampProvider {
    fun getMilliseconds(): Long
}