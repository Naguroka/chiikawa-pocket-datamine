package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            onPostInitComplete(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzb(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.zzk zzkVar = (com.google.android.gms.common.internal.zzk) com.google.android.gms.internal.common.zzc.zza(parcel, com.google.android.gms.common.internal.zzk.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzc(i5, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
