package com.nghia.repository;

import java.util.ArrayList;
import java.util.List;

public class LanguageRepoImpl implements ILanguageRepo{

    static List<String> languageList = new ArrayList<>();
    static {
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
    }
    @Override
    public List<String> languageAllList() {
        return languageList;
    }
}
