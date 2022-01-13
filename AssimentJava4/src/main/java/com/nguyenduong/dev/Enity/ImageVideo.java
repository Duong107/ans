package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "IMAGEVIDEO")
public class ImageVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String LINKVIDEO;
    @ManyToOne @JoinColumn(name="IDVIDEO")
    private Video video;
}
