package com.sudeshi.wordroomsamplekt

import androidx.lifecycle.LiveData

class WordRepository(private val wordDAO: WordDAO) {
    val allWords: LiveData<List<Word>> = wordDAO.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDAO.insert(word)
    }

}