package com.unity3d.services.core.request.metrics;

/* JADX INFO: loaded from: classes6.dex */
public class AdOperationMetric {
    private static final java.lang.String AD_IS_HEADER_BIDDING = "is_header_bidding";
    private static final java.lang.String AD_LOAD_FAIL = "native_load_time_failure";
    private static final java.lang.String AD_LOAD_START = "native_load_started";
    private static final java.lang.String AD_LOAD_SUCCESS = "native_load_time_success";
    private static final java.lang.String AD_LOAD_TYPE = "type";
    private static final java.lang.String AD_SHOW_FAIL = "native_show_time_failure";
    private static final java.lang.String AD_SHOW_START = "native_show_started";
    private static final java.lang.String AD_SHOW_SUCCESS = "native_show_time_success";
    private static final java.lang.String AD_TYPE_BANNER = "banner";
    private static final java.lang.String AD_TYPE_VIDEO = "video";
    public static final java.lang.String INIT_STATE = "state";
    public static final java.lang.String REASON = "reason";
    private static final java.lang.String UNKNOWN = "unknown";

    public static com.unity3d.services.core.request.metrics.Metric newAdLoadStart(boolean z, boolean z2) {
        return new com.unity3d.services.core.request.metrics.Metric("native_load_started", null, getTags(null, false, z, java.lang.Boolean.valueOf(z2)));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdShowStart() {
        return new com.unity3d.services.core.request.metrics.Metric("native_show_started", null, getTags(null, false, false, null));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdLoadSuccess(java.lang.Long l, boolean z, boolean z2) {
        return new com.unity3d.services.core.request.metrics.Metric(AD_LOAD_SUCCESS, l, getTags(null, false, z, java.lang.Boolean.valueOf(z2)));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdShowSuccess(java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(AD_SHOW_SUCCESS, l, getTags(null, false, false, null));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdLoadFailure(com.unity3d.services.core.request.metrics.AdOperationError adOperationError, java.lang.Long l, boolean z, boolean z2) {
        return new com.unity3d.services.core.request.metrics.Metric(AD_LOAD_FAIL, l, getTags(adOperationError, true, z, java.lang.Boolean.valueOf(z2)));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdLoadFailure(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.Long l, boolean z, boolean z2) {
        return newAdLoadFailure(mapUnityAdsLoadError(unityAdsLoadError), l, z, z2);
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdShowFailure(com.unity3d.services.core.request.metrics.AdOperationError adOperationError, java.lang.Long l) {
        return new com.unity3d.services.core.request.metrics.Metric(AD_SHOW_FAIL, l, getTags(adOperationError, true, false, null));
    }

    public static com.unity3d.services.core.request.metrics.Metric newAdShowFailure(com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.Long l) {
        return newAdShowFailure(mapUnityAdsShowError(unityAdsShowError), l);
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> getTags(com.unity3d.services.core.request.metrics.AdOperationError adOperationError, boolean z, boolean z2, java.lang.Boolean bool) {
        return new java.util.HashMap<java.lang.String, java.lang.String>(z, adOperationError == null ? "unknown" : adOperationError.toString(), z2 ? "banner" : "video", bool) { // from class: com.unity3d.services.core.request.metrics.AdOperationMetric.1
            final /* synthetic */ java.lang.String val$errorMetric;
            final /* synthetic */ boolean val$isFailure;
            final /* synthetic */ java.lang.Boolean val$isHb;
            final /* synthetic */ java.lang.String val$type;

            {
                this.val$isFailure = z;
                this.val$errorMetric = str;
                this.val$type = str;
                this.val$isHb = bool;
                if (z) {
                    put("reason", str);
                }
                put("type", str);
                if (bool != null) {
                    put(com.unity3d.services.core.request.metrics.AdOperationMetric.AD_IS_HEADER_BIDDING, java.lang.String.valueOf(bool));
                }
            }
        };
    }

    private static com.unity3d.services.core.request.metrics.AdOperationError mapUnityAdsLoadError(com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return com.unity3d.services.core.request.metrics.AdOperationError.init_failed;
        }
        if (i == 2) {
            return com.unity3d.services.core.request.metrics.AdOperationError.internal;
        }
        if (i == 3) {
            return com.unity3d.services.core.request.metrics.AdOperationError.invalid;
        }
        if (i == 4) {
            return com.unity3d.services.core.request.metrics.AdOperationError.no_fill;
        }
        if (i != 5) {
            return null;
        }
        return com.unity3d.services.core.request.metrics.AdOperationError.timeout;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.request.metrics.AdOperationMetric$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;

        static {
            int[] iArr = new int[com.unity3d.ads.UnityAds.UnityAdsShowError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = iArr;
            try {
                iArr[com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[com.unity3d.ads.UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr2;
            try {
                iArr2[com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private static com.unity3d.services.core.request.metrics.AdOperationError mapUnityAdsShowError(com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return com.unity3d.services.core.request.metrics.AdOperationError.init_failed;
            case 2:
                return com.unity3d.services.core.request.metrics.AdOperationError.not_ready;
            case 3:
                return com.unity3d.services.core.request.metrics.AdOperationError.player;
            case 4:
                return com.unity3d.services.core.request.metrics.AdOperationError.invalid;
            case 5:
                return com.unity3d.services.core.request.metrics.AdOperationError.no_connection;
            case 6:
                return com.unity3d.services.core.request.metrics.AdOperationError.already_showing;
            case 7:
                return com.unity3d.services.core.request.metrics.AdOperationError.internal;
            default:
                return null;
        }
    }
}
