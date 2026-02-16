package dev.juangm14.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.juangm14.notesapp.ui.theme.*

@Entity //For Room
data class Note(
val title: String,
    val content: String,
    val color: Int,
    val timestamp: Long,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}


class InvalidNoteException(message: String): Exception(message)