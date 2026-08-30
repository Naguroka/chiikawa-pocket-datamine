package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfrl extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzfrn {
    zzfrl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zze(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfrp zzfrpVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzf(java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfrp zzfrpVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzg(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfrp zzfrpVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(3, parcelZza);
    }
}
