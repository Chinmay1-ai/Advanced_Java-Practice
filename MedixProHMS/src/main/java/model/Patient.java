package model;

public class Patient {

    private int patientId;
    private String fullName;
    private String email;
    private String gender;
    private String dob;
    private String bloodGroup;
    private String phone;
    private String address;

    public Patient(int patientId, String fullName, String email,
                   String gender, String dob,
                   String bloodGroup, String phone, String address) {

        this.patientId = patientId;
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.address = address;
    }

    public Patient(){}

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}