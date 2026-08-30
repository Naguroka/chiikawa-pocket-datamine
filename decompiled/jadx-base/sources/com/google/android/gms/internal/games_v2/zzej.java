package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzej implements com.google.android.gms.internal.games_v2.zzaq {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadataChange zzc;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotContents zzd;

    public /* synthetic */ zzej(java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = snapshotMetadataChange;
        this.zzd = snapshotContents;
    }

    @Override // com.google.android.gms.internal.games_v2.zzaq
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        final java.lang.String str = this.zza;
        final java.lang.String str2 = this.zzb;
        final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange = this.zzc;
        final com.google.android.gms.games.snapshot.SnapshotContents snapshotContents = this.zzd;
        return googleApi.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzer
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                ((com.google.android.gms.games.internal.zzak) obj).zzN((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, str2, snapshotMetadataChange, snapshotContents);
            }
        }).setMethodKey(6725).build());
    }
}
