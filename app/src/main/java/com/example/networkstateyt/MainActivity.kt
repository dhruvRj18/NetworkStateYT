package com.example.networkstateyt

import android.net.ConnectivityManager
import android.net.Network
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectivityManager = getSystemService(ConnectivityManager::class.java)
        connectivityManager.registerDefaultNetworkCallback(object : ConnectivityManager.NetworkCallback(){
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                Log.d("NETWORK_STATE", "available")

            }

            override fun onLost(network: Network) {
                super.onLost(network)
                Log.d("NETWORK_STATE", "lost")

            }
        })

    }
}