package com.sipalaya.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * @author shashi
 * @version 1.0.0
 * @since 4/17/24 11:35 PM
 */


@Getter
@Setter
@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 200, nullable = false)
    private String title;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "cover_image", columnDefinition = "BLOB")
    private String coverImage;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "posts_authors",
            joinColumns = @JoinColumn(name = "post_id", foreignKey = @ForeignKey(name = "fk_posts-authors_id")),
            inverseJoinColumns = @JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "fk_authors-posts_id"))
    )
    private Set<Author> authors;
}
