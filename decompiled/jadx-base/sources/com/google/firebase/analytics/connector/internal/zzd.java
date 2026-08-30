package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzd implements com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener {
    final /* synthetic */ com.google.firebase.analytics.connector.internal.zze zza;

    public zzd(com.google.firebase.analytics.connector.internal.zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        com.google.firebase.analytics.connector.internal.zze zzeVar = this.zza;
        if (zzeVar.zza.contains(str2)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            int i = com.google.firebase.analytics.connector.internal.zzc.zza;
            java.lang.String strZza = com.google.android.gms.measurement.internal.zzjy.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            zzeVar.zzb.onMessageTriggered(2, bundle2);
        }
    }
}
