class Book{
private String book;
private String author;
private double price;
public String getbook(){
return book;
}
public String getauthor(){
return author;
}
public double getprice(){
return price;
}
public void setbook(String book){
this.book=book;
}
public void setauthor(String author){
this.author=author;
}
public void setprice(double price){
this.price=price;
}
public void applydiscount(double percentage){
price-=(price*(percentage/100));
System.out.println("Price after discount: "+price);
}
}


Public class Record{
public static void main (String[] args){
Scanner s= new Scanner(System.in);
Book b= new Book();
System.out.println("Enter book name: ");
String book=s.nextLine();
System.out.println("Enter author name: ");
String author=s.nextLine();
System.out.println("Enter the price:");
double price=s.nextDouble();
System.out.println("Enter the discount percentage: ");
double percentage=s.nextDouble();
b.setbook(book);
b.setauthor(author);
b.setprice(price);
String B=b.getbook();
String A=b.getauthor();
double P=b.getprice();
b.applydiscount(percentage);
}
}
