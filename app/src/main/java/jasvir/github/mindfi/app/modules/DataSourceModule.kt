package jasvir.github.mindfi.app.modules

import jasvir.github.mindfi.presentation.datasource.UsersListDataSourceFactory
import org.koin.dsl.module

val usersListDataSourceFactory = module {
    single { UsersListDataSourceFactory(get()) }
}