package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbhm extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbhn {
    public static com.google.android.gms.internal.ads.zzbhn zzb(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbhn ? (com.google.android.gms.internal.ads.zzbhn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbhl(iBinder);
    }
}
