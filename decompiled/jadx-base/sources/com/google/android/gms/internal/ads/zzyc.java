package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzyc {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzln[] zzb;
    public final com.google.android.gms.internal.ads.zzxv[] zzc;
    public final com.google.android.gms.internal.ads.zzby zzd;
    public final java.lang.Object zze;

    public zzyc(com.google.android.gms.internal.ads.zzln[] zzlnVarArr, com.google.android.gms.internal.ads.zzxv[] zzxvVarArr, com.google.android.gms.internal.ads.zzby zzbyVar, java.lang.Object obj) {
        int length = zzlnVarArr.length;
        com.google.android.gms.internal.ads.zzcw.zzd(length == zzxvVarArr.length);
        this.zzb = zzlnVarArr;
        this.zzc = (com.google.android.gms.internal.ads.zzxv[]) zzxvVarArr.clone();
        this.zzd = zzbyVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzyc zzycVar, int i) {
        return zzycVar != null && java.util.Objects.equals(this.zzb[i], zzycVar.zzb[i]) && java.util.Objects.equals(this.zzc[i], zzycVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
