class Publisher 
{
	String name;
	String publisherID;
	String city;

	publisher(String name, String publisherID, String city)
	{
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
}
class author
{
	String authorName;
	int age;
	String place;

	//Author class constructor
	author(String name, int age, String place)
	{
		this.authorname = name;
		this.age = age;
		this.place =  place;
	}
}
class Book
//book calss has a author
//book calss has a publisher 
{
	String name;
	int price;
	Author auther;
	Publisher publisher;

	Book(String price, int p, Author auther, Publisher publisher)
	{
		this.name = n;
		this.price = p;
		this.auther = auther;
		this.publisher = publisher;
	}

	public static void main(String[] args) 
	{
		Auther auther = new authir("John", 42 , "usa");
		Publisher publisher = new Publisher ("Sun publication", "JDSR-III4",
			"LA");
		Book b = new Book("Java for beginer",  800, auther, publisher);

		System.out.println("Book Name"+b.name);
		System.out.println("Book Price"+b.price);
		System.out.println("------Author Details-------");
		System.out.println("Author Name"+b.auther.authorname);
		System.out.println("Author age"+b.auther.auther.age);
		System.out.println("Author Place"+b.auther.auther.place);
		System.out.println("------Publisher Details------");
		System.out.println("Publisher Name"+b.publisher.name);
		System.out.println("Publisher ID"+b.publisher.publisherID);
		System.out.println("Publisher city"+b.publisher.city);
	}
}
