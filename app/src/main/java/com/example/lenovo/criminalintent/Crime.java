package com.example.lenovo.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by lenovo on 2016/11/18.
 */
//asdasdasdasdasd11

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mmDate;
    private boolean mSolved;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
        mmDate = new Date();
    }


    public Date getDate() {
        return mmDate;
    }
    public void setDate(Date date) {
        mmDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
