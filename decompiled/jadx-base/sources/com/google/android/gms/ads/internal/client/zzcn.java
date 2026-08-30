package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcn extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzcp {
    zzcn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzbu zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(3, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbsVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(13, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(1, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(2, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, java.lang.String str, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzby zzbwVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(10, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzci zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzci zzcgVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(18, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcgVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcgVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzci ? (com.google.android.gms.ads.internal.client.zzci) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzcz zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzcz zzcxVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(9, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcxVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcxVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcz ? (com.google.android.gms.ads.internal.client.zzcz) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzcx(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzdu zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdu zzdsVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(17, parcelZza);
        android.os.IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdu ? (com.google.android.gms.ads.internal.client.zzdu) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzds(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbga zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        android.os.Parcel parcelZzcZ = zzcZ(5, parcelZza);
        com.google.android.gms.internal.ads.zzbga zzbgaVarZzdy = com.google.android.gms.internal.ads.zzbfz.zzdy(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbgaVarZzdy;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbgg zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper3);
        android.os.Parcel parcelZzcZ = zzcZ(11, parcelZza);
        com.google.android.gms.internal.ads.zzbgg zzbggVarZze = com.google.android.gms.internal.ads.zzbgf.zze(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbggVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbkr zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i, com.google.android.gms.internal.ads.zzbko zzbkoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbkoVar);
        android.os.Parcel parcelZzcZ = zzcZ(16, parcelZza);
        com.google.android.gms.internal.ads.zzbkr zzbkrVarZzb = com.google.android.gms.internal.ads.zzbkq.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbkrVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbsx zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(15, parcelZza);
        com.google.android.gms.internal.ads.zzbsx zzbsxVarZzb = com.google.android.gms.internal.ads.zzbsw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbsxVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbte zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(8, parcelZza);
        com.google.android.gms.internal.ads.zzbte zzbteVarZzI = com.google.android.gms.internal.ads.zzbtd.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbteVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbvz zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbwp zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(12, parcelZza);
        com.google.android.gms.internal.ads.zzbwp zzbwpVarZzq = com.google.android.gms.internal.ads.zzbwo.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbwpVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbyu zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbpe zzbpeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        android.os.Parcel parcelZzcZ = zzcZ(14, parcelZza);
        com.google.android.gms.internal.ads.zzbyu zzbyuVarZzb = com.google.android.gms.internal.ads.zzbyt.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbyuVarZzb;
    }
}
