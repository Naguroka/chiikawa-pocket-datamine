package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final com.google.android.gms.internal.games_v2.zzat zzb;
    private final com.google.android.gms.internal.games_v2.zzav zzc;

    zzau(android.app.Application application, com.google.android.gms.internal.games_v2.zzav zzavVar) {
        this.zzb = new com.google.android.gms.internal.games_v2.zzat(this, application, null);
        this.zzc = zzavVar;
    }

    static com.google.android.gms.internal.games_v2.zzau zza(android.app.Application application) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        com.google.android.gms.internal.games_v2.zzau zzauVar = (com.google.android.gms.internal.games_v2.zzau) atomicReference.get();
        if (zzauVar != null) {
            return zzauVar;
        }
        com.google.android.gms.internal.games_v2.zzau zzauVar2 = new com.google.android.gms.internal.games_v2.zzau(application, com.google.android.gms.internal.games_v2.zzax.zza(application));
        while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zzauVar2) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.internal.games_v2.zzau) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.internal.games_v2.zzau) zza.get());
    }

    public final void zzc() {
        com.google.android.gms.internal.games_v2.zzez.zza("AutomaticGamesAuthenticator", "startWatching()");
        com.google.android.gms.internal.games_v2.zzat.zza(this.zzb);
    }
}
