package com.nguyenduong.dev.Enity;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyGroup;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String FULLNAME;
    private String USERNAME;
    private String EMAIL;
    private String PASSWORDS;
    private Date BIRTHDAY;
    private Date REGISTRATIONDATE;
    private String IMAGEUSER;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "users")
    private List<Video> list;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "users")
    private List<Comment> list1;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "users")
    private List<Favorite> list2;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user1")
    private List<UserSubcrible> list3;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user2")
    private List<UserSubcrible> list4;
}
