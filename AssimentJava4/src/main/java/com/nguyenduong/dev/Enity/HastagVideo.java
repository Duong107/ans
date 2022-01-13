package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HASTAGVIDEO")
public class HastagVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @ManyToOne @JoinColumn(name="IDHASTAG")
    private Hastag hastag;
    @ManyToOne @JoinColumn(name="IDVIDEO")
    private Video video;
}
