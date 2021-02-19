package application.model;

import javax.persistence.Id;



public class Channel {

	
	@Id
	private int id;
	private  String channelName;
	private String channelCategory;
	private long channelCreated;
	private long channelUpdated;
	
	public Channel() {
		super();
	}

	public Channel(int id, String channelName, String channelCategory, long channelCreated, long channelUpdated) {
		super();
		this.id = id;
		this.channelName = channelName;
		this.channelCategory = channelCategory;
		this.channelCreated = channelCreated;
		this.channelUpdated = channelUpdated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelCategory() {
		return channelCategory;
	}

	public void setChannelCategory(String channelCategory) {
		this.channelCategory = channelCategory;
	}

	public long getChannelCreated() {
		return channelCreated;
	}

	public void setChannelCreated(long channelCreated) {
		this.channelCreated = channelCreated;
	}

	public long getChannelUpdated() {
		return channelUpdated;
	}

	public void setChannelUpdated(long channelUpdated) {
		this.channelUpdated = channelUpdated;
	}

	@Override
	public String toString() {
		return "Channel [id=" + id + ", channelName=" + channelName + ", channelCategory=" + channelCategory
				+ ", channelCreated=" + channelCreated + ", channelUpdated=" + channelUpdated + "]";
	}
	
}
