package base;

public interface LeaveHandler {
	public void setNext(LeaveHandler nextChain);
	public void LeaveSupport(LeaveSupport request);
}
