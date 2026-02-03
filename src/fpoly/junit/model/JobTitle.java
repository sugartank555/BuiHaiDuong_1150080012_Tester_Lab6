package fpoly.junit.model;

public class JobTitle {
    private String title;
    private String description;

    public JobTitle(String title, String description) {
        if (title.length() == 0 || title.length() > 100)
            throw new IllegalArgumentException("Invalid title");
        if (description.length() > 400)
            throw new IllegalArgumentException("Invalid description");

        this.title = title;
        this.description = description;
    }
}
