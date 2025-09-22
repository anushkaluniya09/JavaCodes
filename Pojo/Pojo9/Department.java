package com.Pojo.Pojo9;

class Department {
    private int deptId;
    private String deptName;
    private String hod;

    public Department() {}
    public Department(int deptId, String deptName, String hod) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.hod = hod;
    }

    public int getDeptId() { return deptId; }
    public void setDeptId(int deptId) { this.deptId = deptId; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getHod() { return hod; }
    public void setHod(String hod) { this.hod = hod; }

    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", deptName=" + deptName + ", hod=" + hod + "]";
    }
}
