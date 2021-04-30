package com.unae.scheduler

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
class ToDo(var title:String, var fromDateTime:LocalDateTime, var toDateTime: LocalDateTime) {
    constructor(title: String) : this(title, LocalDateTime.now(), LocalDateTime.now().plusHours(2)) {
    }
    constructor(title: String, fromDateTime: LocalDateTime) : this(title, fromDateTime, fromDateTime.plusHours(2)){
    }

    fun setFromDateTime(YY:Int, MM:Int, DD:Int, hh:Int, mm:Int){
        fromDateTime = LocalDateTime.of(YY,MM,DD,hh,mm)
    }

    fun setToDateTime(YY:Int, MM:Int, DD:Int, hh:Int, mm:Int): Boolean {
        val newDateTime = LocalDateTime.of(YY,MM,DD,hh,mm)
        if (fromDateTime.isBefore(newDateTime)){
            toDateTime = newDateTime
            return true
        }
        return false
    }

    fun setName(newTitle:String){
        title = newTitle
    }

}
