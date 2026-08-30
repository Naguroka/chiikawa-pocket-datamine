package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbwn extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbwp {
    zzbwn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final android.os.Bundle zzb() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, android.os.Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdy zzc() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzb = com.google.android.gms.ads.internal.client.zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.internal.ads.zzbwm zzd() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwm zzbwkVar;
        android.os.Parcel parcelZzcZ = zzcZ(11, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwkVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwkVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbwm ? (com.google.android.gms.internal.ads.zzbwm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbwk(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final java.lang.String zze() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwwVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzbww zzbwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwwVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdoVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(com.google.android.gms.internal.ads.zzbws zzbwsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwsVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(com.google.android.gms.internal.ads.zzbxd zzbxdVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbxdVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(com.google.android.gms.internal.ads.zzbwx zzbwxVar) throws android.os.RemoteException {
        throw null;
    }
}
