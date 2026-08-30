package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcx extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzcy {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbo.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
        zze(bundle);
        parcel2.writeNoException();
        return true;
    }
}
