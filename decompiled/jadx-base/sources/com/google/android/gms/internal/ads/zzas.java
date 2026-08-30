package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzas {
    private static final java.util.HashSet zza = new java.util.HashSet();
    private static java.lang.String zzb = "media3.common";

    public static synchronized java.lang.String zza() {
        return zzb;
    }

    public static synchronized void zzb(java.lang.String str) {
        if (zza.add(str)) {
            zzb = zzb + ", " + str;
        }
    }
}
