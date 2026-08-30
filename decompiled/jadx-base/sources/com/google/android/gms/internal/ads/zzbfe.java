package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfe {
    private final android.content.Context zza;

    public zzbfe(android.content.Context context) {
        this.zza = context;
    }

    public final void zza(com.google.android.gms.internal.ads.zzbuo zzbuoVar) {
        try {
            ((com.google.android.gms.internal.ads.zzbff) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbfd
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final java.lang.Object zza(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbff ? (com.google.android.gms.internal.ads.zzbff) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbff(iBinder);
                }
            })).zze(zzbuoVar);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(java.lang.String.valueOf(e.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(java.lang.String.valueOf(e2.getMessage())));
        }
    }
}
