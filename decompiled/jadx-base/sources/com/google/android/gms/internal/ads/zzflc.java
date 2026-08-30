package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflc {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    private zzflc(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static com.google.android.gms.internal.ads.zzflc zza(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfmk.zzb(str, "Name is null or empty");
        com.google.android.gms.internal.ads.zzfmk.zzb(str2, "Version is null or empty");
        return new com.google.android.gms.internal.ads.zzflc(str, str2);
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }
}
