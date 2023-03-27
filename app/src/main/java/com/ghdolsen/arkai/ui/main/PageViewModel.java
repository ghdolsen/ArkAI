package com.ghdolsen.arkai.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private final LiveData<Integer> mIndex = new MutableLiveData<>();
    private final LiveData<String> mText = Transformations.map(mIndex, input -> "Hello world from section: " + input);

    public void setIndex(int index) {
        if (mIndex instanceof MutableLiveData) {
            ((MutableLiveData<Integer>) mIndex).setValue(index);
        }
    }

    public LiveData<String> getText() {
        return mText;
    }
}
