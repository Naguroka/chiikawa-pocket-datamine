package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzj {
    private static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE, "unity"));
    private static final java.util.Map zzb = new java.util.HashMap();
    private static final com.google.android.play.core.review.internal.zzi zzc = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");

    public static android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Map mapZzb = zzb();
        bundle.putInt("playcore_version_code", ((java.lang.Integer) mapZzb.get("java")).intValue());
        if (mapZzb.containsKey(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)) {
            bundle.putInt("playcore_native_version", ((java.lang.Integer) mapZzb.get(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)).intValue());
        }
        if (mapZzb.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((java.lang.Integer) mapZzb.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized java.util.Map zzb() {
        java.util.Map map;
        map = zzb;
        map.put("java", 11004);
        return map;
    }
}
