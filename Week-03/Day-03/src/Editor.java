import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Editor {

  public static void main(String[] args) {

    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    BlogPost blogpost1 = new BlogPost(
          "John Doe",
          "Lorem Ipsum",
          "Lorem ipsum dolor sit amet.",
            LocalDateTime.from(f.parse("2000-05-04 00:00:00"))
    );

    BlogPost blogpost2 = new BlogPost(
          "Tim Urban",
          "Wait but why",
          "A popular long-form, stick-figure-illustrated blog about almost everything",
            LocalDateTime.from(f.parse("2010-10-10 00:00:00"))
    );
     BlogPost blogpost3 = new BlogPost(
          "William Turton",
          "One Engineer Is Trying to Get IBM to Reckon With Trump",
          "Daniel Hanley, a cybersecurity engineer at IBM," +
                  " doesn’t want to be the center of attention. " +
                  "When I asked to take his picture outside one of IBM’s New York City offices," +
                  " he told me that he wasn’t really into the whole organizer profile thing.",
             LocalDateTime.from(f.parse("2017-03-28 00:00:00"))
    );


    System.out.println(blogpost1.toString());
  }
}
