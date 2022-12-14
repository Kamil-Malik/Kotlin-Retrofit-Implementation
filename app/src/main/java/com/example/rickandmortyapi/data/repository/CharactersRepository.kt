package com.example.rickandmortyapi.data.repository

import com.example.rickandmortyapi.data.model.ResponseAPI
import retrofit2.Response

interface CharactersRepository {
    suspend fun getCharacters(page : String) : ResponseAPI
}