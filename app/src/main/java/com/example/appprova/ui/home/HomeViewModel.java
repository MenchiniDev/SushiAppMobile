package com.example.appprova.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("qui comparirà il menu \n (in realtà prima ci sarebbe il login)");
    }

    public LiveData<String> getText() {
        return mText;
    }
}