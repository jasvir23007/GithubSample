package jasvir.github.mindfi.data.remote.api

import jasvir.github.mindfi.data.remote.api.models.*
import retrofit2.Response
import retrofit2.http.*

interface GithubApi {

    @GET("search/users?q=repos:>1")
    suspend fun getUsersList(
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): Response<GetGithubUserResponseModel>

    @GET("users/{username}")
    suspend fun getUserInfo(
        @Path("username") username: String
    ): Response<GithubUserModel>
}