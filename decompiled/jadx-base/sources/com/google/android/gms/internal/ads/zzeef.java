package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeef extends com.google.android.gms.internal.ads.zzbqq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeeh zza;
    private final com.google.android.gms.internal.ads.zzecz zzb;

    /* synthetic */ zzeef(com.google.android.gms.internal.ads.zzeeh zzeehVar, com.google.android.gms.internal.ads.zzecz zzeczVar, com.google.android.gms.internal.ads.zzeeg zzeegVar) {
        this.zza = zzeehVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zza.zzc = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzh(com.google.android.gms.internal.ads.zzbpn zzbpnVar) throws android.os.RemoteException {
        this.zza.zzd = zzbpnVar;
        ((com.google.android.gms.internal.ads.zzees) this.zzb.zzc).zzo();
    }
}
