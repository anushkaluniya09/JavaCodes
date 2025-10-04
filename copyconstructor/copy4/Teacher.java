package copyconstructor.copy4;
class TeacherAssistant {
    String name;
    int batch;

    TeacherAssistant(String name, int batch) {
        this.name = name;
        this.batch = batch;
    }

    TeacherAssistant(TeacherAssistant ta) {
        this.name = ta.name;
        this.batch = ta.batch;
    }

    void show() {
        System.out.println("TA: " + name + ", Batch: " + batch);
    }
}
