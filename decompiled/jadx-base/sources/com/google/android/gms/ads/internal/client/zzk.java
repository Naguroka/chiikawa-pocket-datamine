package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzk extends com.google.android.gms.dynamic.RemoteCreator {
    private com.google.android.gms.internal.ads.zzbuj zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbz ? (com.google.android.gms.ads.internal.client.zzbz) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbz(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzby zza(android.content.Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) {
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkA)).booleanValue()) {
            try {
                android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzbz) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzsVar, str, zzbpeVar, 244410000, i);
                if (iBinderZze == null) {
                    return null;
                }
                android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbw(iBinderZze);
            } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            android.os.IBinder iBinderZze2 = ((com.google.android.gms.ads.internal.client.zzbz) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzbz ? (com.google.android.gms.ads.internal.client.zzbz) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzbz(iBinder);
                }
            })).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzsVar, str, zzbpeVar, 244410000, i);
            if (iBinderZze2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzbw(iBinderZze2);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e2) {
            com.google.android.gms.internal.ads.zzbuj zzbujVarZza = com.google.android.gms.internal.ads.zzbuh.zza(context);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
