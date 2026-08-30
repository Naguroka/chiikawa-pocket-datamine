package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzce implements com.google.android.gms.games.AchievementsClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzce(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getAchievementsIntent() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzbv
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcb
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                        try {
                            taskCompletionSource.setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzg());
                        } catch (java.lang.SecurityException e) {
                            com.google.android.gms.games.GamesStatusUtils.zzb(taskCompletionSource, e);
                        }
                    }
                }).setMethodKey(6692).build());
            }
        });
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void increment(java.lang.String str, int i) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzbs(str, i));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> incrementImmediate(java.lang.String str, int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzbs(str, i));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.achievement.AchievementBuffer>> load(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzbu
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzca
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzy((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6693).build());
            }
        });
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void reveal(java.lang.String str) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcc(str));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> revealImmediate(java.lang.String str) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcc(str));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void setSteps(java.lang.String str, int i) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzbt(str, i));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> setStepsImmediate(java.lang.String str, int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzbt(str, i));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void unlock(java.lang.String str) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcd(str));
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> unlockImmediate(java.lang.String str) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcd(str));
    }
}
