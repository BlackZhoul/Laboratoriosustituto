package com.lluvians.alvaro.laboratoriocalificadosustitutorio.network

import com.lluvians.alvaro.laboratoriocalificadosustitutorio.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}
