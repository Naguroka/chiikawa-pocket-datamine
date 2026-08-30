package com.google.android.play.core.review.model;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zza {
    private static final java.util.Map zza;
    private static final java.util.Map zzb;

    static {
        java.util.HashMap map = new java.util.HashMap();
        zza = map;
        java.util.HashMap map2 = new java.util.HashMap();
        zzb = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static java.lang.String zza(int i) {
        java.util.Map map = zza;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((java.lang.String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((java.lang.String) zzb.get(numValueOf)) + ")";
    }
}
