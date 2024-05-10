package com.example.searchimageapp.data

import com.google.gson.annotations.SerializedName
import org.w3c.dom.Document

data class SearchResponse(
    @SerializedName("meta")
    val metadata: Metadata,
    @SerializedName("documents")
    var document: MutableList<Document>
)
