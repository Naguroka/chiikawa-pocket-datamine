package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtb extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbtb() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbth ? (com.google.android.gms.internal.ads.zzbth) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtf(iBinder);
    }

    public final com.google.android.gms.internal.ads.zzbte zza(android.app.Activity activity) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.internal.ads.zzbth) getRemoteCreatorInstance(activity)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbte ? (com.google.android.gms.internal.ads.zzbte) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtc(iBinderZze);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
