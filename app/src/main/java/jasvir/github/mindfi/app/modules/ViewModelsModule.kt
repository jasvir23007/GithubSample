package jasvir.github.mindfi.app.modules

import jasvir.github.mindfi.presentation.viewmodel.SingleUserViewModel
import jasvir.github.mindfi.presentation.viewmodel.UsersListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
    
val usersListViewModel = module {
    viewModel { UsersListViewModel(get()) }
}

val singleUserViewModel = module {
    viewModel { SingleUserViewModel(get()) }
}