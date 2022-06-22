package nghia.codegym.repository;

import nghia.codegym.entity.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageRepoImpl implements LanguageRepo {
    private static List<Language> languageList = new ArrayList<>();

    static {
        languageList.add(new Language("one", "số một"));
        languageList.add(new Language("two", "số hai"));
        languageList.add(new Language("three", "số ba"));
        languageList.add(new Language("four", "số bốn"));
        languageList.add(new Language("five", "số năm"));
        ;
        languageList.add(new Language("six", "số sáu"));
        languageList.add(new Language("seven", "số bảy"));
        languageList.add(new Language("eight", "số tám"));
        languageList.add(new Language("nine", "số chín"));
        languageList.add(new Language("ten", "số mười"));
    }

    @Override
    public List<Language> showList() {
        return languageList;
    }

    @Override
    public String translate(String english) {
        List<Language> languageList = showList();
        for (Language words : languageList) {
            if (english.equalsIgnoreCase(words.getEnglish())) {
                return words.getVietnamese();
            }
        }


        return null;
    }
}
