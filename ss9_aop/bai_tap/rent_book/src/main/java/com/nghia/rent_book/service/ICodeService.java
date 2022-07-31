package com.nghia.rent_book.service;

import com.nghia.rent_book.entity.Code;

import java.util.List;

public interface ICodeService {

    void save(Code code);

    List<Code> findAllCodeByBookId(Integer bookId);

    List<Code> findAvailableCodeByBookId(Integer id);

    List<Code> findUsedCodeByBookId(Integer id);
}
