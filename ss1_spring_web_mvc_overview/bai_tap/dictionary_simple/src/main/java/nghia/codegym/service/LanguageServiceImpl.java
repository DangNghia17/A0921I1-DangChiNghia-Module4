package nghia.codegym.service;

import nghia.codegym.entity.Language;
import nghia.codegym.repository.LanguageRepo;
import nghia.codegym.repository.LanguageRepoImpl;

import java.util.List;

public class LanguageServiceImpl implements LanguageService {
    LanguageRepo languageRepo = new LanguageRepoImpl();

    @Override
    public List<Language> showList() {
        return languageRepo.showList();
    }

    @Override
    public String translate(String english) {
        return languageRepo.translate(english);
    }
}
