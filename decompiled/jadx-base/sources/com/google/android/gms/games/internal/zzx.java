package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzx extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzx(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzl(com.google.android.gms.common.api.Status status, java.lang.String str) {
        if (status.isSuccess()) {
            this.zza.setResult(str);
            return;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        int i = com.google.android.gms.games.internal.zzak.zze;
        taskCompletionSource.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
    }
}
