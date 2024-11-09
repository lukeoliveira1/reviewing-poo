package Books;

abstract class Publication {
    private String title;
    private String authorName;
    private int yearPublication;

    public Publication(String title, String authorName, int yearPublication) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    abstract String getResume();
}


