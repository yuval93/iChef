package com.example.ichef.post;

import androidx.lifecycle.LiveData;

import androidx.lifecycle.ViewModel;

import com.example.ichef.model.Model;
import com.example.ichef.model.Post;

import java.util.List;

public class PostListRvViewModel extends ViewModel {

    LiveData<List<Post>> data;
    LiveData<List<Post>> usersData;

    public PostListRvViewModel(){
        data = Model.instance.getAll();
        usersData = Model.instance.getAllByUser();

    }

    public LiveData<List<Post>> getData() {
        return data;
    }

    public LiveData<List<Post>> getDataByUser() {
        return usersData;
    }
}
