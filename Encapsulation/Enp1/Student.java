package Encapsulation.Enp1;

class Student {
    private String name="Anushka Luniya";
    private int age=21;
    private String email="Anu@1234";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
