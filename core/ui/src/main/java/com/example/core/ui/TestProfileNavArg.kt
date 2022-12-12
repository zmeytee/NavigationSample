package com.example.core.ui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class TestProfileNavArg(
    val email: String,
    val phone: String,
) : Parcelable