package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzful implements java.io.Serializable {
    zzful() {
    }

    public static com.google.android.gms.internal.ads.zzful zzc() {
        return com.google.android.gms.internal.ads.zzftr.zza;
    }

    public static com.google.android.gms.internal.ads.zzful zzd(@javax.annotation.CheckForNull java.lang.Object obj) {
        return obj == null ? com.google.android.gms.internal.ads.zzftr.zza : new com.google.android.gms.internal.ads.zzfus(obj);
    }

    public abstract com.google.android.gms.internal.ads.zzful zza(com.google.android.gms.internal.ads.zzfuc zzfucVar);

    public abstract java.lang.Object zzb(java.lang.Object obj);
}
