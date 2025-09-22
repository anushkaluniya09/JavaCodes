package com.Concrete.Concrete8;

class FitnessProgram {
    private String programName;
    private int durationWeeks;

    public FitnessProgram(String programName, int durationWeeks) {
        this.programName = programName;
        this.durationWeeks = durationWeeks;
    }

    public void showProgram() {
        System.out.println(programName + " lasts for " + durationWeeks + " weeks");
    }
}
