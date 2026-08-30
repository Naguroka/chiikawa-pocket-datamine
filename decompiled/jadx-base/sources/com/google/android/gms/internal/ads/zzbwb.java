package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwb extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbwc {
    public static com.google.android.gms.internal.ads.zzbwc zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwc ? (com.google.android.gms.internal.ads.zzbwc) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwa(iBinder);
    }
}
