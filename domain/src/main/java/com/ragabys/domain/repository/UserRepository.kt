package com.ragabys.domain.repository

interface UserRepository {
    suspend fun checkToken():Result<Boolean>
}