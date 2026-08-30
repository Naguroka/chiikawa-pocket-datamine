package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static com.google.android.gms.location.zzbd zzb(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzbd ? (com.google.android.gms.location.zzbd) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzbb(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzd((android.location.Location) com.google.android.gms.internal.location.zzc.zzb(parcel, android.location.Location.CREATOR));
        return true;
    }
}
