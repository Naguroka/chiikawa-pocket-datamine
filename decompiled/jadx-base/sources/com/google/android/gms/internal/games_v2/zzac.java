package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzac extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.internal.games_v2.zzad {
    public zzac() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.internal.games_v2.zzaa zzaaVar = (com.google.android.gms.internal.games_v2.zzaa) com.google.android.gms.internal.games_v2.zzc.zza(parcel, com.google.android.gms.internal.games_v2.zzaa.CREATOR);
        com.google.android.gms.internal.games_v2.zzc.zzb(parcel);
        zzb(status, zzaaVar);
        return true;
    }
}
