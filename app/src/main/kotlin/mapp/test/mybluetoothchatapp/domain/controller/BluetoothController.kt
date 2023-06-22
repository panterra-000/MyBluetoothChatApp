package mapp.test.mybluetoothchatapp.domain.controller

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import mapp.test.mybluetoothchatapp.domain.BluetoothDevice
import mapp.test.mybluetoothchatapp.domain.ConnectionResult

interface BluetoothController {
    val isConnected:StateFlow<Boolean>
    val scannedDevices: StateFlow<List<BluetoothDevice>>
    val pairedDevices: StateFlow<List<BluetoothDevice>>
    val errors:SharedFlow<String>
    fun startDiscovery()
    fun stopDiscovery()
    fun release()


    fun startBluetoothServer(): Flow<ConnectionResult>

    fun connectToDevice(device: BluetoothDevice): Flow<ConnectionResult>

    fun closeConnection()
}