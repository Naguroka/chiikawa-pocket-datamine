package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbsd implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsf zzc;

    zzbsd(com.google.android.gms.internal.ads.zzbsf zzbsfVar, java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbsfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        android.app.DownloadManager downloadManager = (android.app.DownloadManager) this.zzc.zzb.getSystemService("download");
        try {
            java.lang.String str = this.zza;
            java.lang.String str2 = this.zzb;
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(str));
            request.setDestinationInExternalPublicDir(android.os.Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzv.zzq();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (java.lang.IllegalStateException unused) {
            this.zzc.zzh("Could not store picture.");
        }
    }
}
