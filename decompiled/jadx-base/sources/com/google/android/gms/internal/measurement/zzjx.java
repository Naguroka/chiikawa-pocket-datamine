package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final androidx.collection.ArrayMap zzb = new androidx.collection.ArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized android.net.Uri zza(java.lang.String str) {
        androidx.collection.ArrayMap arrayMap = zzb;
        android.net.Uri uri = (android.net.Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        android.net.Uri uri2 = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(java.lang.String.valueOf(android.net.Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
