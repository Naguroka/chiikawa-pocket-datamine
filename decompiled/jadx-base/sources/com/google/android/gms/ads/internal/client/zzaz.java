package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaz extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ java.util.HashMap zzb;
    final /* synthetic */ java.util.HashMap zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzaz(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.view.View view, java.util.HashMap map, java.util.HashMap map2) {
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new com.google.android.gms.ads.internal.client.zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        java.util.HashMap map = this.zzc;
        return zzcpVar.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamic.ObjectWrapper.wrap(map));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza.getContext());
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzba zzbaVar = this.zzd;
            return zzbaVar.zzf.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return com.google.android.gms.internal.ads.zzbgf.zze(((com.google.android.gms.internal.ads.zzbgj) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzay
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzbgi.zzb((android.os.IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc)));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzd.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zza.getContext());
            this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
