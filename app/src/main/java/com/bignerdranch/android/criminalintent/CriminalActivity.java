package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CriminalActivity extends SingleFragmentActivity {


    @Override
    protected Fragment creareFragment() {
        return new CrimeFragment();
    }
}
