package nghia.codegym.service;

import nghia.codegym.entity.Language;

import java.util.List;
import java.util.Map;

public interface LanguageService {

    Map<String,String> showLanguageMap();
    String translate(String english);
}
