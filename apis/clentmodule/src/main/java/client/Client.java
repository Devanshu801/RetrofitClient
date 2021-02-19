package client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Client {
	
	@GET("/api/v1/users/list")
	Call<List<Object>> listrepos();
	
	/*
	@GET("/api/v1/users/")
	Single<Response<User>> getUserById(@Path(value = "user_id") User userId, @Query(value = "raw") boolean raw);
	*/
	
}
	
