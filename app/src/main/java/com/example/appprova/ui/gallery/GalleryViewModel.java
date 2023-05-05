package com.example.appprova.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/*ordinazioni Totali*/
public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("qui compariranno le ordinazioni totali");
    }

    public LiveData<String> getText() {
        return mText;
    }
}