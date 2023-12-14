package bg.smg;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Referat referat1 = new Referat(false, new Author("Kristina Stoyanova"), "Anger as a concept", 41);
        Referat referat2 = (Referat) referat1.clone();
        referat2.setTheme("Vehicles in modern world");
        referat2.getAuthor().setName("Hristina Vandeva");
        Referat referat3 = (Referat) referat1.clone();
        referat3.setTheme("Schnappi das kleine Krokodil");
        referat3.getAuthor().setName("Gabriela Grigorova");

        referat1.submit();
        referat2.submit();
        referat3.submit();

        System.out.println(referat1.toString());
        System.out.println(referat2.toString());
        System.out.println(referat3.toString());
    }
}
