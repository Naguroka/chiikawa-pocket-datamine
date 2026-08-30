package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdk extends com.google.android.gms.internal.drive.zzl {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzch zzfw;
    private final com.google.android.gms.drive.events.ListenerToken zzgj;
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.events.OpenFileCallback> zzgk;

    zzdk(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.events.ListenerToken listenerToken, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.events.OpenFileCallback> listenerHolder) {
        this.zzfw = zzchVar;
        this.zzgj = listenerToken;
        this.zzgk = listenerHolder;
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        zza(new com.google.android.gms.internal.drive.zzdg(this, status) { // from class: com.google.android.gms.internal.drive.zzdl
            private final com.google.android.gms.internal.drive.zzdk zzgl;
            private final com.google.android.gms.common.api.Status zzgm;

            {
                this.zzgl = this;
                this.zzgm = status;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(java.lang.Object obj) {
                this.zzgl.zza(this.zzgm, (com.google.android.gms.drive.events.OpenFileCallback) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final com.google.android.gms.internal.drive.zzfl zzflVar) throws android.os.RemoteException {
        zza(new com.google.android.gms.internal.drive.zzdg(zzflVar) { // from class: com.google.android.gms.internal.drive.zzdm
            private final com.google.android.gms.internal.drive.zzfl zzgn;

            {
                this.zzgn = zzflVar;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(java.lang.Object obj) {
                com.google.android.gms.internal.drive.zzfl zzflVar2 = this.zzgn;
                ((com.google.android.gms.drive.events.OpenFileCallback) obj).onProgress(zzflVar2.zzhy, zzflVar2.zzhz);
            }
        });
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(final com.google.android.gms.internal.drive.zzfh zzfhVar) throws android.os.RemoteException {
        zza(new com.google.android.gms.internal.drive.zzdg(this, zzfhVar) { // from class: com.google.android.gms.internal.drive.zzdn
            private final com.google.android.gms.internal.drive.zzdk zzgl;
            private final com.google.android.gms.internal.drive.zzfh zzgo;

            {
                this.zzgl = this;
                this.zzgo = zzfhVar;
            }

            @Override // com.google.android.gms.internal.drive.zzdg
            public final void accept(java.lang.Object obj) {
                this.zzgl.zza(this.zzgo, (com.google.android.gms.drive.events.OpenFileCallback) obj);
            }
        });
    }

    private final void zza(com.google.android.gms.internal.drive.zzdg<com.google.android.gms.drive.events.OpenFileCallback> zzdgVar) {
        this.zzgk.notifyListener(new com.google.android.gms.internal.drive.zzdo(this, zzdgVar));
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.drive.zzfh zzfhVar, com.google.android.gms.drive.events.OpenFileCallback openFileCallback) {
        openFileCallback.onContents(new com.google.android.gms.internal.drive.zzbi(zzfhVar.zzes));
        this.zzfw.cancelOpenFileCallback(this.zzgj);
    }

    final /* synthetic */ void zza(com.google.android.gms.common.api.Status status, com.google.android.gms.drive.events.OpenFileCallback openFileCallback) {
        openFileCallback.onError(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        this.zzfw.cancelOpenFileCallback(this.zzgj);
    }
}
