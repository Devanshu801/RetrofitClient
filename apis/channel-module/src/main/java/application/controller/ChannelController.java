package application.controller;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Channel;
import application.service.ChannelService;

@RestController
@RequestMapping("/api/v1/channels/")
public class ChannelController {
	
	@Autowired
	private ChannelService channelService;
	
	@DeleteMapping("{id}")
	private ResponseEntity<Channel> deletechannel(@PathVariable("id") int id){
		if(!Objects.isNull(id)) {
		channelService.deletechannel(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	}
		return new ResponseEntity<Channel>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("")
	private ResponseEntity<Channel> registerChannel(@RequestBody Channel channel){
		//validation
		Optional<Channel> channelfromdatabase = channelService.registerChannel(channel);
		if(!Objects.isNull(channelfromdatabase)) {
			return ResponseEntity.status(HttpStatus.CREATED).body(channel);
		}
		return new ResponseEntity<Channel>(HttpStatus.CONFLICT);
	}
	@PostMapping("/login")
	private ResponseEntity<Optional<Channel>> login(@RequestBody Channel channel){
		//validation
		Optional<Channel> channeldb = channelService.login(channel);
		if(channeldb!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(channeldb);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	@GetMapping("/{id}")
	private ResponseEntity<Channel> getchannelbyid(@PathVariable("id") int id, Channel channel){
		Optional<Channel> channelfromdatabase = channelService.getChannelById(channel);
		if(!Objects.isNull(channelfromdatabase)) {
			channelService.getChannelById(channel);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(channel);
		}
		return new ResponseEntity<Channel>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("")
	  public ResponseEntity<Object> getChannelWithUsers()throws Exception{
		  channelService.getChannelwithusers();		  
		  ResponseEntity.status(HttpStatus.OK);
		  return null;
	  }
}
