package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class r6 implements android.hardware.SensorEventListener, com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1221a;
    private final android.hardware.SensorManager b;
    private final android.hardware.Sensor c;
    private final com.applovin.impl.r6.a d;
    private float f;

    public interface a {
        void a();

        void b();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public r6(com.applovin.impl.sdk.j jVar, com.applovin.impl.r6.a aVar) {
        this.f1221a = jVar;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.applovin.impl.sdk.j.m().getSystemService("sensor");
        this.b = sensorManager;
        this.c = sensorManager.getDefaultSensor(1);
        this.d = aVar;
    }

    public void a() {
        if (java.lang.Boolean.parseBoolean(this.f1221a.f0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.b.unregisterListener(this);
        this.b.registerListener(this, this.c, (int) java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(50L));
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
        this.b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = java.lang.Math.max(java.lang.Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f;
            float f2 = (f * 0.5f) + (fMax * 0.5f);
            this.f = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.d.a();
            } else {
                if (f <= -0.8f || f2 >= -0.8f) {
                    return;
                }
                this.d.b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.b.unregisterListener(this);
        } else if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }
}
