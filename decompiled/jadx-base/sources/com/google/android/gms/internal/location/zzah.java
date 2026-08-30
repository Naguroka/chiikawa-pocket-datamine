package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzah extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzb((com.google.android.gms.internal.location.zzaa) com.google.android.gms.internal.location.zzc.zzb(parcel, com.google.android.gms.internal.location.zzaa.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
