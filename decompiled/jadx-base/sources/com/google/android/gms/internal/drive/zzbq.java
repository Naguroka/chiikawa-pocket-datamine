package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbq implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.drive.DriveFile.DownloadProgressListener> {
    private final /* synthetic */ long zzfb;
    private final /* synthetic */ long zzfc;

    zzbq(com.google.android.gms.internal.drive.zzbp zzbpVar, long j, long j2) {
        this.zzfb = j;
        this.zzfc = j2;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadProgressListener) {
        downloadProgressListener.onProgress(this.zzfb, this.zzfc);
    }
}
