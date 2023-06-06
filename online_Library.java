class library{
String books[];
int noOfBooks;

library(){
this.books=new String[100];
this.noOfBooks=0;
}
void addBook(String book){
	for(int i=0;i<books.length;i++){
		if(books[i]==null){
this.books[i]=book;
System.out.println(book+" has been added");
break;
}
noOfBooks++;
}
}
void showAvailableBooks(){
for(int i=0;i<books.length;i++){
if(books[i]==null){
continue;
}
	System.out.println(books[i]);
}
System.out.println(noOfBooks);
}
void issueBook(String book){
for(int i=0;i<books.length;i++){
if(this.books[i].equals(book)){
this.books[i]=null;
System.out.println(book+" has been issued");
noOfBooks--;
return;
}
}
System.out.println("Book does not exist");
}
void returnBook(String book){
addBook(book);
}
}

class online_Library{
	public static void main(String args[]){
		library L=new library();
		L.addBook("Rich dad poor dad");
		L.addBook("Python");
		L.addBook("C++");
		L.showAvailableBooks();
		L.issueBook("Python");
		L.showAvailableBooks();
		L.returnBook("Python");
		L.showAvailableBooks();
	}
}