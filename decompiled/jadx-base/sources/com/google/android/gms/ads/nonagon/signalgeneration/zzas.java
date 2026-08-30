package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzas implements com.google.android.gms.internal.ads.zzgcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzau zzc;

    zzas(com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar, com.google.android.gms.internal.ads.zzbtt zzbttVar, boolean z) {
        this.zza = zzbttVar;
        this.zzb = z;
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(java.lang.Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@javax.annotation.Nonnull java.lang.Object obj) {
        java.util.List<android.net.Uri> list = (java.util.List) obj;
        try {
            com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzH(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzs || this.zzb) {
                for (android.net.Uri uri : list) {
                    if (this.zzc.zzO(uri)) {
                        this.zzc.zzq.zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzZ(uri, this.zzc.zzA, "1").toString(), null, null);
                    } else {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhm)).booleanValue()) {
                            this.zzc.zzq.zzd(uri.toString(), null, null);
                        }
                    }
                }
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
