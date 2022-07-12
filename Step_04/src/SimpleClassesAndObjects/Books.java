package SimpleClassesAndObjects;

public class Books {

    Book[] books;
    int size;
    int capacity;
    Book[] temp;
    int countOfBooks;

    public Books() {
        size = 0;
        capacity = 1;
        books = new Book[1];
    }

    public void pushNewBook(Book book) {
        if (size >= capacity) {
            temp = new Book[capacity];
            temp = books;
            capacity = capacity * 2;
            books = new Book[capacity];
            System.arraycopy(temp, 0, books, 0, size);
        }
        books[size] = book;
        size++;

    }

    public void findBookByAuthor(String authorName) {

        for (int i = 0; i < size; i++) {
            if (books[i].getAuthorName().equals(authorName)) {
                System.out.println(books[i].toString());
            }
        }
    }

    public void findBookByPublishingHouse(String publishingHouse) {

        for (int i = 0; i < size; i++) {
            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                System.out.println(books[i].toString());
            }
        }
    }

    public void findBookPublicAfter(int year) {

        for (int i = 0; i < size; i++) {
            if (books[i].getYearOfPublishing() > year) {
                System.out.println(books[i].toString());
                countOfBooks++;
            }
        }
        if(countOfBooks == 0) {
            System.out.println("There are no books");
        }
        countOfBooks=0;
    }

    public void printBooks() {

        for (int i = 0; i < size; i++) {
            System.out.println(books[i].toString());
        }

    }

}
