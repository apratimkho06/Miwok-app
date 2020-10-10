package com.example.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public boolean hasImage() {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
