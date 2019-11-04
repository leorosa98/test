import java.sql.Date;

public class Request {
	
	private TypeOfFood typeOfFood;
	private int requestId;
	private Date requestDate;
	private Date estimateDelivery;
	
	public Request(TypeOfFood typeOfFood, Date requestDate, Date estimateDelivery) {
		this.typeOfFood = typeOfFood;
		this.requestDate = requestDate;
		this.estimateDelivery = estimateDelivery;
	}

	public TypeOfFood getTypeOfFood() {
		return typeOfFood;
	}

	public int getRequestId() {
		return requestId;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public Date getEstimateDelivery() {
		return estimateDelivery;
	}

	public void setTypeOfFood(TypeOfFood typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public void setEstimateDelivery(Date estimateDelivery) {
		this.estimateDelivery = estimateDelivery;
	}
	

}
