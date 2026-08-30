package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbtg extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbth {
    public static com.google.android.gms.internal.ads.zzbth zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbth ? (com.google.android.gms.internal.ads.zzbth) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbtf(iBinder);
    }
}
