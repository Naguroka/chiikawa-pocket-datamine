package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgm extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgo {
    zzgm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zze(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzd(2, parcelZza);
    }
}
