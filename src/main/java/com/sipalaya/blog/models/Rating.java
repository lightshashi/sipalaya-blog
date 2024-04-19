package com.sipalaya.blog.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author shashi
 * @version 1.0.0
 * @since 4/18/24 12:04 AM
 */
@Getter
@Setter
@Entity
@Table(name = "ratings",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_ratings_post", columnNames = {"user_id", "post_id"})
        }
)
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rate_value", nullable = false)
    private Short rateValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", foreignKey = @ForeignKey(name = "fk_ratings_posts_id"))
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_ratings_users_id"))
    private User user;
}
