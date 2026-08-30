package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzg implements com.google.firebase.analytics.connector.internal.zza {
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzb;
    private final com.google.firebase.analytics.connector.internal.zzf zzc;

    public zzg(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = appMeasurementSdk;
        com.google.firebase.analytics.connector.internal.zzf zzfVar = new com.google.firebase.analytics.connector.internal.zzf(this);
        this.zzc = zzfVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(java.util.Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }
}
