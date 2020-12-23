package tech.tedycoding.chatapp.Fragments;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tech.tedycoding.chatapp.Notifications.MyResponse;
import tech.tedycoding.chatapp.Notifications.Sender;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAsrAe6D4:APA91bFZf3okOGF0G1LNOzzT_hztswS0UPv-Y8Bn3DbXJ_yM3vw39ySnpiDRODocjgWCbqVr09-VrzpirhInID8pLTviNjXKN4auFdBd9hZ5jrnuc-7Rwba1GFUrjwHlcj-vNEDgqKiI"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
