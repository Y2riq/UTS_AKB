/**
 *
 * Nim : 10120034
 * Kelas : IF1
 * Nama : Ariq Fadhilah Saputra
 * Email : ariqfadhilah88@gmail.com
 *
 */
package com.uts.ariqfadhilahsaputra10120034.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}