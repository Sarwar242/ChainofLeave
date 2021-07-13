package base;

public class ClientClass {

	public static void main(String[] args) {
		LeaveHandler c1 = new TeamLeader();
		LeaveHandler c2 = new ProjectManager();
		LeaveHandler c3 = new HR();
		LeaveHandler c4 = new ManagingDirector();
		
		c1.setNext(c2);
		c2.setNext(c3);
		c3.setNext(c4);

		
		LeaveSupport request = new LeaveSupport("Sarwar",20, "rest");
		c1.LeaveSupport(request);


	}

}
