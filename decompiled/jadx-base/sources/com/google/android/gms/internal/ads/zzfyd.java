package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfyd {
    public static java.util.ArrayList zza(int i) {
        com.google.android.gms.internal.ads.zzfwk.zza(i, "initialArraySize");
        return new java.util.ArrayList(i);
    }

    public static java.util.List zzb(java.util.List list, com.google.android.gms.internal.ads.zzfuc zzfucVar) {
        return list instanceof java.util.RandomAccess ? new com.google.android.gms.internal.ads.zzfya(list, zzfucVar) : new com.google.android.gms.internal.ads.zzfyc(list, zzfucVar);
    }
}
