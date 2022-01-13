package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HASTAG")
public class Hastag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String HASTAG;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "hastag")
    private List<HastagVideo> list;
}
