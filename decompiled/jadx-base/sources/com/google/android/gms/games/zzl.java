package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzl {
    private static final java.util.concurrent.atomic.AtomicInteger zzf = new java.util.concurrent.atomic.AtomicInteger(0);
    int zza;
    final java.util.ArrayList zzb;
    com.google.android.gms.auth.api.signin.GoogleSignInAccount zzc;
    java.lang.String zzd;
    com.google.android.gms.games.internal.zzl zze;

    private zzl() {
        this.zza = 4368;
        this.zzb = new java.util.ArrayList();
        this.zzc = null;
        this.zzd = null;
        throw null;
    }

    public final com.google.android.gms.games.zzl zza(java.lang.String str) {
        this.zzd = str;
        return this;
    }

    public final com.google.android.gms.games.zzl zzb(com.google.android.gms.games.internal.zzl zzlVar) {
        this.zze = (com.google.android.gms.games.internal.zzl) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlVar);
        return this;
    }

    public final com.google.android.gms.games.zzl zzc(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.zzc = googleSignInAccount;
        return this;
    }

    public final com.google.android.gms.games.zzl zzd(int i) {
        this.zza = 2101523;
        return this;
    }

    public final com.google.android.gms.games.zzn zze() {
        return new com.google.android.gms.games.zzn(false, true, 17, false, this.zza, null, this.zzb, false, false, false, this.zzc, null, 0, 9, this.zzd, this.zze, null);
    }

    /* synthetic */ zzl(com.google.android.gms.games.zzk zzkVar) {
        this.zza = 4368;
        this.zzb = new java.util.ArrayList();
        this.zzc = null;
        this.zzd = null;
        this.zze = com.google.android.gms.games.internal.zzl.zza;
    }
}
