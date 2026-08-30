package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzi extends com.google.android.gms.dynamic.RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbv ? (com.google.android.gms.ads.internal.client.zzbv) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbv(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zza(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzbv) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, zzbpeVar, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
