
import java.util.ArrayList;

public class RequestManagement {

	private ArrayList<Request> incomingRequests;
	private int requestId = 0;

	public RequestManagement(Request[] incomingRequests, int requestId) {
		this.incomingRequests = new ArrayList<>();
		this.requestId = requestId;
	}

	public ArrayList<Request> getIncomingRequests() {
		return incomingRequests;
	}

	public void setIncomingRequests(ArrayList<Request> incomingRequests) {
		this.incomingRequests = incomingRequests;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public void addRequest(Request incomingRequest) {
		incomingRequest.setRequestId(requestId);
		requestId++;
		incomingRequests.add(incomingRequest);
	}

}
