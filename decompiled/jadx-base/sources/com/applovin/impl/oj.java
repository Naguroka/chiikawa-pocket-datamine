package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class oj implements android.hardware.SensorEventListener, com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1126a;
    private final float b;
    private final android.hardware.SensorManager c;
    private final android.hardware.Sensor d;
    private final android.hardware.Sensor f;
    private final com.applovin.impl.sdk.j g;
    private float[] h;
    private float i;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public oj(com.applovin.impl.sdk.j jVar) {
        this.g = jVar;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.applovin.impl.sdk.j.m().getSystemService("sensor");
        this.c = sensorManager;
        this.d = sensorManager.getDefaultSensor(9);
        this.f = sensorManager.getDefaultSensor(4);
        this.f1126a = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.h4)).intValue();
        this.b = ((java.lang.Float) jVar.a(com.applovin.impl.sj.g4)).floatValue();
    }

    public void c() {
        if (java.lang.Boolean.parseBoolean(this.g.f0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.c.unregisterListener(this);
        if (((java.lang.Boolean) this.g.g0().a(com.applovin.impl.sj.d4)).booleanValue()) {
            a(this.d);
        }
        if (((java.lang.Boolean) this.g.g0().a(com.applovin.impl.sj.e4)).booleanValue()) {
            a(this.f);
        }
        com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public float b() {
        return this.i;
    }

    public float a() {
        float[] fArr = this.h;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) java.lang.Math.toDegrees(java.lang.Math.acos(fArr[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.h = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.i * this.b;
            this.i = f;
            this.i = f + java.lang.Math.abs(sensorEvent.values[0]) + java.lang.Math.abs(sensorEvent.values[1]) + java.lang.Math.abs(sensorEvent.values[2]);
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.c.unregisterListener(this);
        } else if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void a(android.hardware.Sensor sensor) {
        try {
            this.c.registerListener(this, sensor, (int) java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(this.f1126a));
        } catch (java.lang.Throwable th) {
            this.g.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.g.I().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }
}
