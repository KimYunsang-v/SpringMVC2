package kr.ac.skuniv.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class User {
    @Id
    @GeneratedValue
    private String userId;

    @Column(length = 50, nullable = false)
    private String pw;

    @Column(nullable = false)
    private String name;

    @Column
    private String email;

    @Builder
    public User(String userId, String pw, String name, String email) {
        this.userId = userId;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }
}
