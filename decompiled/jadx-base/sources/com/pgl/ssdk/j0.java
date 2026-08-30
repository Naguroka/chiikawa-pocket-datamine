package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements android.hardware.SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.pgl.ssdk.j0 f3795a;
    private android.hardware.SensorManager b;
    private int c;
    private int d = 0;
    private float[] e = new float[3];
    private java.util.List<java.lang.String> f = new java.util.ArrayList();

    private j0(android.content.Context context) {
        this.b = null;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.b = (android.hardware.SensorManager) applicationContext.getSystemService("sensor");
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static com.pgl.ssdk.j0 a(android.content.Context context) {
        if (f3795a == null) {
            synchronized (com.pgl.ssdk.j0.class) {
                if (f3795a == null) {
                    f3795a = new com.pgl.ssdk.j0(context);
                }
            }
        }
        return f3795a;
    }

    private synchronized void d() {
        try {
            android.hardware.SensorManager sensorManager = this.b;
            if (sensorManager != null) {
                if (this.c == 0) {
                    if (!this.b.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                        return;
                    }
                }
                this.c++;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private synchronized void e() {
        try {
            android.hardware.SensorManager sensorManager = this.b;
            if (sensorManager != null) {
                int i = this.c - 1;
                this.c = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public synchronized java.lang.String b() {
        java.lang.String strSubstring = "";
        int size = this.f.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f.get(0);
        }
        try {
            java.util.List<java.lang.String> list = this.f;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            java.util.List<java.lang.String> listSubList = list.subList(i, size);
            for (int i2 = 0; i2 < listSubList.size(); i2++) {
                strSubstring = strSubstring + listSubList.get(i2) + "|";
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        } catch (java.lang.Throwable unused) {
        }
        return strSubstring;
    }

    public java.lang.String c() {
        java.lang.String str;
        try {
            try {
                d();
                synchronized (this) {
                    int i = 0;
                    while (this.d == 0 && i < 10) {
                        i++;
                        wait(100L);
                    }
                }
                java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME);
                str = decimalFormat.format(this.e[0]) + "," + decimalFormat.format(this.e[1]) + "," + decimalFormat.format(this.e[2]);
            } catch (java.lang.Throwable unused) {
                java.text.DecimalFormat decimalFormat2 = new java.text.DecimalFormat(com.google.firebase.crashlytics.internal.common.IdManager.DEFAULT_VERSION_NAME);
                str = decimalFormat2.format(this.e[0]) + "," + decimalFormat2.format(this.e[1]) + "," + decimalFormat2.format(this.e[2]);
            }
        } catch (java.lang.Throwable unused2) {
            str = null;
        }
        e();
        this.d = 0;
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        this.e = sensorEvent.values;
        this.d = 1;
    }

    public void a() {
        java.lang.String strC = c();
        if (strC == null) {
            return;
        }
        this.f.add(strC);
        try {
            int size = this.f.size();
            if (size > 20) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f.subList(size - 10, size));
                this.f.clear();
                this.f = arrayList;
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
