package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzv extends com.google.android.gms.internal.p000authapi.zzd implements com.google.android.gms.internal.p000authapi.zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzc((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.auth.api.credentials.Credential.CREATOR));
        } else if (i == 2) {
            zzc((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            zzc((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
