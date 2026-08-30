package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgj extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgl {
    zzgj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzA(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzB(com.google.android.gms.measurement.internal.zzqb zzqbVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzqbVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzC(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzag zzagVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzagVar);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final byte[] zzD(com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzbhVar);
        parcelZza.writeString(str);
        android.os.Parcel parcelZzb = zzb(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzb.createByteArray();
        parcelZzb.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final com.google.android.gms.measurement.internal.zzap zze(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        android.os.Parcel parcelZzb = zzb(21, parcelZza);
        com.google.android.gms.measurement.internal.zzap zzapVar = (com.google.android.gms.measurement.internal.zzap) com.google.android.gms.internal.measurement.zzbo.zza(parcelZzb, com.google.android.gms.measurement.internal.zzap.CREATOR);
        parcelZzb.recycle();
        return zzapVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.lang.String zzf(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        android.os.Parcel parcelZzb = zzb(11, parcelZza);
        java.lang.String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzg(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzh(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        parcelZza.writeInt(z ? 1 : 0);
        android.os.Parcel parcelZzb = zzb(7, parcelZza);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(com.google.android.gms.measurement.internal.zzqb.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        android.os.Parcel parcelZzb = zzb(16, parcelZza);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(com.google.android.gms.measurement.internal.zzai.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzj(java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        android.os.Parcel parcelZzb = zzb(17, parcelZza);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(com.google.android.gms.measurement.internal.zzai.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzk(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i = com.google.android.gms.internal.measurement.zzbo.zza;
        parcelZza.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        android.os.Parcel parcelZzb = zzb(14, parcelZza);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(com.google.android.gms.measurement.internal.zzqb.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        int i = com.google.android.gms.internal.measurement.zzbo.zza;
        parcelZza.writeInt(z ? 1 : 0);
        android.os.Parcel parcelZzb = zzb(15, parcelZza);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(com.google.android.gms.measurement.internal.zzqb.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzm(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzn(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzo(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzpc zzpcVar, com.google.android.gms.measurement.internal.zzgr zzgrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpcVar);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzgrVar);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzp(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzbhVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzq(com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzr(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzgo zzgoVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zze(parcelZza, zzgoVar);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzs(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzt(com.google.android.gms.measurement.internal.zzai zzaiVar, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzaiVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzu(com.google.android.gms.measurement.internal.zzai zzaiVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzv(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzw(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzx(android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzy(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(26, parcelZza);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzz(com.google.android.gms.measurement.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzrVar);
        zzc(6, parcelZza);
    }
}
