package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzn extends com.google.android.gms.internal.nearby.zzb implements com.google.android.gms.nearby.messages.internal.zzo {
    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1 || i == 2) {
        } else {
            if (i != 4) {
                return false;
            }
            zzd(parcel.createTypedArrayList(com.google.android.gms.nearby.messages.internal.Update.CREATOR));
        }
        return true;
    }
}
