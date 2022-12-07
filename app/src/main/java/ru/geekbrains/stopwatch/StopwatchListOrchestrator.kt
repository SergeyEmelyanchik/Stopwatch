package ru.geekbrains.stopwatch

import ru.geekbrains.stopwatch.data.StopwatchStateHolder

class StopwatchListOrchestrator(
    private val stopwatchStateHolderList: List<StopwatchStateHolder>
) {

    fun start(stateHolder: StopwatchStateHolder) {
        stateHolder.start()
    }

    fun pause(stateHolder: StopwatchStateHolder) {
        stateHolder.pause()
    }

    fun stop(stateHolder: StopwatchStateHolder) {
        stateHolder.stop()
    }

    fun startAll() {
        stopwatchStateHolderList.forEach { it.start() }
    }

    fun pauseAll() {
        stopwatchStateHolderList.forEach { it.pause() }
    }

    fun stopAll() {
        stopwatchStateHolderList.forEach { it.stop() }
    }
}