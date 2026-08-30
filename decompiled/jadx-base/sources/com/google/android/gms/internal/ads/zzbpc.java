package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpc extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbpe {
    zzbpc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final com.google.android.gms.internal.ads.zzbph zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbph zzbpfVar;
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbpfVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbph ? (com.google.android.gms.internal.ads.zzbph) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpf(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final com.google.android.gms.internal.ads.zzbrd zzc(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(3, parcelZza);
        com.google.android.gms.internal.ads.zzbrd zzbrdVarZzb = com.google.android.gms.internal.ads.zzbrc.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbrdVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zzd(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
