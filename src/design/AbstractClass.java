package design;

public abstract class  AbstractClass implements Employee{
    final String empName = "John Smith";
    static String resignationDate = "01/01/2010";
    int rating;

    //Method overloading
    public void performance (){}
    public void performance(String rating) {}

    //Method overloading
    public void farewell(){}
    public void farewell(int date) {}


}
