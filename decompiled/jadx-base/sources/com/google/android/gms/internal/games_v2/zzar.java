package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzar {
    private final com.google.android.gms.internal.games_v2.zzav zza;

    private zzar(com.google.android.gms.internal.games_v2.zzav zzavVar) {
        this.zza = zzavVar;
    }

    public static com.google.android.gms.internal.games_v2.zzar zza(android.app.Application application) {
        return new com.google.android.gms.internal.games_v2.zzar(com.google.android.gms.internal.games_v2.zzax.zza(application));
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.android.gms.internal.games_v2.zzaq zzaqVar) {
        com.google.android.gms.internal.games_v2.zzav zzavVar = this.zza;
        zzaqVar.getClass();
        return zzavVar.zzd(new com.google.android.gms.internal.games_v2.zzap(zzaqVar));
    }
}
