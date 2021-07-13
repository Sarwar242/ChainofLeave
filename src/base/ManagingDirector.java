package base;

public class ManagingDirector implements LeaveHandler {

	@Override
	public void setNext(LeaveHandler nextChain) {
		
	}

	String reason, name;
	int duration;
	@Override
	public void LeaveSupport(base.LeaveSupport request) {
		reason = request.getReason();
		name = request.getName();
		duration = request.getDuration();
		if(reason.equalsIgnoreCase("parental") || reason.equalsIgnoreCase("marriage")) {
			System.out.println("ManagingDirector can grant the leave.");
			request.ShowDetails();
			System.out.println("The Developer : ("+name+") has been granted leave of "+duration+" days for "+reason);
		}else {
			System.out.println("Sorry you leave request is not accepted");
		}
	}
}
