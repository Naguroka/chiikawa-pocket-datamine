package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtp extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbtq {
    public static com.google.android.gms.internal.ads.zzbtq zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbtq ? (com.google.android.gms.internal.ads.zzbtq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbto(iBinder);
    }
}
