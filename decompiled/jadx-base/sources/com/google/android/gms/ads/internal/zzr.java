package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzr extends android.os.AsyncTask {
    final /* synthetic */ com.google.android.gms.ads.internal.zzu zza;

    /* synthetic */ zzr(com.google.android.gms.ads.internal.zzu zzuVar, com.google.android.gms.ads.internal.zzt zztVar) {
        this.zza = zzuVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
        java.lang.String str = (java.lang.String) obj;
        if (zzuVar.zzf == null || str == null) {
            return;
        }
        zzuVar.zzf.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final java.lang.String doInBackground(java.lang.Void... voidArr) {
        try {
            com.google.android.gms.ads.internal.zzu zzuVar = this.zza;
            zzuVar.zzh = (com.google.android.gms.internal.ads.zzava) zzuVar.zzc.get(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (java.util.concurrent.TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
