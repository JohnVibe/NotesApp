package dev.juangm14.notesapp.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintInvisible: Boolean = true
)
