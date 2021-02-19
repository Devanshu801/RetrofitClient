package application.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="channel")
public class ChannelDao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private  int id;
	@Column
	@Size(min=3,max=30)
	private  String channelName;
	@Column	
	private String channelCategory;
	@Column	
	private long channelCreated;
	@Column	
	private long channelUpdated;

	public ChannelDao() {
		super();
	}

	public ChannelDao(int id, @Size(min = 3, max = 30) String channelName, String channelCategory, long channelCreated,
			long channelUpdated) {
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
		return "ChannelDao [id=" + id + ", channelName=" + channelName + ", channelCategory=" + channelCategory
				+ ", channelCreated=" + channelCreated + ", channelUpdated=" + channelUpdated + "]";
	}
	
}
