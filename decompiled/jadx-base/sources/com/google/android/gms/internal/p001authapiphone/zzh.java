package com.google.android.gms.internal.p001authapiphone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzh extends com.google.android.gms.internal.p001authapiphone.zzb implements com.google.android.gms.internal.p001authapiphone.zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapiphone.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
        return true;
    }
}
