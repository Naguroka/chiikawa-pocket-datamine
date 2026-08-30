package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdViewAttributes {
    private final com.facebook.ads.internal.api.NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    @java.lang.Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getButtonBorderColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getButtonColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getButtonTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getDescriptionTextSize() {
        return 0;
    }

    @java.lang.Deprecated
    public int getTitleTextColor() {
        return 0;
    }

    @java.lang.Deprecated
    public int getTitleTextSize() {
        return 0;
    }

    @java.lang.Deprecated
    public android.graphics.Typeface getTypeface() {
        return null;
    }

    @java.lang.Deprecated
    public com.facebook.ads.NativeAdViewAttributes setAutoplay(boolean z) {
        return this;
    }

    @java.lang.Deprecated
    public com.facebook.ads.NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        return this;
    }

    public NativeAdViewAttributes(android.content.Context context) {
        this.mNativeAdViewAttributesApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdViewAttributesApi();
    }

    @java.lang.Deprecated
    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }

    public com.facebook.ads.internal.api.NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    public com.facebook.ads.NativeAdViewAttributes setTypeface(android.graphics.Typeface typeface) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setBackgroundColor(int i) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(i);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setTitleTextColor(int i) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(i);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(i);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setButtonColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(i);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setButtonTextColor(int i) {
        this.mNativeAdViewAttributesApi.setCTATextColor(i);
        return this;
    }

    public com.facebook.ads.NativeAdViewAttributes setButtonBorderColor(int i) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(i);
        return this;
    }

    @java.lang.Deprecated
    public boolean getAutoplay() {
        return com.facebook.ads.AdSettings.isVideoAutoplay();
    }

    @java.lang.Deprecated
    public boolean getAutoplayOnMobile() {
        return com.facebook.ads.AdSettings.isVideoAutoplayOnMobile();
    }
}
