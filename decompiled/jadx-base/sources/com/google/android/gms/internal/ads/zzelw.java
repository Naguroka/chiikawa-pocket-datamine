package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelw implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;

    zzelw(com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzfcy zzfcyVar) {
        this.zza = zzgcsVar;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzelv
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzelx zzc() throws java.lang.Exception {
        java.lang.String strZza = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgR)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd))) {
            strZza = com.google.android.gms.internal.ads.zzfcy.zza();
        }
        return new com.google.android.gms.internal.ads.zzelx(strZza);
    }
}
