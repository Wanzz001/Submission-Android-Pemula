package com.wanzz.pgrcharwiki

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CharModel(
    var name: String = "",
    var role: String = "",
    var weapon: String = "",
    var faction: String = "",
    var info: String = "",
    var element: String = "",
    var banner: Int = 0,
    var profile: Int = 0,
    var imgFaction: Int = 0,
    var imgRole: Int = 0,
    var link: String = ""
) :Parcelable
