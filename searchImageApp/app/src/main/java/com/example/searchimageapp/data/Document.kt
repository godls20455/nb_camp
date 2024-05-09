package com.example.searchimageapp.data

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Document(
    @SerializedName("collection")
    val collection : String?, // 컬렉션
    @SerializedName("thumbnail_url")
    val thumbnailUrl : String?,  // 미리보기 이미지 URL
    @SerializedName("image_url")
    val imageUrl : String?,  // 이미지 URL
    @SerializedName("width")
    val width : Int?,  // 이미지의 가로 길이
    @SerializedName("height")
    val height : Int?,  // 이미지의 세로 길이
    @SerializedName("display_sitename")
    val displaySitename : String?,  // 출처
    @SerializedName("doc_urll")
    val docUrl : String?,  // 문서 URL
    @SerializedName("dateTime")
    val dateTime : Date?  // 문서 작성시간
)
