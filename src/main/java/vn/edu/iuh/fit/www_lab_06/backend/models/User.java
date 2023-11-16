package vn.edu.iuh.fit.www_lab_06.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "varchar(15)")
    private String mobile;
    @Column(columnDefinition = "datetime")
    private Instant lastLogin;
    @Column(columnDefinition = "varchar(50)")
    private String lastName;
    @Column(columnDefinition = "tinytext")
    private String intro;
    @Column(columnDefinition = "text")
    private String profile;
    @Column(columnDefinition = "datetime")
    private Instant registeredAt;
    @Column(columnDefinition = "varchar(32)")
    private String passwordHash;
    @Column(columnDefinition = "varchar(50)")
    private String middleName;
    @Column(columnDefinition = "varchar(50)")
    private String firstName;
    @Column(columnDefinition = "varchar(50)")
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<PostComment> comments;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts;

}
