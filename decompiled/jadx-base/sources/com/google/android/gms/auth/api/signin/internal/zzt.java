package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzt extends com.google.android.gms.internal.p000authapi.zzd implements com.google.android.gms.auth.api.signin.internal.zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 101:
                zzc((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR), (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 102:
                zze((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 103:
                zzf((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zze.zzc(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
