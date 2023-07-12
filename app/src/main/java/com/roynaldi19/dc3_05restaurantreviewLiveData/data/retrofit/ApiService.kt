package com.roynaldi19.dc3_05restaurantreviewLiveData.data.retrofit

import com.roynaldi19.dc3_05restaurantreviewLiveData.data.response.PostReviewResponse
import com.roynaldi19.dc3_05restaurantreviewLiveData.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
            @Path("id") id: String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}