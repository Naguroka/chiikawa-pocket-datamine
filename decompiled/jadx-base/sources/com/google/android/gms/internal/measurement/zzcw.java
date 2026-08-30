package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcw extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcy {
    zzcw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        zzc(1, parcelZza);
    }
}
