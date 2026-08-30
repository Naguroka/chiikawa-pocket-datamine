package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzw extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.internal.games_v2.zzs {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.internal.games_v2.zzu zzuVar = new com.google.android.gms.internal.games_v2.zzu();
        zzb = zzuVar;
        zzc = new com.google.android.gms.common.api.Api("GamesConnect.API", zzuVar, clientKey);
    }

    zzw(android.content.Context context, com.google.android.gms.internal.games_v2.zzq zzqVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.internal.games_v2.zzq>) zzc, zzqVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.internal.games_v2.zzs
    public final com.google.android.gms.tasks.Task zza(final com.google.android.gms.internal.games_v2.zzy zzyVar, boolean z) {
        com.google.android.gms.common.api.internal.TaskApiCall taskApiCallBuild = com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                com.google.android.gms.internal.games_v2.zzw zzwVar = this.zza;
                ((com.google.android.gms.internal.games_v2.zzae) ((com.google.android.gms.internal.games_v2.zzx) obj).getService()).zzd(new com.google.android.gms.internal.games_v2.zzv(zzwVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), zzyVar);
            }
        }).setMethodKey(6737).setAutoResolveMissingFeatures(z).build();
        return z ? doWrite(taskApiCallBuild) : doBestEffortWrite(taskApiCallBuild);
    }
}
