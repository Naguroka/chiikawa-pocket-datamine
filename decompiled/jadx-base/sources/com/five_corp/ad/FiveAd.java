package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FiveAd {

    @java.lang.Deprecated
    public static class MediaUserAttribute {
        public MediaUserAttribute(java.lang.String str, java.lang.String str2) {
        }
    }

    public static java.lang.String getSdkSemanticVersion() {
        return com.five_corp.ad.BuildConfig.SEMVER;
    }

    @java.lang.Deprecated
    public static int getSdkVersion() {
        return com.five_corp.ad.BuildConfig.SEMVER_PATCH;
    }

    public static com.five_corp.ad.FiveAd getSingleton() {
        return com.five_corp.ad.k.a();
    }

    public static void initialize(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must be a non-null value.");
        }
        if (fiveAdConfig == null) {
            throw new java.lang.IllegalArgumentException("FiveAdConfig must be a non-null value.");
        }
        com.five_corp.ad.k.initialize(context, fiveAdConfig);
    }

    public static boolean isInitialized() {
        return com.five_corp.ad.k.isInitialized();
    }

    @java.lang.Deprecated
    public abstract void enableSound(boolean z);

    @java.lang.Deprecated
    public int getVersion() {
        return com.five_corp.ad.BuildConfig.SEMVER_PATCH;
    }

    public abstract boolean isSoundEnabled();

    @java.lang.Deprecated
    public abstract void setMediaUserAttributes(java.util.List<com.five_corp.ad.FiveAd.MediaUserAttribute> list);
}
