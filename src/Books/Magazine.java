package Books;

class Magazine extends Publication {
    public Magazine(String title, String authorName, int yearPublication) {
        super(title, authorName, yearPublication);
    }

    @Override
    public String getResume() {
        return "Revista: " + this.getTitle() + " - " + this.getYearPublication();

    }
}
