package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AdSize implements java.io.Serializable {
    private final int UNDEFINED;
    private com.facebook.ads.internal.api.AdSizeApi mAdSizeApi;
    private final int mInitHeight;
    private final int mInitSizeType;
    private final int mInitWidth;

    @java.lang.Deprecated
    public static final com.facebook.ads.AdSize BANNER_320_50 = new com.facebook.ads.AdSize(4);
    public static final com.facebook.ads.AdSize INTERSTITIAL = new com.facebook.ads.AdSize(100);
    public static final com.facebook.ads.AdSize BANNER_HEIGHT_50 = new com.facebook.ads.AdSize(5);
    public static final com.facebook.ads.AdSize BANNER_HEIGHT_90 = new com.facebook.ads.AdSize(6);
    public static final com.facebook.ads.AdSize RECTANGLE_HEIGHT_250 = new com.facebook.ads.AdSize(7);

    public AdSize(int i, int i2) {
        this.UNDEFINED = -1;
        this.mInitSizeType = -1;
        this.mInitWidth = i;
        this.mInitHeight = i2;
    }

    private AdSize(int i) {
        this.UNDEFINED = -1;
        this.mInitSizeType = i;
        this.mInitWidth = -1;
        this.mInitHeight = -1;
    }

    public int getWidth() {
        int i = this.mInitSizeType;
        if (i != -1) {
            return getAdSizeApi(i).getWidth();
        }
        return this.mInitWidth;
    }

    public int getHeight() {
        int i = this.mInitSizeType;
        if (i != -1) {
            return getAdSizeApi(i).getHeight();
        }
        return this.mInitHeight;
    }

    public static com.facebook.ads.AdSize fromWidthAndHeight(int i, int i2) {
        com.facebook.ads.AdSize adSize = INTERSTITIAL;
        if (adSize.getHeight() == i2 && adSize.getWidth() == i) {
            return adSize;
        }
        com.facebook.ads.AdSize adSize2 = BANNER_320_50;
        if (adSize2.getHeight() == i2 && adSize2.getWidth() == i) {
            return adSize2;
        }
        com.facebook.ads.AdSize adSize3 = BANNER_HEIGHT_50;
        if (adSize3.getHeight() == i2 && adSize3.getWidth() == i) {
            return adSize3;
        }
        com.facebook.ads.AdSize adSize4 = BANNER_HEIGHT_90;
        if (adSize4.getHeight() == i2 && adSize4.getWidth() == i) {
            return adSize4;
        }
        com.facebook.ads.AdSize adSize5 = RECTANGLE_HEIGHT_250;
        if (adSize5.getHeight() == i2 && adSize5.getWidth() == i) {
            return adSize5;
        }
        throw new java.lang.IllegalArgumentException("Can't create AdSize using this width = " + i + " && height = " + i2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.AdSize adSize = (com.facebook.ads.AdSize) obj;
        return getWidth() == adSize.getWidth() && getHeight() == adSize.getHeight();
    }

    public int hashCode() {
        return (getWidth() * 31) + getHeight();
    }

    private com.facebook.ads.internal.api.AdSizeApi getAdSizeApi(int i) {
        if (this.mAdSizeApi == null) {
            this.mAdSizeApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoaderUnsafe().createAdSizeApi(i);
        }
        return this.mAdSizeApi;
    }
}
