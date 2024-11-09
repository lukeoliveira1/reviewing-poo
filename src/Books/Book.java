package Books;

class Book extends Publication {
    public Book(String title, String authorName, int yearPublication) {
        super(title, authorName, yearPublication);
    }

    @Override
    public String getResume() {
        return "Livro: " + this.getTitle() + " - " + this.getAuthorName();
    }
}
