package com.example.kotlinalertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSimpleMultiChoiceDialog()
    }

    private fun createSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("AlertDialog")
        builder.setMessage("This is AlertDialog")
        builder.setNeutralButton("Info") { dialogInterface, i -> }
        builder.setNegativeButton("No") { dialogInterface, i -> }
        builder.setPositiveButton("Yes") { dialogInterface, i -> }
        builder.show()
    }

    private fun createSimpleMultiChoiceDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Что вам больше нравится?")
        builder.setMultiChoiceItems(R.array.multi_item, null)
        { dialogInterface, position, boolean ->

            Log.d("MyLog", "My Choice is $position,$boolean")
        }


        builder.setNeutralButton("Info") { dialogInterface, i -> }
        builder.setNegativeButton("No") { dialogInterface, i -> }
        builder.setPositiveButton("Yes") { dialogInterface, i -> }
        builder.show()
    }
}