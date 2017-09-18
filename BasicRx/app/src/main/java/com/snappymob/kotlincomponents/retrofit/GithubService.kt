package com.snappymob.kotlincomponents.retrofit

import com.snappymob.kotlincomponents.model.Repo
import com.snappymob.kotlincomponents.network.ApiResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path




/**
 * Created by ahmedrizwan on 9/9/17.
 */
interface GithubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Flowable<ApiResponse<List<Repo>>>

    @GET("users/{login}/repos")
    fun getRepos(@Path("login") login: String): Flowable<ApiResponse<List<Repo>>>

}