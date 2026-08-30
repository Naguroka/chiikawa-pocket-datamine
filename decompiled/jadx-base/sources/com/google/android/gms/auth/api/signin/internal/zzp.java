package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzp {
    private static com.google.android.gms.auth.api.signin.internal.zzp zzbn;
    private com.google.android.gms.auth.api.signin.internal.Storage zzbo;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zzbp;
    private com.google.android.gms.auth.api.signin.GoogleSignInOptions zzbq;

    private zzp(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context);
        this.zzbo = storage;
        this.zzbp = storage.getSavedDefaultGoogleSignInAccount();
        this.zzbq = this.zzbo.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized com.google.android.gms.auth.api.signin.internal.zzp zzd(android.content.Context context) {
        return zze(context.getApplicationContext());
    }

    private static synchronized com.google.android.gms.auth.api.signin.internal.zzp zze(android.content.Context context) {
        if (zzbn == null) {
            zzbn = new com.google.android.gms.auth.api.signin.internal.zzp(context);
        }
        return zzbn;
    }

    public final synchronized void clear() {
        this.zzbo.clear();
        this.zzbp = null;
        this.zzbq = null;
    }

    public final synchronized void zzc(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.zzbo.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzbp = googleSignInAccount;
        this.zzbq = googleSignInOptions;
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInAccount zzh() {
        return this.zzbp;
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInOptions zzi() {
        return this.zzbq;
    }
}
