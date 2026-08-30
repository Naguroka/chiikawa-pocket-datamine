package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaz extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzba {
    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static com.google.android.gms.location.zzba zzb(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzba ? (com.google.android.gms.location.zzba) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzay(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzd((com.google.android.gms.location.LocationResult) com.google.android.gms.internal.location.zzc.zzb(parcel, com.google.android.gms.location.LocationResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zze((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zzb(parcel, com.google.android.gms.location.LocationAvailability.CREATOR));
        }
        return true;
    }
}
