package com.nghia.service;

import com.nghia.repository.ILanguageRepo;
import com.nghia.repository.LanguageRepoImpl;

import java.util.List;

public class LanguageServiceImpl implements ILanguageService {
    ILanguageRepo languageRepo = new LanguageRepoImpl();
    @Override
    public List<String> languageAllList() {
        return languageRepo.languageAllList();
    }
}
