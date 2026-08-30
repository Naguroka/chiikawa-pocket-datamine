package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbw extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzby {
    zzbw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws android.os.RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbiVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzblVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzcmVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(com.google.android.gms.internal.ads.zzbag zzbagVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbagVar);
        zzda(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzyVar);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzctVar);
        zzda(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(com.google.android.gms.internal.ads.zzbtn zzbtnVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(com.google.android.gms.internal.ads.zzbdg zzbdgVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdrVar);
        zzda(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(com.google.android.gms.internal.ads.zzbtq zzbtqVar, java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(com.google.android.gms.internal.ads.zzbwc zzbwcVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzgaVar);
        zzda(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(46, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(23, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        android.os.Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final android.os.Bundle zzd() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.ads.internal.client.zzs.CREATOR);
        parcelZzcZ.recycle();
        return zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbl zzbjVar;
        android.os.Parcel parcelZzcZ = zzcZ(33, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbjVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbl ? (com.google.android.gms.ads.internal.client.zzbl) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbj(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzcm zzckVar;
        android.os.Parcel parcelZzcZ = zzcZ(32, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzckVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzckVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcm ? (com.google.android.gms.ads.internal.client.zzcm) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzck(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdy zzdwVar;
        android.os.Parcel parcelZzcZ = zzcZ(41, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdwVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdy ? (com.google.android.gms.ads.internal.client.zzdy) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzeb zzdzVar;
        android.os.Parcel parcelZzcZ = zzcZ(26, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdzVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzeb ? (com.google.android.gms.ads.internal.client.zzeb) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzr() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(31, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzs() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final java.lang.String zzt() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzboVar);
        zzda(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws android.os.RemoteException {
        zzda(5, zza());
    }
}
