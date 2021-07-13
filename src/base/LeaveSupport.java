package base;

public class LeaveSupport {

	private int duration;
	private String reason;
	private String name;
	public LeaveSupport( String name, int duration, String reason) {
		this.duration = duration;
		this.reason =reason;
		this.name =name;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void ShowDetails() {
		System.out.println("-----------------------------");
		System.out.println("Developer Name: "+name+" => Leave: "+duration+" days Reason: "+reason);
	
	}

}
