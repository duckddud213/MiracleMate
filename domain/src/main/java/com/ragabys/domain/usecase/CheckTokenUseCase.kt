package com.ragabys.domain.usecase

import com.ragabys.domain.repository.UserRepository
import javax.inject.Inject

class CheckTokenUseCase @Inject constructor(
    private val repository : UserRepository
){
}