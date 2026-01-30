package dev.juangm14.notesapp.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.juangm14.notesapp.feature_note.data.data_source.NoteDatabase
import dev.juangm14.notesapp.feature_note.data.repository.NoteRepositoryImpl
import dev.juangm14.notesapp.feature_note.domain.repository.NoteRepository
import dev.juangm14.notesapp.feature_note.domain.use_case.DeleteNote
import dev.juangm14.notesapp.feature_note.domain.use_case.GetNotes
import dev.juangm14.notesapp.feature_note.domain.use_case.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabasse(app: Application): RoomDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }


    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDato)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}