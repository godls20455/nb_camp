package com.example.searchimageapp.retrofit

import com.example.searchimageapp.data.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NetWorkInterface {
    @GET("/v2/search/image")
    suspend fun searchImages(
        @Query("query") query: String,  // 검색을 원하는 질의어
        @Query("sort") sort: String,    // 결과 문서 정렬 방식
        @Query("page") page: Int,   // 결과 페이지 번호
        @Query("size") size: Int = 80    // 한 페이지에 보여질 문서 수
    ) : Response<SearchResponse>
}