package com.supremesir.pagingdemo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author HaoFan Fang
 * @date 2020/4/11 14:04
 */

@Entity(tableName = "student_table")
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "student_number")
    private int studentNumber;

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    int getStudentNumber() {
        return studentNumber;
    }

    void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
