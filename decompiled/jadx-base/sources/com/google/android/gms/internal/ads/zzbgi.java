package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbgi extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbgj {
    public static com.google.android.gms.internal.ads.zzbgj zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgj ? (com.google.android.gms.internal.ads.zzbgj) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgh(iBinder);
    }
}
