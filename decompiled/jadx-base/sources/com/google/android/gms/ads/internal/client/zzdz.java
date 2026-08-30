package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdz extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzeb {
    zzdz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzee zzecVar;
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzecVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzecVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzee ? (com.google.android.gms.ads.internal.client.zzee) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzec(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzeeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws android.os.RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(4, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
