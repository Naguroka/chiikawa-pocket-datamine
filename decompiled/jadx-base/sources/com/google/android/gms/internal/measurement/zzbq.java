package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbq extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzbr {
    public static com.google.android.gms.internal.measurement.zzbr zzb(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzbr ? (com.google.android.gms.internal.measurement.zzbr) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzbp(iBinder);
    }
}
