package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzdq implements com.google.android.gms.internal.games_v2.zzaq {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ java.lang.String zzc;

    public /* synthetic */ zzdq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.games_v2.zzaq
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        final java.lang.String str = this.zza;
        final java.lang.String str2 = this.zzb;
        final java.lang.String str3 = this.zzc;
        return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzap) ((com.google.android.gms.games.internal.zzak) obj).getService()).zzj(str, str2, str3));
            }
        }).setMethodKey(6712).build());
    }
}
