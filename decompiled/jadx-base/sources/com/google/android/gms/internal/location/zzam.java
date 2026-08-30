package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzam extends android.os.IInterface {
    void zzd(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException;

    void zze(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException;

    void zzf(java.lang.String[] strArr, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException;

    void zzg(com.google.android.gms.location.zzbq zzbqVar, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException;

    void zzh(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void zzi(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzj(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zzk(android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void zzl(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    @java.lang.Deprecated
    android.location.Location zzm() throws android.os.RemoteException;

    android.location.Location zzn(java.lang.String str) throws android.os.RemoteException;

    void zzo(com.google.android.gms.internal.location.zzbc zzbcVar) throws android.os.RemoteException;

    void zzp(boolean z) throws android.os.RemoteException;

    void zzq(android.location.Location location) throws android.os.RemoteException;

    void zzr(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException;

    com.google.android.gms.location.LocationAvailability zzs(java.lang.String str) throws android.os.RemoteException;

    void zzt(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzao zzaoVar, java.lang.String str) throws android.os.RemoteException;

    void zzu(com.google.android.gms.internal.location.zzl zzlVar) throws android.os.RemoteException;

    void zzv(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;
}
