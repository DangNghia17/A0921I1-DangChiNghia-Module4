package com.nghia.service;

import com.nghia.entity.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    void create(Music music);
    void update(Music music);
    void delete(String name);
    Music findMusicByName(String nameSong);
}
