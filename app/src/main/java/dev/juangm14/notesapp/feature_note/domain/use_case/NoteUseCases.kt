package dev.juangm14.notesapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val addNote: AddNote,
    val deleteNote: DeleteNote
)
