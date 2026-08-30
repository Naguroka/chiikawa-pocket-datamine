package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzu extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.nearby.messages.internal.zzv {
    public zzu() {
        super("com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzd();
        return true;
    }
}
