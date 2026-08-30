package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcx extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.ads.internal.client.zzcz {
    zzcx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(7, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.lang.String zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(9, zza());
        java.lang.String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.util.List zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(13, zza());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(com.google.android.gms.internal.ads.zzbln.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws android.os.RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(null);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzdlVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(com.google.android.gms.internal.ads.zzbpe zzbpeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpeVar);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        int i = com.google.android.gms.internal.ads.zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(com.google.android.gms.internal.ads.zzblu zzbluVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbluVar);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzfvVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
