package com.example.android.miwok;

/**
 * Created by LENOVO on 14-06-2017.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;
    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId){
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

        mAudioResourceId = AudioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }


    public String getMiwokTranslation(){

        return mMiwokTranslation;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }


  public int getmAudioResourceId(){
      return mAudioResourceId;
  }

public  boolean hasImage(){
    return  mImageResourceId != NO_IMAGE_PROVIDED;
}
}