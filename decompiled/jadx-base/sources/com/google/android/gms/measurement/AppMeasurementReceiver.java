package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements com.google.android.gms.measurement.internal.zzhx.zza {
    private com.google.android.gms.measurement.internal.zzhx zza;

    public android.content.BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx.zza
    public void doStartService(android.content.Context context, android.content.Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzhx(this);
        }
        this.zza.zza(context, intent);
    }
}
