package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zze implements com.google.android.gms.auth.zzj<com.google.android.gms.auth.TokenData> {
    private final /* synthetic */ android.os.Bundle val$options;
    private final /* synthetic */ android.accounts.Account zzo;
    private final /* synthetic */ java.lang.String zzp;

    zze(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        this.zzo = account;
        this.zzp = str;
        this.val$options = bundle;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ com.google.android.gms.auth.TokenData zzb(android.os.IBinder iBinder) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException, android.os.RemoteException {
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.auth.zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzo, this.zzp, this.val$options));
        com.google.android.gms.auth.TokenData tokenDataZza = com.google.android.gms.auth.TokenData.zza(bundle, "tokenDetails");
        if (tokenDataZza != null) {
            return tokenDataZza;
        }
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.zzay zzayVarZzc = com.google.android.gms.internal.auth.zzay.zzc(string);
        if (!com.google.android.gms.internal.auth.zzay.zza(zzayVarZzc)) {
            if (com.google.android.gms.internal.auth.zzay.NETWORK_ERROR.equals(zzayVarZzc) || com.google.android.gms.internal.auth.zzay.SERVICE_UNAVAILABLE.equals(zzayVarZzc) || com.google.android.gms.internal.auth.zzay.INTNERNAL_ERROR.equals(zzayVarZzc)) {
                throw new java.io.IOException(string);
            }
            throw new com.google.android.gms.auth.GoogleAuthException(string);
        }
        com.google.android.gms.common.logging.Logger logger = com.google.android.gms.auth.zzd.zzn;
        java.lang.String strValueOf = java.lang.String.valueOf(zzayVarZzc);
        logger.w("GoogleAuthUtil", new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 31).append("isUserRecoverableError status: ").append(strValueOf).toString());
        throw new com.google.android.gms.auth.UserRecoverableAuthException(string, intent);
    }
}
