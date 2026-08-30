package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpq implements com.google.android.gms.measurement.internal.zzqe {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza;

    zzpq(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        this.zza = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.zza.zzaX().zzq(new com.google.android.gms.measurement.internal.zzpp(this, str, str2, bundle));
            return;
        }
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zza;
        if (zzpvVar.zzn != null) {
            zzpvVar.zzn.zzaW().zze().zzb("AppId not known when logging event", str2);
        }
    }
}
