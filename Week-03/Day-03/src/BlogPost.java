import java.time.LocalDateTime;

public class BlogPost {
  String authorName;
  String title;
  String text;
  LocalDateTime publicationDate;

  public BlogPost(String authorName, String title, String text,LocalDateTime publicationDate){
    this.authorName=authorName;
    this.title=title;
    this.text=text;
    this.publicationDate=publicationDate;
  }
}
