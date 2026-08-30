package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzef extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.internal.nearby.zzeg {
    public zzef() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            zzc((com.google.android.gms.internal.nearby.zzfi) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfi.CREATOR));
            return true;
        }
        if (i == 3) {
            zzd((com.google.android.gms.internal.nearby.zzfk) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfk.CREATOR));
            return true;
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzb((com.google.android.gms.internal.nearby.zzfg) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfg.CREATOR));
        return true;
    }
}
