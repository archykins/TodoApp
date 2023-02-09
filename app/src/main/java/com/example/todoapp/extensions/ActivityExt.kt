package com.example.todoapp.extensions

import android.app.Activity
import android.text.Editable
import com.google.android.material.textfield.TextInputEditText


fun Activity.validateMy(text: Editable?):String?{
    return if (text.toString().isNotEmpty() && text.toString().length >= 7 && text.toString().contains("@")) null
    else if (text.toString().isEmpty()) "The field cannot be empty"
    else if (text.toString().length<7)"The field must contain more than 7 characters"
    else "The email must contain @"
}
fun Activity.validatePass(text: Editable?): String? {
    return if (text.toString().isNotEmpty() && text.toString().length>8 ) null
    else if (text.toString().isEmpty()) "The field cannot be empty"
    else "The password must contain 8 characters"
}
fun Activity.validateFullname(text: Editable?):String?{
    return if (text.toString().isNotEmpty()) null
        else "The field cannot be empty"

}
fun Activity.validateConfirm (password: TextInputEditText, confirm: TextInputEditText ):String?{
    val passValue = password.text.toString()
    val confirmValue = confirm.text.toString()
    return if (passValue.isEmpty() || confirmValue.isEmpty()) "The field cannot be empty"
    else if (confirmValue!=passValue)"Passwords must be the same"
    else null
}
