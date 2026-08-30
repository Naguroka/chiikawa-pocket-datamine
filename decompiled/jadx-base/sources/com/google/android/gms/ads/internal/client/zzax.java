package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzax extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.widget.FrameLayout zza;
    final /* synthetic */ android.widget.FrameLayout zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzax(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, android.content.Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zzc, "native_ad_view_delegate");
        return new com.google.android.gms.ads.internal.client.zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zzc);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzba zzbaVar = this.zzd;
            return zzbaVar.zzd.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return com.google.android.gms.internal.ads.zzbfz.zzdy(((com.google.android.gms.internal.ads.zzbgd) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaw
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzbgc.zzb((android.os.IBinder) obj);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), 244410000));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzd.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zzc);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
