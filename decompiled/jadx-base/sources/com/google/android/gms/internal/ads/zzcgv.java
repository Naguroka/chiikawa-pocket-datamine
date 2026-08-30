package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcgv extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzcgw {
    public static com.google.android.gms.internal.ads.zzcgw zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzcgw ? (com.google.android.gms.internal.ads.zzcgw) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzcgu(iBinder);
    }
}
