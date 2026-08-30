package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzep extends com.google.android.gms.internal.drive.zza implements com.google.android.gms.internal.drive.zzeo {
    zzep(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzek zzekVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzekVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgq zzgqVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzgqVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhf zzhfVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzhfVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzr zzrVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzrVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzw zzwVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzwVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzy zzyVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final com.google.android.gms.internal.drive.zzec zza(com.google.android.gms.internal.drive.zzgj zzgjVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzgjVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        android.os.Parcel parcelZza2 = zza(7, parcelZza);
        com.google.android.gms.internal.drive.zzec zzecVar = (com.google.android.gms.internal.drive.zzec) com.google.android.gms.internal.drive.zzc.zza(parcelZza2, com.google.android.gms.internal.drive.zzec.CREATOR);
        parcelZza2.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzo zzoVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzoVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final android.content.IntentSender zza(com.google.android.gms.internal.drive.zzgm zzgmVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzgmVar);
        android.os.Parcel parcelZza2 = zza(10, parcelZza);
        android.content.IntentSender intentSender = (android.content.IntentSender) com.google.android.gms.internal.drive.zzc.zza(parcelZza2, android.content.IntentSender.CREATOR);
        parcelZza2.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final android.content.IntentSender zza(com.google.android.gms.internal.drive.zzu zzuVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzuVar);
        android.os.Parcel parcelZza2 = zza(11, parcelZza);
        android.content.IntentSender intentSender = (android.content.IntentSender) com.google.android.gms.internal.drive.zzc.zza(parcelZza2, android.content.IntentSender.CREATOR);
        parcelZza2.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzex zzexVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzexVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzj zzjVar, com.google.android.gms.internal.drive.zzes zzesVar, java.lang.String str, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzjVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzesVar);
        parcelZza.writeString(null);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgs zzgsVar, com.google.android.gms.internal.drive.zzes zzesVar, java.lang.String str, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzgsVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzesVar);
        parcelZza.writeString(null);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzadVar);
        zzb(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhb zzhbVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzhbVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzm zzmVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzmVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzab zzabVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzabVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgw zzgwVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzgwVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zzb(com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgu zzguVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzguVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(36, parcelZza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhd zzhdVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzhdVar);
        com.google.android.gms.internal.drive.zzc.zza(parcelZza, zzeqVar);
        zzb(38, parcelZza);
    }
}
