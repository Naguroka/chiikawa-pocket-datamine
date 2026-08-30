package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzq extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.nearby.messages.internal.zzr {
    public zzq() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.nearby.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR));
        return true;
    }
}
