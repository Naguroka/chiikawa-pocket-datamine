package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerk implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzduv zzb;

    zzerk(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zza = zzgcsVar;
        this.zzb = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzerj
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzerl zzc() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzduv zzduvVar = this.zzb;
        java.lang.String strZzc = zzduvVar.zzc();
        boolean zZzr = zzduvVar.zzr();
        boolean zZzl = com.google.android.gms.ads.internal.zzv.zzt().zzl();
        com.google.android.gms.internal.ads.zzduv zzduvVar2 = this.zzb;
        return new com.google.android.gms.internal.ads.zzerl(strZzc, zZzr, zZzl, zzduvVar2.zzp(), zzduvVar2.zzs());
    }
}
