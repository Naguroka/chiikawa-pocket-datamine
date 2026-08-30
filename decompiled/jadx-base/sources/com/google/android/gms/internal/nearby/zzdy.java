package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdy extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.internal.nearby.zzdz {
    public zzdy() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            zzb((com.google.android.gms.internal.nearby.zzew) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzew.CREATOR));
            return true;
        }
        if (i == 3) {
            zzc((com.google.android.gms.internal.nearby.zzfc) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfc.CREATOR));
            return true;
        }
        if (i == 4) {
            zzd((com.google.android.gms.internal.nearby.zzfe) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfe.CREATOR));
            return true;
        }
        if (i != 5) {
            return false;
        }
        zze((com.google.android.gms.internal.nearby.zzeu) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzeu.CREATOR));
        return true;
    }
}
