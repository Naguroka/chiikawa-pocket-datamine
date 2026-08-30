package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzh implements com.google.android.gms.auth.zzj<android.os.Bundle> {
    private final /* synthetic */ android.accounts.Account zzo;

    zzh(android.accounts.Account account) {
        this.zzo = account;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ android.os.Bundle zzb(android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        return (android.os.Bundle) com.google.android.gms.auth.zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzo));
    }
}
