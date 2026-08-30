package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhw extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbhw() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgj ? (com.google.android.gms.internal.ads.zzbgj) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgh(iBinder);
    }

    public final com.google.android.gms.internal.ads.zzbgg zza(android.view.View view, java.util.HashMap map, java.util.HashMap map2) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.internal.ads.zzbgj) getRemoteCreatorInstance(view.getContext())).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(view), com.google.android.gms.dynamic.ObjectWrapper.wrap(map), com.google.android.gms.dynamic.ObjectWrapper.wrap(map2));
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgg ? (com.google.android.gms.internal.ads.zzbgg) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbge(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
