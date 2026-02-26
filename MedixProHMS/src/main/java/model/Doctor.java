package model;

public class Doctor {

    private int doctorId;
    private int userId;
    private String fullName;
    private String email;
    private String specialization;
    private int experience;
    private int deptId;

    public Doctor() {}

    public Doctor(int doctorId, String fullName, String email,
                  String specialization, int experience, int deptId) {
        this.doctorId = doctorId;
        this.fullName = fullName;
        this.email = email;
        this.specialization = specialization;
        this.experience = experience;
        this.deptId = deptId;
    }

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

    
}