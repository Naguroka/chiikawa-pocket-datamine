package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzi implements com.google.android.gms.auth.zzj<java.lang.Boolean> {
    private final /* synthetic */ java.lang.String zzt;

    zzi(java.lang.String str) {
        this.zzt = str;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ java.lang.Boolean zzb(android.os.IBinder iBinder) throws com.google.android.gms.auth.GoogleAuthException, android.os.RemoteException, java.io.IOException {
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.auth.zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzt));
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzay zzayVarZzc = com.google.android.gms.internal.auth.zzay.zzc(string);
        if (com.google.android.gms.internal.auth.zzay.SUCCESS.equals(zzayVarZzc)) {
            return true;
        }
        if (!com.google.android.gms.internal.auth.zzay.zza(zzayVarZzc)) {
            throw new com.google.android.gms.auth.GoogleAuthException(string);
        }
        com.google.android.gms.common.logging.Logger logger = com.google.android.gms.auth.zzd.zzn;
        java.lang.String strValueOf = java.lang.String.valueOf(zzayVarZzc);
        logger.w("GoogleAuthUtil", new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 31).append("isUserRecoverableError status: ").append(strValueOf).toString());
        throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
    }
}
