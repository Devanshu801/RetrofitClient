package config;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import client.Client;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;


@Configuration
@EnableAutoConfiguration
public class Config {
	
	public static Retrofit getRetrofitInstance() {
		 Retrofit retrofit = new Retrofit.Builder().baseUrl("http:localhost:9000/")
				 .addConverterFactory(GsonConverterFactory.create())
				 .build();
		 return retrofit;
	}
	/*
	@Bean
	public Client client( final Long timeoutSeconds,
	@Value("{api.base.url}") final String baseUrl) {
	return new Retrofit.Builder()
	.client(new OkHttpClient.Builder().readTimeout(timeoutSeconds, TimeUnit.SECONDS)
	.addInterceptor(new HttpLoggingInterceptor().setLevel(Level.BASIC)).build())
	.baseUrl(baseUrl).addConverterFactory(JacksonConverterFactory.create(buildDefaultMapper()))
	//.addConverterFactory(ScalarsConverterFactory.create())
	.addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build().create(Client.class);

	}

	private ObjectMapper buildDefaultMapper() {
	final ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.registerModule(new JavaTimeModule());
	objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	return objectMapper;	
	}
	*/
	
	
}
