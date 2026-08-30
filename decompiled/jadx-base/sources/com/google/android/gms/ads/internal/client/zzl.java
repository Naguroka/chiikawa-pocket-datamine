package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzl extends com.google.android.gms.dynamic.RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcj ? (com.google.android.gms.ads.internal.client.zzcj) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcj(iBinder);
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.ads.internal.client.zzci zza(android.content.Context context, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        com.google.android.gms.ads.internal.client.zzci zzcgVar;
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzcj) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzbpeVar, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzci ? (com.google.android.gms.ads.internal.client.zzci) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcg(iBinderZze);
            }
            zzcgVar.zzh(zzbpeVar);
            return zzcgVar;
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
