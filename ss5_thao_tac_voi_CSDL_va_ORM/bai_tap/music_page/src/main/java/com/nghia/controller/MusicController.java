package com.nghia.controller;

import com.nghia.entity.Music;
import com.nghia.entity.MusicForm;
import com.nghia.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    IMusicService musicService;

    @ModelAttribute("music")
    public Music initMusic() {
        return new Music();
    }
    @ModelAttribute("musicForm")
    public MusicForm initMusicForm() {
        return new MusicForm();
    }

    @GetMapping("")
    public String displayList(Model model) {
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList", musicList);
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate() {
        return "/create";
    }

    @GetMapping("/edit/{name}")
    public String showFormEdit(@PathVariable String name, Model model) {
        Music music = musicService.findMusicByName(name);
        model.addAttribute("music", music);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("music") Music music) {
        musicService.create(music);
        return "redirect:/music/";
    }

    @GetMapping("/delete/{name}")
    public String showFormDelete(@PathVariable("name") String name, Model model) {
        Music music = musicService.findMusicByName(name);
        model.addAttribute("music", music);
        return "delete";
    }

    @GetMapping("/view/{name}")
    public String view(@PathVariable("name") String name, Model model) {
        Music music = musicService.findMusicByName(name);
        model.addAttribute("music", music);
        return "view";
    }


}
