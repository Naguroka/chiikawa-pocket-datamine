package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcg extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzci {
    zzcg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbad zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(5, parcelZza);
        com.google.android.gms.internal.ads.zzbad zzbadVarZzb = com.google.android.gms.internal.ads.zzbac.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbadVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.ads.internal.client.zzby zzf(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(7, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzby ? (com.google.android.gms.ads.internal.client.zzby) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbwp zzg(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(3, parcelZza);
        com.google.android.gms.internal.ads.zzbwp zzbwpVarZzq = com.google.android.gms.internal.ads.zzbwo.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbwpVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(com.google.android.gms.internal.ads.zzbpe zzbpeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(java.util.List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzcfVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
