package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzat extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpe zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzc;

    zzat(com.google.android.gms.ads.internal.client.zzba zzbaVar, android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzbpeVar;
        this.zzc = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzba.zzv(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzci zzciVarZzg = zzcpVar.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        zzciVarZzg.zzh(this.zzb);
        return zzciVarZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzci zzcgVar;
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperWrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            return this.zzc.zzh.zza(this.zza, this.zzb);
        }
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzcj) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcj ? (com.google.android.gms.ads.internal.client.zzcj) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcj(iBinder);
                }
            })).zze(iObjectWrapperWrap, this.zzb, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzci ? (com.google.android.gms.ads.internal.client.zzci) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcg(iBinderZze);
            }
            zzcgVar.zzh(this.zzb);
            return zzcgVar;
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            this.zzc.zzg = com.google.android.gms.internal.ads.zzbuh.zza(this.zza);
            this.zzc.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }
}
