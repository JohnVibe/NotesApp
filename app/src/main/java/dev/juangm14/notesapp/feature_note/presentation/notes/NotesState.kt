package dev.juangm14.notesapp.feature_note.presentation.notes

import androidx.compose.runtime.MutableState
import dev.juangm14.notesapp.feature_note.domain.model.Note
import dev.juangm14.notesapp.feature_note.domain.util.NoteOrder
import dev.juangm14.notesapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
