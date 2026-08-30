package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbr {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final android.app.Application zzb;
    private final com.google.android.gms.internal.games_v2.zzau zzc;
    private final com.google.android.gms.games.internal.zzg zzd;

    private zzbr(android.app.Application application, com.google.android.gms.internal.games_v2.zzau zzauVar, com.google.android.gms.games.internal.zzg zzgVar) {
        this.zzb = application;
        this.zzc = zzauVar;
        this.zzd = zzgVar;
    }

    public static android.app.Application zza() {
        zzb();
        return ((com.google.android.gms.internal.games_v2.zzbr) zza.get()).zzb;
    }

    public static void zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(zza.get() != null, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static void zzc(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(context != null);
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        if (((com.google.android.gms.internal.games_v2.zzbr) atomicReference.get()) == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.app.Application application = applicationContext != null ? (android.app.Application) applicationContext : (android.app.Application) context;
            com.google.android.gms.internal.games_v2.zzbr zzbrVar = new com.google.android.gms.internal.games_v2.zzbr(application, com.google.android.gms.internal.games_v2.zzau.zza(application), com.google.android.gms.games.internal.zzg.zzb(application));
            while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zzbrVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            zzbrVar.zzc.zzc();
            zzbrVar.zzd.zzh();
        }
    }
}
