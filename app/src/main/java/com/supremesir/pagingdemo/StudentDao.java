package com.supremesir.pagingdemo;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/**
 * @author HaoFan Fang
 * @date 2020/4/11 14:36
 */

@Dao
public interface StudentDao {
    @Insert
    void insertStudents(Student... students);

    @Query("DELETE FROM student_table")
    void deleteAllStudents();

    @Query("SELECT * FROM student_table ORDER BY id")
    DataSource.Factory<Integer, Student> getAllStudent();
//    LiveData<List<Student>> getAllStudentLive();
}
