package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8L implements android.hardware.SensorEventListener {
    public C8L() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] unused = com.facebook.ads.redexgen.core.C8N.A0A = sensorEvent.values;
        com.facebook.ads.redexgen.core.C8N.A06();
    }
}
