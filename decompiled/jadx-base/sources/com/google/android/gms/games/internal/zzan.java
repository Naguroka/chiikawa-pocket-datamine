package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzan extends com.google.android.gms.internal.games_v2.zzb implements com.google.android.gms.games.internal.zzao {
    public zzan() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1001) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzan zzanVarZzb = zzb();
        parcel2.writeNoException();
        com.google.android.gms.internal.games_v2.zzc.zze(parcel2, zzanVarZzb);
        return true;
    }
}
