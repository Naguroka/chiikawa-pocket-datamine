package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbrb extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbrd {
    zzbrb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.internal.ads.zzbrs zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(2, zza());
        com.google.android.gms.internal.ads.zzbrs zzbrsVar = (com.google.android.gms.internal.ads.zzbrs) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.internal.ads.zzbrs zzg() throws android.os.RemoteException {
        android.os.Parcel parcelZzcZ = zzcZ(3, zza());
        com.google.android.gms.internal.ads.zzbrs zzbrsVar = (com.google.android.gms.internal.ads.zzbrs) com.google.android.gms.internal.ads.zzayc.zza(parcelZzcZ, com.google.android.gms.internal.ads.zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzbrg zzbrgVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, bundle2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbrgVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqo zzbqoVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbqoVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqr zzbqrVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbqrVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqr zzbqrVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbqrVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzsVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqu zzbquVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbquVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqx zzbqxVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbqxVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbqx zzbqxVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar, com.google.android.gms.internal.ads.zzbfl zzbflVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbqxVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzbflVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbra zzbraVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbraVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbra zzbraVar, com.google.android.gms.internal.ads.zzbpk zzbpkVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzmVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbraVar);
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbpkVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZzg = com.google.android.gms.internal.ads.zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
