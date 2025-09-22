package com.Final.Final11;

final class Certificate {
    private String certName;
    private String issuedBy;

    public Certificate(String certName, String issuedBy) {
        this.certName = certName;
        this.issuedBy = issuedBy;
    }

    public void displayCertificate() {
        System.out.println(certName + " issued by " + issuedBy);
    }
}
