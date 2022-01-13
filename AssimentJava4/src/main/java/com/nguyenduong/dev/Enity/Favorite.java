package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FAVORITE")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Boolean LIKEDISLIKE;
    @ManyToOne
    @JoinColumn(name="IDUSER")
    private Users users;
    @ManyToOne @JoinColumn(name="IDVIDEO")
    private Video video;
}
