package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfmw extends android.os.AsyncTask {
    private com.google.android.gms.internal.ads.zzfmx zza;
    protected final com.google.android.gms.internal.ads.zzfmo zzd;

    public zzfmw(com.google.android.gms.internal.ads.zzfmo zzfmoVar) {
        this.zzd = zzfmoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfmx zzfmxVar = this.zza;
        if (zzfmxVar != null) {
            zzfmxVar.zza(this);
        }
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfmx zzfmxVar) {
        this.zza = zzfmxVar;
    }
}
