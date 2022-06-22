package nghia.codegym.repository;

import nghia.codegym.entity.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageRepoImpl implements LanguageRepo {
    private static List<Language> languageList = new ArrayList<>();

    static {
        languageList.add(new Language("one", "so mot"));
        languageList.add(new Language("two", "so hai"));
        languageList.add(new Language("three", "so ba"));
        languageList.add(new Language("four", "so bon"));
        languageList.add(new Language("five", "so nam"));
        ;
        languageList.add(new Language("six", "so sau"));
        languageList.add(new Language("seven", "so bay"));
        languageList.add(new Language("eight", "so tam"));
        languageList.add(new Language("nine", "so chin"));
        languageList.add(new Language("ten", "so muoi"));
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
//            else {
//                return "Khong tim thay";
//            }
        }


        return null;
    }
}
