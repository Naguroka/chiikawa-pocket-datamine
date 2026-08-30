package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerv implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final android.content.pm.PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzerv(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.content.pm.PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgcsVar;
        this.zzb = zzfcjVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzerw zzc(com.google.android.gms.internal.ads.zzerv zzervVar) {
        return new com.google.android.gms.internal.ads.zzerw(zzervVar.zzb, zzervVar.zzc, zzervVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeru
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzerv.zzc(this.zza);
            }
        });
    }
}
