//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author agataKristy = new Author("Агата", "Кристи");
        Author agataKristy2 = new Author("Агата", "Кристи");
        book tenLittleNegroes = new book("Десять Негритят", 1980, agataKristy);
        tenLittleNegroes.setPublicationYear(1939);
        System.out.println(tenLittleNegroes.getAuthor());
        System.out.println(tenLittleNegroes);
        System.out.println(agataKristy.hashCode());
        System.out.println(agataKristy2.hashCode());
        System.out.println(agataKristy.equals(agataKristy2));


    }
}
