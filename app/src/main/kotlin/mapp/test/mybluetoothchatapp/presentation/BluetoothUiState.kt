package mapp.test.mybluetoothchatapp.presentation

import mapp.test.mybluetoothchatapp.domain.BluetoothDevice

data class BluetoothUiState(
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val errorMessage:String? = null,
)
