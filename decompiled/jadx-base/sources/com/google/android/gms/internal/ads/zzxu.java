package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzxu {
    public final com.google.android.gms.internal.ads.zzbr zza;
    public final int[] zzb;

    public zzxu(com.google.android.gms.internal.ads.zzbr zzbrVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            com.google.android.gms.internal.ads.zzdo.zzd("ETSDefinition", "Empty tracks are not allowed", new java.lang.IllegalArgumentException());
        }
        this.zza = zzbrVar;
        this.zzb = iArr;
    }
}
