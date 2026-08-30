package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzr extends com.google.android.gms.internal.p000authapi.zzd implements com.google.android.gms.auth.api.signin.internal.zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzj();
        } else {
            if (i != 2) {
                return false;
            }
            zzk();
        }
        return true;
    }
}
