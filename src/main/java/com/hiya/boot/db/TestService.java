package com.hiya.boot.db;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService
{
    @Autowired
    TestRepository testRepository;
    
    @Transactional
    public  int updateTestById( String remark, int id)
    {
        return testRepository.updateTestById(remark, id);
    }

    public  List<Test> getTestList()
    {
        return testRepository.getTestList();
    }
    
    public  Test getTestById(  int id)
    {
        return testRepository.getTestById(  id);
    }

}
