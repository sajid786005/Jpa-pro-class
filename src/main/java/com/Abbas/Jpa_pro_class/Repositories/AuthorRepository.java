package com.Abbas.Jpa_pro_class.Repositories;

import com.Abbas.Jpa_pro_class.Models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {


    @Transactional
    List<Author> findByNamedQuery(@Param("age") int age);

    @Modifying
    @Transactional
    void updateByNamedQuery(@Param("age") int age);

    // update Author a set a.age = 22 where a.id = 1
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorsAges(int age);


    List<Author> findAllByFirstName(String fn);


    List<Author> findAllByFirstNameIgnoreCase(String fn);


    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);


    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);


    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);


    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
