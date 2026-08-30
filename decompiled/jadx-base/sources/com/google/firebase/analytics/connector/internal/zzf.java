package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzf implements com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener {
    final /* synthetic */ com.google.firebase.analytics.connector.internal.zzg zza;

    public zzf(com.google.firebase.analytics.connector.internal.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        if (str == null || !com.google.firebase.analytics.connector.internal.zzc.zzc(str2)) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.zza.zza.onMessageTriggered(3, bundle2);
    }
}
