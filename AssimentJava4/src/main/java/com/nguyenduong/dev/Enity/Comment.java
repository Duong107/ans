package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COMMENT")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String COMMENT;
    @ManyToOne @JoinColumn(name="IDUSER")
    private Users users;
    @ManyToOne @JoinColumn(name="IDVIDEO")
    private Video video;
}
