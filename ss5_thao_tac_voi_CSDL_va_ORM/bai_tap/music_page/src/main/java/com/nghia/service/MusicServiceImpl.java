package com.nghia.service;

import com.nghia.entity.Music;
import com.nghia.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicServiceImpl implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        musicRepository.create(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.update(music);
    }

    @Override
    public void delete(String name) {
        musicRepository.delete(name);
    }

    @Override
    public Music findMusicByName(String nameSong) {
        return musicRepository.findMusicByName(nameSong);
    }
}
