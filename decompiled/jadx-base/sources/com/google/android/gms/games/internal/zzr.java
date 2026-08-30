package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzr extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzr(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzb(int i, java.lang.String str) {
        if (i == 0 || i == 3003) {
            this.zza.setResult(null);
        } else {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, i);
        }
    }
}
