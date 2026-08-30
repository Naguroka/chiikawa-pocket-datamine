package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zzf {
    zzd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final java.lang.String zzc() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(1, zza());
        java.lang.String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws android.os.RemoteException {
        android.os.Parcel parcelZzb = zzb(6, zza());
        boolean zZzb = com.google.android.gms.internal.ads_identifier.zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads_identifier.zzc.zza(parcelZza, true);
        android.os.Parcel parcelZzb = zzb(2, parcelZza);
        boolean zZzb = com.google.android.gms.internal.ads_identifier.zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }
}
