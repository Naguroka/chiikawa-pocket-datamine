package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzawb implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzawd zzb;

    zzawb(com.google.android.gms.internal.ads.zzawd zzawdVar, int i, boolean z) {
        this.zza = i;
        this.zzb = zzawdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzasy zzasyVarZza;
        int i = this.zza;
        com.google.android.gms.internal.ads.zzawd zzawdVar = this.zzb;
        if (i > 0) {
            try {
                java.lang.Thread.sleep(i * 1000);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        try {
            android.content.pm.PackageInfo packageInfo = zzawdVar.zza.getPackageManager().getPackageInfo(zzawdVar.zza.getPackageName(), 0);
            android.content.Context context = zzawdVar.zza;
            zzasyVarZza = com.google.android.gms.internal.ads.zzfnq.zza(context, context.getPackageName(), java.lang.Integer.toString(packageInfo.versionCode));
        } catch (java.lang.Throwable unused2) {
            zzasyVarZza = null;
        }
        this.zzb.zzm = zzasyVarZza;
        if (this.zza < 4) {
            if (zzasyVarZza != null && zzasyVarZza.zzaj() && !zzasyVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzasyVarZza.zzak() && zzasyVarZza.zzf().zzg() && zzasyVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
