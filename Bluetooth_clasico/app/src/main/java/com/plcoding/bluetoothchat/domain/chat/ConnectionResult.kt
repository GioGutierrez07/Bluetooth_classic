package com.plcoding.bluetoothchat.domain.chat

sealed interface ConnectionResult {
    object ConnectionEstablished: ConnectionResult
    data class TransferSuccess(val message: BluetoothMessage): ConnectionResult
    data class Error(val message: String): ConnectionResult
}