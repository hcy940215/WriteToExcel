package com.gezi.writetoexcel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell on 2017/10/11.
 */

public interface InternetService {
//    cate1 = 1
//    cate2=101
//    cate2=110
//    cate2=102
//    cate2=111
//    cate2=106
//    cate2=108

    @GET("/v2.0/search/search_cate?platform=android&city_id=101&device_id=861837032633193&mid=0&token=4093922685a4aa877835f7088b9e6a5c_1507701144_98833_97187&version=3.3.0&cid=97187&bid=0")
    Call<Entity<Haocai>> getData(@Query("cate1") int cate1,
                                 @Query("cate2") int cate2,
                                 @Query("page") int page);
}
