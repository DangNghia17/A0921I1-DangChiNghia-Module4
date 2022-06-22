package nghia.codegym.repository;

import nghia.codegym.entity.Language;

import java.util.ArrayList;
import java.util.List;

public interface LanguageRepo {
    List<Language> showList();

    String translate(String english);
}
