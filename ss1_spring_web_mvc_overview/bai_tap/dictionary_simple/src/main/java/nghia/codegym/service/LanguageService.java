package nghia.codegym.service;

import nghia.codegym.entity.Language;

import java.util.List;

public interface LanguageService {

    List<Language> showList();

    String translate(String english);
}
