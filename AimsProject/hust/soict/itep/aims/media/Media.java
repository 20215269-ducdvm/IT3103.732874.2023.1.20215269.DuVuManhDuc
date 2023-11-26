package AimsProject.hust.soict.itep.aims.media;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public Media() {
        super();
    }
    public Media(String title) {
        this();
        this.title = title;
    }
    public Media(String title, String category) {
        this(title);
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        Media media = (Media) o;
        return media.getTitle().equals(this.getTitle());
    }
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
}
