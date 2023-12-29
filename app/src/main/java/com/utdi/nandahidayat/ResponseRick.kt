//berikut ini adalah file plugin yang sudah dibuat,
//dan data dari rickandmorty sudah dimasukkan kedalam file ini
//selanjutnya beralih ke ApiServie
//pada bagian ini juga terdapat class yang digunakan untuk model data
package com.utdi.nandahidayat
import com.google.gson.annotations.SerializedName

data class ResponseRick(

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null,

	@field:SerializedName("info")
	val info: Info? = null
)

data class Info(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("pages")
	val pages: Int? = null,

	@field:SerializedName("prev")
	val prev: Any? = null,

	@field:SerializedName("count")
	val count: Int? = null
)

data class Origin(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Location(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class ResultsItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("species")
	val species: String? = null,

	@field:SerializedName("created")
	val created: String? = null,

	@field:SerializedName("origin")
	val origin: Origin? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("episode")
	val episode: List<String?>? = null,

	@field:SerializedName("com")
	val id: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
