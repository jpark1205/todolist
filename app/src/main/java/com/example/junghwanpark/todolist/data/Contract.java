package com.example.junghwanpark.todolist.data;

import android.provider.BaseColumns;

/**
 * Created by JungHwanPark on 7/18/2017.
 */

public class Contract {
    //This creates the columns of the database
    public static class TABLE_TODO implements BaseColumns {
        public static final String TABLE_NAME = "todoitems";

        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_DUE_DATE = "duedate";
    }
}
