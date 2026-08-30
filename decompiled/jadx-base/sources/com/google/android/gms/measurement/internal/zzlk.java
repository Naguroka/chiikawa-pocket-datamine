package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlk implements com.google.android.gms.measurement.internal.zzqe {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzlk(com.google.android.gms.measurement.internal.zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzqe
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.zza.zzO("auto", "_err", bundle);
        } else {
            this.zza.zzQ("auto", "_err", bundle, str);
        }
    }
}
