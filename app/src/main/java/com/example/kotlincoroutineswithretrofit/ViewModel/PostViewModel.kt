package com.example.kotlincoroutineswithretrofit.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlincoroutineswithretrofit.Repository.PostRepository
import com.example.kotlincoroutineswithretrofit.model.Post
import kotlinx.coroutines.launch

class PostViewModel(private val postRepository: PostRepository) : ViewModel() {

    val postMutableLiveData: MutableLiveData<List<Post>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            try {
                val response = postRepository.getPost()
                postMutableLiveData.value = response
            }catch (e:Exception){
                Log.d("main","getPost: ${e.message}")
            }

        }
    }
}