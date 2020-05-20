package com.gowthamvarma.sgbus.pojo;

import com.google.gson.annotations.SerializedName;

public class BusService {

	public static final String IN_OPERATION = "In Operation";
	public static final String NOT_IN_OPERATION = "Not In Operation";

    public static final String OPERATOR_SBST = "SBST";
    public static final String OPERATOR_SMRT = "SMRT";

    public boolean isInOperation(){
        return IN_OPERATION.equalsIgnoreCase(status);
    }

    public boolean isOperatorSBST(){
        return OPERATOR_SBST.equalsIgnoreCase(operator);
    }

    public boolean isOperatorSMRT(){
        return OPERATOR_SMRT.equalsIgnoreCase(operator);
    }
    
	@Override
	public String toString() {
		return "BusService [serviceNo=" + serviceNo + ", status=" + status + ", operator=" + operator
				+ ", originatingID=" + originatingID + ", terminatingID=" + terminatingID + ", nextBus=" + nextBus
				+ ", subsequentBus=" + subsequentBus + ", subsequentBus3=" + subsequentBus3 + ", isInOperation()="
				+ isInOperation() + ", isOperatorSBST()=" + isOperatorSBST() + ", isOperatorSMRT()=" + isOperatorSMRT()
				+ "]";
	}

	@SerializedName("ServiceNo")
	private String serviceNo;
	
	@SerializedName("Status")
	private String status;
	
	@SerializedName("Operator")
	private String operator;
	
	@SerializedName("OriginatingID")
	private int originatingID;
	
	@SerializedName("TerminatingID")
	private int terminatingID;
	
	@SerializedName("NextBus")
	private NextBus nextBus;
	
	@SerializedName("SubsequentBus")
	private NextBus subsequentBus;

    @SerializedName("SubsequentBus3")
    private NextBus subsequentBus3;

    public NextBus getSubsequentBus3() {
        return subsequentBus3;
    }

    public void setSubsequentBus3(NextBus subsequentBus3) {
        this.subsequentBus3 = subsequentBus3;
    }

    public NextBus getSubsequentBus() {
        return subsequentBus;
    }

    public void setSubsequentBus(NextBus subsequentBus) {
        this.subsequentBus = subsequentBus;
    }

    public NextBus getNextBus() {
        return nextBus;
    }

    public void setNextBus(NextBus nextBus) {
        this.nextBus = nextBus;
    }

    public int getTerminatingID() {
        return terminatingID;
    }

    public void setTerminatingID(int terminatingID) {
        this.terminatingID = terminatingID;
    }

    public int getOriginatingID() {
        return originatingID;
    }

    public void setOriginatingID(int originatingID) {
        this.originatingID = originatingID;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

}
