package com.unity3d.services.banners;

/* JADX INFO: loaded from: classes6.dex */
public class BannerErrorInfo {
    public com.unity3d.services.banners.BannerErrorCode errorCode;
    public java.lang.String errorMessage;

    public BannerErrorInfo(java.lang.String str, com.unity3d.services.banners.BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public com.unity3d.ads.UnityAds.UnityAdsLoadError toLoadError() {
        int i = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        if (i == 1) {
            return com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
        }
        if (i == 2) {
            return com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL;
        }
        if (i == 3) {
            return com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        }
        return com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
    }

    /* JADX INFO: renamed from: com.unity3d.services.banners.BannerErrorInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        static {
            int[] iArr = new int[com.unity3d.ads.UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr;
            try {
                iArr[com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.unity3d.services.banners.BannerErrorCode.values().length];
            $SwitchMap$com$unity3d$services$banners$BannerErrorCode = iArr2;
            try {
                iArr2[com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[com.unity3d.services.banners.BannerErrorCode.NO_FILL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$unity3d$services$banners$BannerErrorCode[com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static com.unity3d.services.banners.BannerErrorInfo fromLoadError(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str) {
        int i = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new com.unity3d.services.banners.BannerErrorInfo(str, com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR);
        }
        if (i == 4) {
            return new com.unity3d.services.banners.BannerErrorInfo(str, com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR);
        }
        if (i == 5) {
            return new com.unity3d.services.banners.BannerErrorInfo(str, com.unity3d.services.banners.BannerErrorCode.NO_FILL);
        }
        return new com.unity3d.services.banners.BannerErrorInfo(str, com.unity3d.services.banners.BannerErrorCode.UNKNOWN);
    }
}
