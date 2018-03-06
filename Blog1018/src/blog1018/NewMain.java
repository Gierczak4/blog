package blog1018;

import java.time.LocalDate;



public class NewMain {

    public static void main(String[] args) {
        Blog blog = new Blog("Blog programistyczny");
        Note note = new Note("Co nowego w Java 9","blablabla");
        Note note2 = new Note("Kolekcje","Kolekjce");
        Note note3 = new Note("JavaFx","Aplikacje desktopowe");
        Comment comment1 = new Comment("Kowalski","Kolekcje sa bardzo trudne");
        Comment comment2 = new Comment("Nowak","No cos ty, bardzo latwe");
        blog.add(note);
        blog.add(note2);
        blog.add(note3);
        note.add(comment1);
        note2.add(comment2);
        System.out.println(blog);
        System.out.println("------------------------------------------------");
        System.out.println(blog.mostPopular());
        System.out.println("------------------------------------------------");
        LocalDate d1 = LocalDate.of(2018, Month.MARCH, 1);
        LocalDate d2 = LocalDate.of(2018, Month.FEBRUARY, 2);
        long u =d1.util(d2,ChronoUnit)
        
    }
    
}
