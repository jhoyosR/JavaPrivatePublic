package Reclamo;

import java.util.Objects;

public class Complaint {
    public int complaintNumber;
    private String complainerName;
    private String subject;
    public String complaintDescription;
    private String complaintStatus;

    public String getComplainerName() {
        return complainerName;
    }

    public void setComplainerName(String complainerName) {
        this.complainerName = complainerName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String complaintStatusValidation(){
        return "The status of your complaint is: " + getComplaintStatus();
    }

    public String complaintReceived() {
        if (Objects.equals(this.complaintStatus, "In progress")) {
            return "Your complaint has been sent and will be taken care of soon";
        } else if (Objects.equals(this.complaintStatus, "Solved")){
            return "Your complaint has been solved";
        } else {
            return "If any, send a complaint and our team will take care of it";
        }
    }
}
