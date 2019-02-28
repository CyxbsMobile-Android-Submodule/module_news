package com.mredrock.cyxbs.discover.news.bean

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsDetails(@SerializedName("urlData")
                       val attachment: List<NewsAttachment> = listOf(),
                       @SerializedName("title")
                       val title: String = "",
                       @SerializedName("pubTime")
                       val pubTime: String = "",
                       @SerializedName("teaName")
                       val teaName: String = "",
                       @SerializedName("readCount")
                       val readCount: Int = 0,
                       @SerializedName("content")
                       val content: String = ""): Serializable