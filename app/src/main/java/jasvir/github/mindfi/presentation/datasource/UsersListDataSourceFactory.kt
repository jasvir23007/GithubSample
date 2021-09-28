package jasvir.github.mindfi.presentation.datasource

import androidx.paging.DataSource
import androidx.lifecycle.MutableLiveData
import jasvir.github.mindfi.data.remote.api.models.GithubUserModel
import jasvir.github.mindfi.domain.api.GithubApiClient

class UsersListDataSourceFactory(private val githubApiClient: GithubApiClient): DataSource.Factory<Int, GithubUserModel>() {

    val liveData: MutableLiveData<UsersListDataSource> = MutableLiveData()

    override fun create(): DataSource<Int, GithubUserModel> {
        val usersListDataSource = UsersListDataSource(githubApiClient)
        liveData.postValue(usersListDataSource)
        return usersListDataSource
    }
}