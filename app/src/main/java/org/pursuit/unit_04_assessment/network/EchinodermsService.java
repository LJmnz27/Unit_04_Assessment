package org.pursuit.unit_04_assessment.network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface EchinodermsService {
    @GET("JDVila/storybook/master/echinoderms.json")
    Call<Response> getResponse();
}
