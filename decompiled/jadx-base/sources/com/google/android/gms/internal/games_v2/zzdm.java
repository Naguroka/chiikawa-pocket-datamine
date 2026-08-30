package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdm implements com.google.android.gms.games.PlayerStatsClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzdm(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.PlayerStatsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.stats.PlayerStats>> loadPlayerStats(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdl
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdk
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzH((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6708).build());
            }
        });
    }
}
