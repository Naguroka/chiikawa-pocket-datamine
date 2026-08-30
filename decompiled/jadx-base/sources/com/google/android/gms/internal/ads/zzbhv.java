package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbhv extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbhv() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgd ? (com.google.android.gms.internal.ads.zzbgd) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgb(iBinder);
    }

    public final com.google.android.gms.internal.ads.zzbga zza(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.internal.ads.zzbgd) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamic.ObjectWrapper.wrap(frameLayout), com.google.android.gms.dynamic.ObjectWrapper.wrap(frameLayout2), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbga ? (com.google.android.gms.internal.ads.zzbga) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfy(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
