package Books;

import java.util.ArrayList;
import java.util.List;

class Library<T> {
    private List<T> publications = new ArrayList<>();

    public void addPublication(T publication) {
        this.publications.add(publication);
    }

    public void removePublication(T publication) {
        this.publications.remove(publication);
    }

    public void listPublications() {
        for (T publication : this.publications) {
            if (publication instanceof Book) {
                Book book = (Book) publication;
                System.out.println(book.getResume());
            } else if (publication instanceof Magazine) {
                Magazine magazine = (Magazine) publication;
                System.out.println(magazine.getResume());
            } else {
                System.out.println("Tipo de publicação não reconhecida!");
            }
        }
    }
}
