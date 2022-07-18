package com.nghia.repository;

import com.nghia.entity.Music;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class MusicRepositoryImpl implements IMusicRepository {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Music> findAll() {
        List<Music> musicList = entityManager
                .createQuery("select c from music c")
                .getResultList();
        return musicList;
        // Native SQL
        //    students = entityManager
        //          .createNativeQuery("select * from Student")
        //          .getResultList();
    }

    @Modifying
    @Override
    public void create(Music music) {
        if (music.getNameSong() == null) {
            entityManager.persist(music);
        } else {
            entityManager.merge(music);
        }
    }

    @Modifying
    @Override
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Modifying
    @Override
    public void delete(String name) { // variable music ??
        Music music = findMusicByName(name);
        entityManager.remove(name);
    }

    @Override
    public Music findMusicByName(String nameSong) {
        return entityManager.find(Music.class, nameSong);
    }
}
