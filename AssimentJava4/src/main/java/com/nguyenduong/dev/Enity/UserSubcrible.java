package com.nguyenduong.dev.Enity;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERSUBCRIBE")
public class UserSubcrible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @ManyToOne @JoinColumn(name="IDUSERYOU")
    private Users user1;
    @ManyToOne @JoinColumn(name="IDUSERFRIEND")
    private Users user2;
}
