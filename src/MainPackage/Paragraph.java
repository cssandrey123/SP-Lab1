package MainPackage;

public class Paragraph {
    String pText;
    Paragraph(String text) {
        this.pText = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }
}
