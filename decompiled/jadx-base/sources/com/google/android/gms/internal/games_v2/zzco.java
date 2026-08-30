package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzco implements com.google.android.gms.games.GamesSignInClient {
    private final com.google.android.gms.internal.games_v2.zzav zza;
    private final com.google.android.gms.internal.games_v2.zzar zzb;

    public zzco(com.google.android.gms.internal.games_v2.zzav zzavVar, com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzavVar;
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> isAuthenticated() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<java.lang.String> requestServerSideAccess(final java.lang.String str, final boolean z) {
        return this.zzb.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcn
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final boolean z2 = z;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcm
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzM((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, z2);
                    }
                }).setMethodKey(6699).build());
            }
        });
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> signIn() {
        return this.zza.zzb();
    }
}
