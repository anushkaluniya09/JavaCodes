package com.Final.Final21;

final class GymMembership {
    private String memberId;
    private String memberName;
    private String plan;

    public GymMembership(String memberId, String memberName, String plan) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.plan = plan;
    }

    public void showMembership() {
        System.out.println(memberName + " has " + plan + " membership (ID: " + memberId + ")");
    }
}
