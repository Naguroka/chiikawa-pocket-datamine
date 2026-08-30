package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzej extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.internal.nearby.zzek {
    public zzej() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            zzb((com.google.android.gms.internal.nearby.zzfm) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfm.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzc((com.google.android.gms.internal.nearby.zzfo) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfo.CREATOR));
        return true;
    }
}
