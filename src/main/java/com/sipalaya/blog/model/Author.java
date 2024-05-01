package com.sipalaya.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author shashi
 * @version 1.0.0
 * @since 4/17/24 11:58 PM
 */

@Getter
@Setter
@Entity
@Table(name = "authors",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_authors-email", columnNames = "email"),
                @UniqueConstraint(name = "uk_authors-users_id", columnNames = "user_id")
        }
)
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "email", length = 150, nullable = false)
    private String email;

    @Column(name = "phone_no", length = 10)
    private String phoneNo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
