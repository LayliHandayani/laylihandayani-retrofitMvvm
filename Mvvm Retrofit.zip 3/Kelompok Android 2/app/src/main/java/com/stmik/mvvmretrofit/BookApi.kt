package com.stmik.mvvmretrofit
import com.stmik.mvvmretrofit.model.Book
import retrofit2.Response
import retrofit2.http.GET
interface BookApi { @GET("book.json")
suspend fun getBooks() : Response<List<Book>>

}