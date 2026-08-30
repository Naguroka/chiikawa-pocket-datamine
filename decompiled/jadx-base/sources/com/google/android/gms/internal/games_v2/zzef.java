package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzef implements com.google.android.gms.games.PlayersClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzef(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    private final com.google.android.gms.tasks.Task zza(final java.lang.String str, final int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdo
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final int i2 = i;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdw
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzI((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, i2, true, false);
                    }
                }).setMethodKey(6716).build());
            }
        });
    }

    private final com.google.android.gms.tasks.Task zzb(final java.lang.String str, final int i, final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdp
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final int i2 = i;
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdx
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzI((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, i2, false, z2);
                    }
                }).setMethodKey(6715).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(final com.google.android.gms.games.Player player) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzee
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final com.google.android.gms.games.Player player2 = player;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdn
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        com.google.android.gms.games.PlayerEntity playerEntity = new com.google.android.gms.games.PlayerEntity(player2);
                        android.content.Intent intentZzi = ((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzi(playerEntity);
                        intentZzi.setExtrasClassLoader(playerEntity.getClass().getClassLoader());
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(intentZzi);
                    }
                }).setMethodKey(6713).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntentWithAlternativeNameHints(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzdq(str, str2, str3));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.Player> getCurrentPlayer() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdt
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzeb
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzak) obj).zzp());
                    }
                }).setMethodKey(6710).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getCurrentPlayerId() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdu
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzec
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzo());
                    }
                }).setMethodKey(6709).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getPlayerSearchIntent() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdv
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzed
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzl());
                    }
                }).setMethodKey(6714).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadFriends(int i, boolean z) {
        return zzb("friends_all", i, z);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreFriends(int i) {
        return zza("friends_all", i);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int i) {
        return zza("played_with", i);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String str) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzdr(str, false));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.PlayerBuffer>> loadRecentlyPlayedWithPlayers(int i, boolean z) {
        return zzb("played_with", i, z);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getCompareProfileIntent(java.lang.String str) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzdq(str, null, null));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> getCurrentPlayer(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzds
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzea
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzv((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6710).build());
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Player>> loadPlayer(java.lang.String str, boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzdr(str, z));
    }
}
