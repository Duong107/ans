package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VIDEO")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String TITLE;
    private String BODY;
    private String LINKVIDEO;
    private int VIEWSVIDEO;
    @ManyToOne @JoinColumn(name="IDUSER")
    private Users users;
    @OneToMany(mappedBy = "video")
    private List<HastagVideo> haslist;
    @OneToMany(mappedBy = "video")
    private List<Comment> list;
    @OneToMany(mappedBy = "video")
    private List<ImageVideo> list1;
    @OneToMany(mappedBy = "video")
    private List<Favorite> list1z;
}
