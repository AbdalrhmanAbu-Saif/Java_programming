package JavaProgramming1.Part5.LearningOOP.Book;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String name, int pages){
        this.author=author;
        this.title=name;
        this.pageCount=pages;
    }
    public String getAuthor(){
        return  this.author;
    }
    public String getName(){
        return this.title;
    }
    public int getPages(){
        return  this.pageCount;
    }
    public String toString(){
        return String.format("%s, %s, %d pages",this.author,this.title,this.pageCount);
    }

}
