package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzam {
    zzal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzd(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, geofencingRequest);
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzakVar);
        zzx(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zze(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzf(java.lang.String[] strArr, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(com.google.android.gms.location.zzbq zzbqVar, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, zzbqVar);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzakVar);
        zzx(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        com.google.android.gms.internal.location.zzc.zza(parcelZza, true);
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        zzx(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, activityTransitionRequest);
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, iStatusCallback);
        zzx(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, iStatusCallback);
        zzx(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        zzx(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, iStatusCallback);
        zzx(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final android.location.Location zzm() throws android.os.RemoteException {
        android.os.Parcel parcelZzw = zzw(7, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zzb(parcelZzw, android.location.Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final android.location.Location zzn(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzw = zzw(80, parcelZza);
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zzb(parcelZzw, android.location.Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(com.google.android.gms.internal.location.zzbc zzbcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, zzbcVar);
        zzx(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zza(parcelZza, z);
        zzx(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, location);
        zzx(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzaiVar);
        zzx(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final com.google.android.gms.location.LocationAvailability zzs(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        android.os.Parcel parcelZzw = zzw(34, parcelZza);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zzb(parcelZzw, com.google.android.gms.location.LocationAvailability.CREATOR);
        parcelZzw.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzao zzaoVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, locationSettingsRequest);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, zzaoVar);
        parcelZza.writeString(null);
        zzx(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(com.google.android.gms.internal.location.zzl zzlVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, zzlVar);
        zzx(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzc(parcelZza, sleepSegmentRequest);
        com.google.android.gms.internal.location.zzc.zzd(parcelZza, iStatusCallback);
        zzx(79, parcelZza);
    }
}
