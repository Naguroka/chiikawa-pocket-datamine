package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzan extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((com.google.android.gms.location.LocationSettingsResult) com.google.android.gms.internal.location.zzc.zzb(parcel, com.google.android.gms.location.LocationSettingsResult.CREATOR));
        return true;
    }
}
