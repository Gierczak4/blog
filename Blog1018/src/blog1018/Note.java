package blog1018;



import java.util.ArrayList;
import java.util.List;

public class Note {
    private String title, content;
    private List<Comment> comments = new ArrayList();
    
    public Note(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
    
    public void add(Comment comment)
    {
        comments.add(comment);
    }
    public String toString()
    {
        StringBuilder sb= new StringBuilder();
        sb.append("\nWPIS");
        sb.append("\ntytuł: "+title);
        sb.append("\ntreść: "+content);
        sb.append("\nkomentarze: "+comments);
        return sb.toString();
    }
}
