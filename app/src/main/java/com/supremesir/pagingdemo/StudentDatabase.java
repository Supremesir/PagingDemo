package com.supremesir.pagingdemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author HaoFan Fang
 * @date 2020/4/11 14:53
 */

@Database(entities = {Student.class}, version = 1, exportSchema = false)
abstract class StudentDatabase extends RoomDatabase {

    private static StudentDatabase instance;

    static StudentDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, StudentDatabase.class, "students_database")
                    .build();
        }
        return instance;
    }

    abstract StudentDao getStudentDao();
}
