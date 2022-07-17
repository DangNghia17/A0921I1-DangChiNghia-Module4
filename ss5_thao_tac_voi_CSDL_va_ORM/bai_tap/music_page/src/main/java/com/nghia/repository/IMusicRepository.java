package com.nghia.repository;

import com.nghia.entity.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();
    void create(Music music);
    void update(Music music);
    void delete(String name);
    Music findMusicByName(String nameSong);
}
