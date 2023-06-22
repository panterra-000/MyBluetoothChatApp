package mapp.test.mybluetoothchatapp.domain.controller

import kotlinx.coroutines.flow.StateFlow
import mapp.test.mybluetoothchatapp.domain.BluetoothDevice

interface BluetoothController {
    val scannedDevices:StateFlow<List<BluetoothDevice>>
    val pairedDevices:StateFlow<List<BluetoothDevice>>

    fun startDiscovery()
    fun stopDiscovery()
    fun startBluetoothServer()
    fun release()

}