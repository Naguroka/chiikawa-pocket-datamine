package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfe extends com.google.android.gms.dynamic.RemoteCreator {
    public zzfe() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzda ? (com.google.android.gms.ads.internal.client.zzda) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzda(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzcz zza(android.content.Context context) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.ads.internal.client.zzda) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcz ? (com.google.android.gms.ads.internal.client.zzcz) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcx(iBinderZze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
