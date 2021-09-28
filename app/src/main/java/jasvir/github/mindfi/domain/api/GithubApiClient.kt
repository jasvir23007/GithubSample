package jasvir.github.mindfi.domain.api

import jasvir.github.mindfi.data.remote.api.base.Resource
import jasvir.github.mindfi.data.remote.api.models.*

interface GithubApiClient {

    suspend fun getUsersList(page: Int, pageSize: Int): Resource<GetGithubUserResponseModel>

    suspend fun getUserInfo(username: String): Resource<GithubUserModel>
}