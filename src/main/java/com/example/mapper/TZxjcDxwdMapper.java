package com.example.mapper;


import com.example.model.Student;
import com.example.model.SxdlDxwd;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TZxjcDxwdMapper {

    public int insertTZxjcDxwd(SxdlDxwd sxdlDxwd);

    List<Student> queryStu();

}
