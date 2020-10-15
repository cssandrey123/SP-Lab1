package MainPackage;

public class Table {
    String table;
    Table (String table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table='" + table + '\'' +
                '}';
    }
}
