package application.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import application.dao.ChannelDao;
import application.mapper.ChannelMapper;
import application.model.Channel;
import application.repositry.ChannelRepositry;
import gateway.Gateway;




@Service
public class ChannelService {
	
	@Autowired
	private ChannelRepositry channelRepositry;
	
	@Autowired
	private Gateway ge;
	
	

	
	public Optional<Channel> login(Channel channel){
		Optional<ChannelDao> channelid = channelRepositry.findBychannelName(channel.getChannelName());
		if(channelid.isPresent()) {
				return Optional.ofNullable(null);
			}
		ChannelDao channeldao = ChannelMapper.ChannelToChannelDao(channel);
		channeldao= channelRepositry.save(channeldao);
		return Optional.of(channel);
		}

	
	public Optional<Channel> registerChannel(Channel channel){
		Optional<ChannelDao> channelExists = channelRepositry.findBychannelName(channel.getChannelName());
		if(channelExists.isPresent()) {
			return null;
		}
		ChannelDao channelDao = ChannelMapper.ChannelToChannelDao(channel);
		channelDao = channelRepositry.save(channelDao);
		return Optional.of(channel);
		}
	
	public Optional<Channel> getChannelById(Channel channel){
		Optional<ChannelDao> channelid = channelRepositry.findById(channel.getId());
			if(channelid.isPresent()) {
				return Optional.of(channel);
				
	}
			return null;
	 }
	public void deletechannel(int id) {
		Optional<ChannelDao> channel = channelRepositry.findById(id);
		if(channel.isPresent()) {
		channelRepositry.deleteById(id);
		}
		return;
		}	
	
		public ResponseEntity<Object> getChannelwithusers()throws Exception {
	    	System.out.println("Response" +ge.channel());
		 return null;
	    }
}
