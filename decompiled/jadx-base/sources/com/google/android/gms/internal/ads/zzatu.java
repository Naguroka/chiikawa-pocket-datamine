package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatu implements android.content.pm.PackageManager.OnChecksumsReadyListener {
    final com.google.android.gms.internal.ads.zzgdb zza = com.google.android.gms.internal.ads.zzgdb.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(java.util.List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.content.pm.ApkChecksum apkChecksum = (android.content.pm.ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    com.google.android.gms.internal.ads.zzgdb zzgdbVar = this.zza;
                    com.google.android.gms.internal.ads.zzgaa zzgaaVarZzf = com.google.android.gms.internal.ads.zzgaa.zzi().zzf();
                    byte[] value = apkChecksum.getValue();
                    zzgdbVar.zzc(zzgaaVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        this.zza.zzc("");
    }
}
