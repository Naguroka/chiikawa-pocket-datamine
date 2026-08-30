package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfqz implements android.hardware.SensorEventListener {
    protected zzfqz(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfqy.zza();
        com.google.android.gms.internal.ads.zzfqx.zza();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(android.hardware.SensorEvent sensorEvent);
}
