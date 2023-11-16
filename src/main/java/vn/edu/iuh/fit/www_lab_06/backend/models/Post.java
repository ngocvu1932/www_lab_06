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
@Table(name = "post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "tinyint(1)")
    private boolean published;
    @Column(columnDefinition = "text")
    private String content;
    @Column(columnDefinition = "varchar(100)")
    private String metaTitle;
    @Column(columnDefinition = "tinytext")
    private String summary;
    @Column(columnDefinition = "datetime")
    private Instant createdAt;
    @Column(columnDefinition = "varchar(75)")
    private String title;
    @Column(columnDefinition = "datetime")
    private Instant updatedAt;
    @Column(columnDefinition = "datetime")
    private  Instant publishedAt;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Post parent;

    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @OneToMany(mappedBy = "parent")
    private Set<Post> posts;



}
