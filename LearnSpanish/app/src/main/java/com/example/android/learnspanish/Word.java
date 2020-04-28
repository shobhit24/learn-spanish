package com.example.android.learnspanish;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mSpanishTranslation;

    /** Image Resource Id for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     */
    public Word(String defaultTranslation, String spanishTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     *
     *  @param imageResourceId ID is the drawable resource ID for the image associated
     *                         with the word
     */
    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Spanish translation of the word.
     */
    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }

    /**
     * Return the Image Resource Id of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
