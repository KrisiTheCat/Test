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
        Referat referat4 = (Referat) referat1.clone();
        referat4.setTheme("Liberty");
        referat4.getAuthor().setName("Stefanie Popova");

        referat1.submit();
        referat2.submit();
        referat3.submit();
        referat4.submit();

        System.out.println(referat1.toString());
        System.out.println(referat2.toString());
        System.out.println(referat3.toString());
        System.out.println(referat4.toString());
    }
}
