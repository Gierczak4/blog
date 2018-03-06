package blog1018;



import java.util.ArrayList;
import java.util.List;

public class Note {
    private final String title;
    private String content;
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
    
    public List<Comment> getComments(){
        return comments;
    }
    
    public String toString()
    {
        StringBuilder sb= new StringBuilder();
        sb.append("\nWPIS");
        sb.append("\ntytuł: ").append(title);
        sb.append("\ntreść: ").append(content);
        sb.append("\nkomentarze: ").append(comments);
        return sb.toString();
    }

    public int numberOfComments() {
        return comments.size();
    }
}
