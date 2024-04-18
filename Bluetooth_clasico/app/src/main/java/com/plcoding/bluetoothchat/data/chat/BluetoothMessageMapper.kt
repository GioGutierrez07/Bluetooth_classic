package com.plcoding.bluetoothchat.data.chat

import com.plcoding.bluetoothchat.domain.chat.BluetoothMessage

fun String.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return BluetoothMessage(message, name, isFromLocalUser)
}

fun BluetoothMessage.toByteArray(): ByteArray {
    return "senderName#$message".encodeToByteArray()
}