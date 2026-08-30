package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbs extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzbu {
    zzbs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbr zze() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbr zzbpVar;
        android.os.Parcel parcelZzcZ = zzcZ(1, zza());
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbr ? (com.google.android.gms.ads.internal.client.zzbr) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(com.google.android.gms.internal.ads.zzbgu zzbguVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.internal.ads.zzbgx zzbgxVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzbhd zzbhdVar, com.google.android.gms.internal.ads.zzbha zzbhaVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbhdVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbhaVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.internal.ads.zzbmi zzbmiVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.internal.ads.zzbhh zzbhhVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbhhVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(com.google.android.gms.internal.ads.zzbhk zzbhkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbhkVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(com.google.android.gms.ads.internal.client.zzbl zzblVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzblVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, adManagerAdViewOptions);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(com.google.android.gms.internal.ads.zzblz zzblzVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.internal.ads.zzbfl zzbflVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbflVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws android.os.RemoteException {
        throw null;
    }
}
