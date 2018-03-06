package blog1018;



import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Note> notes = new ArrayList();
    private String title;
    
    public Blog(String title) {
        this.title = title;
    }
    
    public void add(Note note)
    {
        notes.add(note);
    }
    public String toString()
    {
        return title+"\n\n"+notes;
    }
    public Note mostPopular()
    {
        int max = 0;
        Note result = null;
        for(Note note:notes)
        {
           int count = note.numberOfComments();
           if(count>max)
           {
               result = note;
               max = count;
           }
        }
        return result;
    }
    public List<Note> mostPopulars()
    {
        LocalDate now = LocalDate.now();
        Comment result = null;
        long min = Long.MAX_VALUE;
        for(Note note : notes)
        {
            for(Comment comment: note.getComments)
            {
                LocalDate date = comment.getDate();
                long x = now.util(date, ChronoUnit.MINUTES);
                if(x<min)
                {
                    min = x;
                    result = comment;
                }
            }
        }
        return null;
    }
    
    public Comment lastComment()
    {
        return null;
    }
    public List<Comment> lastComments()
    {
        return null;
    }
    
}
