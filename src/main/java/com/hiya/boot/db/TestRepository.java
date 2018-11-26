package com.hiya.boot.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TestRepository  extends JpaRepository<Test, Long>
{
    @Transactional
    @Modifying
    @Query("update Test t set t.remark = :remark where t.id = :id")
    int updateTestById(@Param("remark") String remark, @Param("id") int id);

    @Query("select t from Test t ")
    List<Test> getTestList();
    
    @Query("select t from Test t  where t.id = :id  ")
    Test getTestById(@Param("id") int id);
}
