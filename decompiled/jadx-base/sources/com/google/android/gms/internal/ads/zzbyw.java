package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbyw extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbyx {
    public static com.google.android.gms.internal.ads.zzbyx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyx ? (com.google.android.gms.internal.ads.zzbyx) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbyv(iBinder);
    }
}
