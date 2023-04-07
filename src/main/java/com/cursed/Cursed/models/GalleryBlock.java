package com.cursed.Cursed.models;

import javax.persistence.*;

@Entity
public class GalleryBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nickname, full_text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSTitle() {
        return nickname;
    }

    public void setSTitle(String title) {
        this.nickname = title;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public GalleryBlock() {
    }
    public GalleryBlock(String nickname, String full_text) {
        this.nickname = nickname;
        this.full_text = full_text;
    }
}
