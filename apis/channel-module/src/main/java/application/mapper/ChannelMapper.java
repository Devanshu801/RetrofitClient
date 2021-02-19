package application.mapper;

import org.springframework.beans.BeanUtils;

import application.dao.ChannelDao;
import application.model.Channel;

public class ChannelMapper {
	public static Channel ChannelDaoToChannel(ChannelDao channeldao) {
		Channel channel = new Channel();
		BeanUtils.copyProperties(channeldao, channel);
		return  channel;
	}
	public static ChannelDao ChannelToChannelDao(Channel channel) {
		ChannelDao channeldao = new ChannelDao();
		BeanUtils.copyProperties(channel, channeldao); 
		return  channeldao;
	}
}

