package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzae extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzak zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzae(com.google.android.gms.games.internal.zzak zzakVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = zzakVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zze(com.google.android.gms.common.data.DataHolder dataHolder) {
        zzj(dataHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzj(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 10003) {
            com.google.android.gms.games.internal.zzak.zzq(this.zza, this.zzb);
            dataHolder.close();
            return;
        }
        boolean z = statusCode == 3;
        if (statusCode == 0 || z) {
            this.zzb.setResult(new com.google.android.gms.games.AnnotatedData(new com.google.android.gms.games.PlayerBuffer(dataHolder), z));
        } else {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zzb, statusCode);
            dataHolder.close();
        }
    }
}
