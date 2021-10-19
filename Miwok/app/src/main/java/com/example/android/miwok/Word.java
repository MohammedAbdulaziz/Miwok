package com.example.android.miwok;

public class Word
{
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;
    private static final int NO_IMAGE_VIEW = 0;
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){return mImageResourceId;}
    public boolean hasImage(){return mImageResourceId != NO_IMAGE_VIEW;}
    public int getAudioResourceId(){ return mAudioResourceId; }
}
