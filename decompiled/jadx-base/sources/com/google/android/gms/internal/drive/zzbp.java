package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbp implements com.google.android.gms.drive.DriveFile.DownloadProgressListener {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.DriveFile.DownloadProgressListener> zzfa;

    public zzbp(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.drive.DriveFile.DownloadProgressListener> listenerHolder) {
        this.zzfa = listenerHolder;
    }

    @Override // com.google.android.gms.drive.DriveFile.DownloadProgressListener
    public final void onProgress(long j, long j2) {
        this.zzfa.notifyListener(new com.google.android.gms.internal.drive.zzbq(this, j, j2));
    }
}
