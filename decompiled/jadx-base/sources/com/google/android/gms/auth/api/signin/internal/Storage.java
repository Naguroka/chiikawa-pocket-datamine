package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class Storage {
    private static final java.util.concurrent.locks.Lock zaa = new java.util.concurrent.locks.ReentrantLock();
    private static com.google.android.gms.auth.api.signin.internal.Storage zab;
    private final java.util.concurrent.locks.Lock zac = new java.util.concurrent.locks.ReentrantLock();
    private final android.content.SharedPreferences zad;

    Storage(android.content.Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static com.google.android.gms.auth.api.signin.internal.Storage getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zaa.lock();
        try {
            if (zab == null) {
                zab = new com.google.android.gms.auth.api.signin.internal.Storage(context.getApplicationContext());
            }
            return zab;
        } finally {
            zaa.unlock();
        }
    }

    private static final java.lang.String zae(java.lang.String str, java.lang.String str2) {
        return str + ":" + str2;
    }

    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        java.lang.String strZaa;
        java.lang.String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInAccount", strZaa2))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zab(strZaa);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        java.lang.String strZaa;
        java.lang.String strZaa2 = zaa("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strZaa2) || (strZaa = zaa(zae("googleSignInOptions", strZaa2))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab(strZaa);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        java.lang.String strZac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    protected final java.lang.String zaa(java.lang.String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    protected final void zab(java.lang.String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        java.lang.String strZaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strZaa)) {
            return;
        }
        zab(zae("googleSignInAccount", strZaa));
        zab(zae("googleSignInOptions", strZaa));
    }

    protected final void zad(java.lang.String str, java.lang.String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
