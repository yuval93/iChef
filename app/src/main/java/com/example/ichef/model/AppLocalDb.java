package com.example.ichef.model;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ichef.MyApplication;

    @Database(entities = {Post.class}, version = 7)
    abstract class AppLocalDbRepository extends RoomDatabase {
        public abstract PostDao postDao();
    }
    public class AppLocalDb{
    static public AppLocalDbRepository db =
            Room.databaseBuilder(MyApplication.getContext(),
                    AppLocalDbRepository.class,
                    "dbFileName.db")
                    .fallbackToDestructiveMigration()
                    .build();
    }
