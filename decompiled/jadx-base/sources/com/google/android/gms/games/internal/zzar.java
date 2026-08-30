package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzar {
    private static final com.google.android.gms.games.internal.zzar zza = new com.google.android.gms.games.internal.zzar();
    private volatile boolean zzb = false;

    zzar() {
    }

    public static com.google.android.gms.games.internal.zzar zza() {
        return zza;
    }

    public final void zzb() {
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
