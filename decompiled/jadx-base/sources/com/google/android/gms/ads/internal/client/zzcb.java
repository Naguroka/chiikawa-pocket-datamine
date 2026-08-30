package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcb extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzcc {
    public static com.google.android.gms.ads.internal.client.zzcc zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcc ? (com.google.android.gms.ads.internal.client.zzcc) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzca(iBinder);
    }
}
