package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzs extends com.google.android.gms.internal.nearby.zza implements android.os.IInterface {
    zzs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void zzd(com.google.android.gms.nearby.messages.internal.zzby zzbyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzbyVar);
        zzq(1, parcelZza);
    }

    public final void zze(com.google.android.gms.nearby.messages.internal.zzcd zzcdVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcdVar);
        zzq(2, parcelZza);
    }

    public final void zzf(com.google.android.gms.nearby.messages.internal.SubscribeRequest subscribeRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, subscribeRequest);
        zzq(3, parcelZza);
    }

    public final void zzg(com.google.android.gms.nearby.messages.internal.zzcf zzcfVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcfVar);
        zzq(4, parcelZza);
    }

    public final void zzh(com.google.android.gms.nearby.messages.internal.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzhVar);
        zzq(7, parcelZza);
    }

    public final void zzi(com.google.android.gms.nearby.messages.internal.zzca zzcaVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcaVar);
        zzq(8, parcelZza);
    }

    public final void zzj(com.google.android.gms.nearby.messages.internal.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzjVar);
        zzq(9, parcelZza);
    }
}
