package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpi extends com.google.android.gms.internal.ads.zzaya implements com.google.android.gms.internal.ads.zzbpk {
    zzbpi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzd(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(com.google.android.gms.internal.ads.zzbgq zzbgqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbgqVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(com.google.android.gms.internal.ads.zzbwi zzbwiVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(com.google.android.gms.internal.ads.zzbwm zzbwmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.ads.zzayc.zzf(parcelZza, zzbwmVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws android.os.RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws android.os.RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws android.os.RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws android.os.RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws android.os.RemoteException {
        zzda(13, zza());
    }
}
