package application.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import application.dao.ChannelDao;

public interface ChannelRepositry extends JpaRepository<ChannelDao,Integer>{
	public Optional<ChannelDao> findBychannelName(String name);
}
