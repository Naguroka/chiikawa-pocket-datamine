package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbkt extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbku {
    public static com.google.android.gms.internal.ads.zzbku zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbku ? (com.google.android.gms.internal.ads.zzbku) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbks(iBinder);
    }
}
