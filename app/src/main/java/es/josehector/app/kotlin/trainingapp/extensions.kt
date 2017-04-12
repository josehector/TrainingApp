package es.josehector.app.kotlin.trainingapp

import android.content.Context
import android.widget.Toast

fun Context.toast(text: CharSequence, length : Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this,text, length).show()
}
