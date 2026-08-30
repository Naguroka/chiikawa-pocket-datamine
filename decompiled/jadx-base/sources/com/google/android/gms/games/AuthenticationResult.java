package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AuthenticationResult {
    public static final com.google.android.gms.games.AuthenticationResult zza = new com.google.android.gms.games.AuthenticationResult(true);
    public static final com.google.android.gms.games.AuthenticationResult zzb = new com.google.android.gms.games.AuthenticationResult(false);
    private final boolean zzc;

    private AuthenticationResult(boolean z) {
        this.zzc = z;
    }

    public boolean isAuthenticated() {
        return this.zzc;
    }
}
