package Encapsulation.Enp5;

class Book{
    private String Title="Java Programming";
    private String Author="James Gosling";
    private double Price=900;

    public  Book(String title,String author,double price){
        Title=title;
        Author=author;
        Price=price;
    }
    public String getTitle(){
        return Title;
    }
    public String getAuthor(){
        return Author;
    }

    public double getPrice() {
        return Price;
    }
    public void setPrice(double price){
        Price=price;
    }
    public void setTitle(String title){
        Title=title;
    }
    public void setAuthor(String author){
        Author=author;
    }
}
