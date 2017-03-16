package com.example.service.impl;

//import com.example.mapper.PersonMapper;
import com.example.domain.Person;
import com.example.mapper.PersonMapper;
import com.example.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-15 下午3:08
 */
@Service
@Transactional
public class PersonImpl  implements IPersonService {

    @Autowired
    private PersonMapper mapper;

     @Override
    public List<Person> getAllDates() {

        return mapper.getAllPerson();
    }
}
