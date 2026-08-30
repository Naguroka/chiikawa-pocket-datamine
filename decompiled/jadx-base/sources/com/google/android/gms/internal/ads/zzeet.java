package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeet extends com.google.android.gms.internal.ads.zzbwg implements com.google.android.gms.internal.ads.zzcxd {
    private com.google.android.gms.internal.ads.zzbwh zza;
    private com.google.android.gms.internal.ads.zzcxc zzb;
    private com.google.android.gms.internal.ads.zzded zzc;

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void zza(com.google.android.gms.internal.ads.zzcxc zzcxcVar) {
        this.zzb = zzcxcVar;
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzbwh zzbwhVar) {
        this.zza = zzbwhVar;
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzded zzdedVar) {
        this.zzc = zzdedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            zzbwhVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcxc zzcxcVar = this.zzb;
        if (zzcxcVar != null) {
            zzcxcVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcxc zzcxcVar = this.zzb;
        if (zzcxcVar != null) {
            zzcxcVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zza.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzded zzdedVar = this.zzc;
        if (zzdedVar != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to initialize adapter ".concat(java.lang.String.valueOf(((com.google.android.gms.internal.ads.zzehx) zzdedVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzded zzdedVar = this.zzc;
        if (zzdedVar != null) {
            java.util.concurrent.Executor executor = ((com.google.android.gms.internal.ads.zzehx) zzdedVar).zzd.zzb;
            final com.google.android.gms.internal.ads.zzecz zzeczVar = ((com.google.android.gms.internal.ads.zzehx) zzdedVar).zzc;
            final com.google.android.gms.internal.ads.zzfbo zzfboVar = ((com.google.android.gms.internal.ads.zzehx) zzdedVar).zzb;
            final com.google.android.gms.internal.ads.zzfca zzfcaVar = ((com.google.android.gms.internal.ads.zzehx) zzdedVar).zza;
            final com.google.android.gms.internal.ads.zzehx zzehxVar = (com.google.android.gms.internal.ads.zzehx) zzdedVar;
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzehw
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzehz zzehzVar = zzehxVar.zzd;
                    com.google.android.gms.internal.ads.zzehz.zze(zzfcaVar, zzfboVar, zzeczVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwi zzbwiVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zzd.zza(zzbwiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((com.google.android.gms.internal.ads.zzehy) zzbwhVar).zzd.zzc();
        }
    }
}
