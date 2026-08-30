package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbgw extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbgx {
    public static com.google.android.gms.internal.ads.zzbgx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgx ? (com.google.android.gms.internal.ads.zzbgx) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgv(iBinder);
    }
}
