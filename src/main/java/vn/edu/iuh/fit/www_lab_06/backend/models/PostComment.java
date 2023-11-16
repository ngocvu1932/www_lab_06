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
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "varchar(100)")
    private String title;
    @Column(columnDefinition = "tinyint(1)")
    private boolean published;
    @Column(columnDefinition = "text")
    private String content;
    @Column(columnDefinition = "datetime")
    private Instant publishedAt;
    @Column(columnDefinition = "datetime")
    private Instant createAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;

    @OneToMany(mappedBy = "parent")
    private Set<PostComment> postComments;
}
