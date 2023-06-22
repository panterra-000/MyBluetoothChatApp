package mapp.test.mybluetoothchatapp.presentation

import mapp.test.mybluetoothchatapp.domain.BluetoothDevice

data class BluetoothUiState(
    val isConnected: Boolean = false,
    val isConnection: Boolean = false,
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
)
