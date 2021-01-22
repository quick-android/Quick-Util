package com.github.android.quick.util

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.toast(msg: String, duration: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, msg, duration).show()

fun Fragment.toast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    context?.toast(msg, duration)
}

