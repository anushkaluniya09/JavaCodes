package Polymorphism.Poly9;

class Library {
    public void search(String title){
        System.out.println("Searching book by title: " +title);
    }
    public void search(int id){
        System.out.println("Searching book by ID: " + id);
    }
}
