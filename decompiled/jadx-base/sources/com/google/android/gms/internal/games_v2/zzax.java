package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    public static com.google.android.gms.internal.games_v2.zzav zza(android.app.Application application) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        com.google.android.gms.internal.games_v2.zzav zzavVar = (com.google.android.gms.internal.games_v2.zzav) atomicReference.get();
        if (zzavVar != null) {
            return zzavVar;
        }
        com.google.android.gms.internal.games_v2.zzo zzoVarZza = com.google.android.gms.internal.games_v2.zzq.zza();
        zzoVarZza.zza(9);
        zzoVarZza.zzb(application.getPackageName());
        com.google.android.gms.internal.games_v2.zzq zzqVarZzc = zzoVarZza.zzc();
        com.google.android.gms.games.internal.zzg zzgVarZzb = com.google.android.gms.games.internal.zzg.zzb(application);
        com.google.android.gms.internal.games_v2.zzbl zzblVar = new com.google.android.gms.internal.games_v2.zzbl(application, zzgVarZzb, com.google.android.gms.games.internal.v2.resolution.zzb.zza(), new com.google.android.gms.internal.games_v2.zzbp(application, zzgVarZzb, new com.google.android.gms.internal.games_v2.zzaw(application, zzqVarZzc), null), null);
        while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zzblVar) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.internal.games_v2.zzav) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.internal.games_v2.zzav) zza.get());
    }
}
