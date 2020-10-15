package MainPackage;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private List<Table> tables = new ArrayList<Table>();
    private List<Image> images = new ArrayList<Image>();

    Book(String title){
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphs.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image) {
        this.images.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.tables.add(new Table(table));
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Title" + this.title);
        for(Paragraph paragraph : this.paragraphs) {
            System.out.println(paragraph);
        }
        for(Image image : this.images) {
            System.out.println(image);
        }
        for(Table table : this.tables) {
            System.out.println(table);
        }
    }
}
