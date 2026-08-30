package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzf implements com.google.android.gms.auth.zzj<java.lang.Void> {
    private final /* synthetic */ android.os.Bundle val$extras;
    private final /* synthetic */ java.lang.String zzq;

    zzf(java.lang.String str, android.os.Bundle bundle) {
        this.zzq = str;
        this.val$extras = bundle;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ java.lang.Void zzb(android.os.IBinder iBinder) throws com.google.android.gms.auth.GoogleAuthException, android.os.RemoteException, java.io.IOException {
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.auth.zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzq, this.val$extras));
        java.lang.String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.google.android.gms.auth.GoogleAuthException(string);
    }
}
