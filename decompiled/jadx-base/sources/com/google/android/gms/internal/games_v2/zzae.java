package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzae extends com.google.android.gms.internal.games_v2.zza implements android.os.IInterface {
    zzae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void zzd(com.google.android.gms.internal.games_v2.zzad zzadVar, com.google.android.gms.internal.games_v2.zzy zzyVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.games_v2.zzc.zzf(parcelZza, zzadVar);
        com.google.android.gms.internal.games_v2.zzc.zzd(parcelZza, zzyVar);
        zzc(2, parcelZza);
    }
}
