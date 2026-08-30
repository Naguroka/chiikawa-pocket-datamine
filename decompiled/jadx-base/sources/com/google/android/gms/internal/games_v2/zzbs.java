package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbs implements com.google.android.gms.internal.games_v2.zzaq {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzbs(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.games_v2.zzaq
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        final java.lang.String str = this.zza;
        final int i = this.zzb;
        return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzby
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.games.internal.zzak) obj).zzw((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, i);
            }
        }).setMethodKey(6696).build());
    }
}
