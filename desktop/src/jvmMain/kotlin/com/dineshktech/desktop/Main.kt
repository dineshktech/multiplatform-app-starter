package com.dineshktech.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.dineshktech.common.Application


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
       Application()
    }
}
