package com.github.dispatch.bean;

public class User {

    private String mUserName;

    private String mUserAge;

    private Address mAddress;

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmUserAge() {
        return mUserAge;
    }

    public void setmUserAge(String mUserAge) {
        this.mUserAge = mUserAge;
    }



    public Address getmAddress() {
        return mAddress;
    }

    public void setmAddress(Address mAddress) {
        this.mAddress = mAddress;
    }


    @Override
    public String toString() {
        return "User{" +
                "mUserName='" + mUserName + '\'' +
                ", mUserAge='" + mUserAge + '\'' +
                ", mAddress=" + mAddress +
                '}';
    }
}
