package base;

public class ProjectManager implements LeaveHandler {
private LeaveHandler nextChain;
	
	@Override
	public void setNext(LeaveHandler nextChain) {
		this.nextChain =nextChain;

	}

	String reason, name;
	int duration;
	@Override
	public void LeaveSupport(LeaveSupport request) {
		reason = request.getReason();
		name = request.getName();
		duration = request.getDuration();
		if(duration <=30) {
			System.out.println("ProjectManager can grant the leave.");
			request.ShowDetails();
			System.out.println("The Developer : ("+name+") has been granted leave of "+duration+" days for "+reason);
		}else {
			System.out.println("TeamLeader Can not grant the leave....Going for next");
			nextChain.LeaveSupport(request);
		}
	}
}
