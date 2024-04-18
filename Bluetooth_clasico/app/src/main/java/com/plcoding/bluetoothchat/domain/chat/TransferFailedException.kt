package com.plcoding.bluetoothchat.domain.chat

import java.io.IOException

class TransferFailedException : IOException("Leer los datos fallidos del socket") {

}