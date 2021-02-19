package gateway;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import client.Client;
import config.Config;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;


public class Gateway {
	
	Client client;
	/*
	public Gateway() {
		
	}
	
	public Object getObject() throws IOException{		
		Call<List<Object>> retrofitCall = client.listrepos();
		Response<List<Object>> response = retrofitCall.execute();
		return response.body();
	}
	*/
	public Object channel() throws Exception{
		Retrofit retrofit = Config.getRetrofitInstance();
		client = retrofit.create(Client.class);
		Call<List<Object>> call = client.listrepos();
		Response<List<Object>> response = call.execute();
		if(response.code() == HttpStatus.NO_CONTENT.value()) {
			throw new Exception("No_user");
		}
		return response.body();
	}
/*
	public Hotel getHotelById(UUID hotelId) {
	Response<Hotel> hotelResponse = masterClient.getHotelById(hotelId, true).blockingGet();
	if (hotelResponse.code() == HttpStatus.NO_CONTENT.value()) {
	throw new BusinessException(ErrorCodes.HOTEL_NOT_FOUND, HttpStatus.BAD_REQUEST);

	}
	if (!hotelResponse.isSuccessful()) {
	throw new BusinessException(ErrorCodes.HOTEL_NOT_FOUND, HttpStatus.BAD_REQUEST);
	}
		*/
	
	
	
	
}
