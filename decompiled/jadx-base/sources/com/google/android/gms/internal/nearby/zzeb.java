package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzeb extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.internal.nearby.zzec {
    public zzeb() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        zzb((com.google.android.gms.internal.nearby.zzfa) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.internal.nearby.zzfa.CREATOR));
        return true;
    }
}
