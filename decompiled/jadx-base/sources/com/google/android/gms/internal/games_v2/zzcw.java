package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcw implements com.google.android.gms.internal.games_v2.zzaq {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ java.lang.String zzc;

    public /* synthetic */ zzcw(java.lang.String str, long j, java.lang.String str2) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.games_v2.zzaq
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        final java.lang.String str = this.zza;
        final long j = this.zzb;
        final java.lang.String str2 = this.zzc;
        return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.games.internal.zzak) obj).zzR((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, j, str2);
            }
        }).setMethodKey(6707).build());
    }
}
