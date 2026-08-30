package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdj implements com.google.android.gms.games.LeaderboardsClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzdj(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getAllLeaderboardsIntent() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcz
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdi
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzh());
                    }
                }).setMethodKey(6700).build());
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String str) {
        return getLeaderboardIntent(str, -1, -1);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardScore>> loadCurrentPlayerLeaderboardScore(final java.lang.String str, final int i, final int i2) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcs
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdb
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzz((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, i3, i4);
                    }
                }).setMethodKey(6703).build());
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.Leaderboard>> loadLeaderboardMetadata(final java.lang.String str, final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcx
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdg
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzC((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, z2);
                    }
                }).setMethodKey(6702).build());
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadMoreScores(final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer, final int i, final int i2) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcq
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer2 = leaderboardScoreBuffer;
                final int i3 = i;
                final int i4 = i2;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcp
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzE((com.google.android.gms.tasks.TaskCompletionSource) obj2, leaderboardScoreBuffer2, i3, i4);
                    }
                }).setMethodKey(6706).build());
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String str, int i, int i2, int i3) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzct(str, i, i2, i3, false));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String str, int i, int i2, int i3) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcu(str, i, i2, i3, false));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(java.lang.String str, long j) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcv(str, j));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String str, long j) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcv(str, j));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String str, int i) {
        return getLeaderboardIntent(str, i, -1);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardBuffer>> loadLeaderboardMetadata(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcy
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdh
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzD((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6702).build());
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String str, int i, int i2, int i3, boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzct(str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String str, int i, int i2, int i3, boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcu(str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(java.lang.String str, long j, java.lang.String str2) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcw(str, j, str2));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String str, long j, java.lang.String str2) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzcw(str, j, str2));
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(final java.lang.String str, final int i, final int i2) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcr
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzda
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzk(str2, i3, i4));
                    }
                }).setMethodKey(6701).build());
            }
        });
    }
}
