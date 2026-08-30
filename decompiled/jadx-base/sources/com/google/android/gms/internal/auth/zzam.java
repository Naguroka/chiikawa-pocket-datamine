package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzam extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zza((com.google.android.gms.auth.api.proxy.ProxyResponse) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzb(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
