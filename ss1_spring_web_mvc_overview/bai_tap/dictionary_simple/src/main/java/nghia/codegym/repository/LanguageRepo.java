package nghia.codegym.repository;

import nghia.codegym.entity.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface LanguageRepo {
    Map<String,String> showLanguageMap();
    String translate(String english);
}
