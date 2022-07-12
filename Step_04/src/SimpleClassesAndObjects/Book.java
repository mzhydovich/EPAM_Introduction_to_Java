package SimpleClassesAndObjects;

public class Book {

    private String name;
    private String authorName;
    private String publishingHouse;
    private int yearOfPublishing;
    private int countOfPages;
    private int price;
    private String typeOfCover;
    private int id;
    private static int ID;

    public Book() {
        super();
    }

    public Book(String name, String authorName, String publishingHouse, int yearOfPublishing, int countOfPages,
                int price, String typeOfCover) {
        super();
        id = ID;
        ID++;
        this.name = name;
        this.authorName = authorName;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfPages = countOfPages;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authorName=" + authorName + ", publishingHouse=" + publishingHouse
                + ", yearOfPublishing=" + yearOfPublishing + ", countOfPages=" + countOfPages + ", price=" + price
                + ", typeOfCover=" + typeOfCover + ", id=" + id + "]";
    }

    public Book bookCreating() {
        return new Book();

    }

}
