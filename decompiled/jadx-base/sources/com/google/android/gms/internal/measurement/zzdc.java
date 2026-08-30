package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdc extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzde {
    zzdc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(2, zza());
        int i = parcelZzb.readInt();
        parcelZzb.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }
}
