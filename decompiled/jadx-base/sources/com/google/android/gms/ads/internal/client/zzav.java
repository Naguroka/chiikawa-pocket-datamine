package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzav extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzb;

    zzav(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context) {
        this.zza = context;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "mobile_ads_settings");
        return new com.google.android.gms.ads.internal.client.zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        return zzcpVar.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzda) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzau
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzda ? (com.google.android.gms.ads.internal.client.zzda) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzda(iBinder);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcz ? (com.google.android.gms.ads.internal.client.zzcz) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcx(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzb.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zza);
            this.zzb.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
