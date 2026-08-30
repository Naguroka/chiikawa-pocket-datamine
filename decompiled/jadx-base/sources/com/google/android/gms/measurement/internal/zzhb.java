package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhb implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ java.lang.Object zzd;
    final /* synthetic */ java.lang.Object zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhe zzf;

    zzhb(com.google.android.gms.measurement.internal.zzhe zzheVar, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzhe zzheVar = this.zzf;
        com.google.android.gms.measurement.internal.zzht zzhtVarZzm = zzheVar.zzu.zzm();
        if (!zzhtVarZzm.zzy()) {
            android.util.Log.println(6, zzheVar.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzheVar.zza == 0) {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzheVar.zzu;
            if (zzioVar.zzf().zzD()) {
                zzioVar.zzaV();
                zzheVar.zza = 'C';
            } else {
                zzioVar.zzaV();
                zzheVar.zza = 'c';
            }
        }
        if (zzheVar.zzb < 0) {
            zzheVar.zzu.zzf().zzj();
            zzheVar.zzb = 119002L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        char c = zzheVar.zza;
        long j = zzheVar.zzb;
        java.lang.String str = this.zzb;
        java.lang.String strSubstring = "2" + cCharAt + c + j + ":" + com.google.android.gms.measurement.internal.zzhe.zzo(true, str, this.zzc, this.zzd, this.zze);
        if (strSubstring.length() > 1024) {
            strSubstring = str.substring(0, 1024);
        }
        com.google.android.gms.measurement.internal.zzhq zzhqVar = zzhtVarZzm.zzb;
        if (zzhqVar != null) {
            zzhqVar.zzb(strSubstring, 1L);
        }
    }
}
