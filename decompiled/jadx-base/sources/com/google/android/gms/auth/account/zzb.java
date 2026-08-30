package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzc((android.accounts.Account) com.google.android.gms.internal.auth.zzc.zza(parcel, android.accounts.Account.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zza(com.google.android.gms.internal.auth.zzc.zza(parcel));
        }
        return true;
    }
}
