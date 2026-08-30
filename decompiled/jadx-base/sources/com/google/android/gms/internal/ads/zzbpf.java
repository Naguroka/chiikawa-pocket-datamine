package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpf extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbph {
    zzbpf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzA(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzC(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzE() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzF() throws android.os.RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzG(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzH(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzI() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzJ(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzK(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzL() throws android.os.RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzM() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzN() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpp zzO() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpp zzbppVar;
        android.os.Parcel parcelZzcZ = zzcZ(15, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbppVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbppVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpp ? (com.google.android.gms.internal.ads.zzbpp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpq zzP() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpq zzbpqVar;
        android.os.Parcel parcelZzcZ = zzcZ(16, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpqVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpqVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpq ? (com.google.android.gms.internal.ads.zzbpq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpq(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zze() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zzf() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final android.os.Bundle zzg() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbgq zzi() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpn zzj() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpn zzbplVar;
        android.os.Parcel parcelZzcZ = zzcZ(36, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbplVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbplVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpn ? (com.google.android.gms.internal.ads.zzbpn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpl(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbpt zzk() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbpt zzbprVar;
        android.os.Parcel parcelZzcZ = zzcZ(27, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbprVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbprVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbpt ? (com.google.android.gms.internal.ads.zzbpt) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbpr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbrs zzl() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(33, zza());
        com.google.android.gms.internal.ads.zzbrs zzbrsVar = (com.google.android.gms.internal.ads.zzbrs) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.internal.ads.zzbrs zzm() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(34, zza());
        com.google.android.gms.internal.ads.zzbrs zzbrsVar = (com.google.android.gms.internal.ads.zzbrs) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzo() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbwh zzbwhVar, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(null);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwhVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzblr zzblrVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzblrVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwh zzbwhVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwhVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzv(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzx(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.internal.ads.zzbfl zzbflVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbflVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }
}
