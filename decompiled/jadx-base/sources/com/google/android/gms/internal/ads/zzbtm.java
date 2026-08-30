package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtm extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbtn {
    public static com.google.android.gms.internal.ads.zzbtn zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbtn ? (com.google.android.gms.internal.ads.zzbtn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtl(iBinder);
    }
}
