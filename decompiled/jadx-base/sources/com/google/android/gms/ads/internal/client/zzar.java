package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzar extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzar(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpeVar;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "native_ad");
        return new com.google.android.gms.ads.internal.client.zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzbv) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbv ? (com.google.android.gms.ads.internal.client.zzbv) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbv(iBinder);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzd.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zza);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
