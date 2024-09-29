package com.ragabys.data.repository

import com.ragabys.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(

) : UserRepository{
    override suspend fun checkToken(): Result<Boolean> {
        TODO("Not yet implemented")
    }
}