package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcl implements com.google.android.gms.games.EventsClient {
    private final com.google.android.gms.internal.games_v2.zzar zza;

    public zzcl(com.google.android.gms.internal.games_v2.zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(final java.lang.String str, final int i) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzci
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final java.lang.String str2 = str;
                final int i2 = i;
                return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcf
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzx(str2, i2);
                    }
                }).setMethodKey(6729).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> load(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcj
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcg
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzA((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6727).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> loadByIds(final boolean z, final java.lang.String... strArr) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzaq() { // from class: com.google.android.gms.internal.games_v2.zzck
            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                final boolean z2 = z;
                final java.lang.String[] strArr2 = strArr;
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzch
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                        ((com.google.android.gms.games.internal.zzak) obj).zzB((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2, strArr2);
                    }
                }).setMethodKey(6728).build());
            }
        });
    }
}
