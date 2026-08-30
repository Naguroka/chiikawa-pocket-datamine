package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzak {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    protected abstract com.google.android.gms.internal.games_v2.zzaj zza();

    public final void zzb() {
        com.google.android.gms.internal.games_v2.zzaj zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
        if (zzajVar != null) {
            zzajVar.zzd();
        }
    }

    public final void zzc(java.lang.String str, int i) {
        com.google.android.gms.internal.games_v2.zzaj zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
        if (zzajVar == null) {
            com.google.android.gms.internal.games_v2.zzaj zzajVarZza = zza();
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
            while (!kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReference, null, zzajVarZza)) {
                if (atomicReference.get() != null) {
                    zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
                }
            }
            zzajVar = zzajVarZza;
        }
        zzajVar.zzc(str, i);
    }
}
