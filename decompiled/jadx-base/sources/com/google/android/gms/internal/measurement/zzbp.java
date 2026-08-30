package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzbr {
    zzbp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final android.os.Bundle zze(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        android.os.Parcel parcelZzb = zzb(1, parcelZza);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcelZzb, android.os.Bundle.CREATOR);
        parcelZzb.recycle();
        return bundle2;
    }
}
