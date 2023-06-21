package mapp.test.mybluetoothchatapp.presentation

import mapp.test.mybluetoothchatapp.domain.BluetoothDevice

data class BluetoothUiState(
     val scannedDevices:List<BluetoothDevice> = emptyList(),
     val pairedDevices:List<BluetoothDevice> = emptyList(),
)
