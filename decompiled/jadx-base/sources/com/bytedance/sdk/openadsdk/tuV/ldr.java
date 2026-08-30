package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.Kg> IL;
    private android.content.Context bg;
    private java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.tuV.ldr.bg> bX = new java.util.HashMap();
    private android.hardware.SensorEventListener eqN = new android.hardware.SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            com.bytedance.sdk.openadsdk.tuV.Kg kgEqN;
            if (sensorEvent.sensor.getType() != 1 || (kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                kgEqN.bg("accelerometer_callback", jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
    };
    private android.hardware.SensorEventListener zx = new android.hardware.SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            com.bytedance.sdk.openadsdk.tuV.Kg kgEqN;
            if (sensorEvent.sensor.getType() != 4 || (kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN()) == null) {
                return;
            }
            float degrees = (float) java.lang.Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) java.lang.Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) java.lang.Math.toDegrees(sensorEvent.values[2]);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                kgEqN.bg("gyro_callback", jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
    };
    private android.hardware.SensorEventListener ldr = new android.hardware.SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            com.bytedance.sdk.openadsdk.tuV.Kg kgEqN;
            if (sensorEvent.sensor.getType() != 10 || (kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                kgEqN.bg("accelerometer_grativityless_callback", jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
    };
    private android.hardware.SensorEventListener iR = new android.hardware.SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                java.lang.System.arraycopy(sensorEvent.values, 0, com.bytedance.sdk.openadsdk.tuV.eo.IL, 0, com.bytedance.sdk.openadsdk.tuV.eo.IL.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                java.lang.System.arraycopy(sensorEvent.values, 0, com.bytedance.sdk.openadsdk.tuV.eo.bX, 0, com.bytedance.sdk.openadsdk.tuV.eo.bX.length);
            }
            android.hardware.SensorManager.getRotationMatrix(com.bytedance.sdk.openadsdk.tuV.eo.eqN, null, com.bytedance.sdk.openadsdk.tuV.eo.IL, com.bytedance.sdk.openadsdk.tuV.eo.bX);
            android.hardware.SensorManager.getOrientation(com.bytedance.sdk.openadsdk.tuV.eo.eqN, com.bytedance.sdk.openadsdk.tuV.eo.zx);
            com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
            if (kgEqN == null) {
                return;
            }
            float f = com.bytedance.sdk.openadsdk.tuV.eo.zx[0];
            float f2 = com.bytedance.sdk.openadsdk.tuV.eo.zx[1];
            float f3 = com.bytedance.sdk.openadsdk.tuV.eo.zx[2];
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                kgEqN.bg("rotation_vector_callback", jSONObject);
            } catch (java.lang.Throwable unused) {
            }
        }
    };

    interface bg {
        org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable;
    }

    public ldr(com.bytedance.sdk.openadsdk.tuV.Kg kg) {
        this.bg = kg.bg();
        this.IL = new java.lang.ref.WeakReference<>(kg);
        bX();
    }

    public java.util.Set<java.lang.String> bg() {
        return this.bX.keySet();
    }

    private void bX() {
        this.bX.put("adInfo", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.45
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                if (kgEqN != null) {
                    org.json.JSONObject jSONObjectTuV = kgEqN.tuV();
                    if (jSONObjectTuV != null) {
                        jSONObjectTuV.put("code", 1);
                        return jSONObjectTuV;
                    }
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.bX.put("appInfo", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.56
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it = com.bytedance.sdk.openadsdk.tuV.ldr.this.bg().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                if (kgEqN != null) {
                    jSONObject2.put("deviceId", kgEqN.iR());
                    jSONObject2.put("netType", kgEqN.vb());
                    jSONObject2.put("innerAppName", kgEqN.eqN());
                    jSONObject2.put("appName", kgEqN.zx());
                    jSONObject2.put(com.ironsource.y8.i.W, kgEqN.ldr());
                    java.util.Map<java.lang.String, java.lang.String> mapIL = kgEqN.IL();
                    for (java.lang.String str : mapIL.keySet()) {
                        jSONObject2.put(str, mapIL.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.bX.put("playableSDKInfo", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.61
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(com.json.ce.y, "android");
                return jSONObject2;
            }
        });
        this.bX.put("subscribe_app_ad", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.62
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("download_app_ad", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.63
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put(com.ironsource.y8.h.o, new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.2
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                if (kgEqN == null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", kgEqN.WR());
                return jSONObject3;
            }
        });
        this.bX.put("getVolume", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.3
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                if (kgEqN == null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", kgEqN.Kg());
                return jSONObject3;
            }
        });
        this.bX.put("getScreenSize", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.4
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                if (kgEqN == null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectVzQ = kgEqN.VzQ();
                jSONObjectVzQ.put("code", 1);
                return jSONObjectVzQ;
            }
        });
        this.bX.put("start_accelerometer_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.5
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("close_accelerometer_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.6
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("start_gyro_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.7
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                com.bytedance.sdk.openadsdk.tuV.eo.IL(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.zx, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("close_gyro_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.8
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.zx);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("start_accelerometer_grativityless_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.9
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                com.bytedance.sdk.openadsdk.tuV.eo.bX(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.ldr, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("close_accelerometer_grativityless_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.10
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.ldr);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("start_rotation_vector_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.11
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                com.bytedance.sdk.openadsdk.tuV.eo.eqN(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.iR, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("close_rotation_vector_observer", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.13
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, com.bytedance.sdk.openadsdk.tuV.ldr.this.iR);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("device_shake", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.14
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("device_shake_short", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.15
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.tuV.eo.bg(com.bytedance.sdk.openadsdk.tuV.ldr.this.bg, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.bX.put("playable_style", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.16
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN != null) {
                    org.json.JSONObject jSONObjectBX = kgEqN.bX();
                    jSONObjectBX.put("code", 1);
                    return jSONObjectBX;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.bX.put("sendReward", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.17
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN != null) {
                    kgEqN.LZ();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.bX.put("webview_time_track", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.18
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                return new org.json.JSONObject();
            }
        });
        this.bX.put("playable_event", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.19
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.IL(jSONObject.optString(androidx.core.app.NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("reportAd", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.20
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("close", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.21
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("openAdLandPageLinks", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.22
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("get_viewport", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.24
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectFy = kgEqN.Fy();
                jSONObjectFy.put("code", 1);
                return jSONObjectFy;
            }
        });
        this.bX.put("jssdk_load_finish", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.25
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.aGH();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_material_render_result", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.26
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.WR(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("detect_change_playable_click", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.27
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectEo = kgEqN.eo();
                jSONObjectEo.put("code", 1);
                return jSONObjectEo;
            }
        });
        this.bX.put("check_camera_permission", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.28
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectTa = kgEqN.Ta();
                jSONObjectTa.put("code", 1);
                return jSONObjectTa;
            }
        });
        this.bX.put("check_external_storage", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.29
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectYDt = kgEqN.yDt();
                if (jSONObjectYDt.isNull("result")) {
                    jSONObjectYDt.put("code", -1);
                } else {
                    jSONObjectYDt.put("code", 1);
                }
                return jSONObjectYDt;
            }
        });
        this.bX.put("playable_open_camera", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.30
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_pick_photo", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.31
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_download_media_in_photos", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.32
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.bg(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_preventTouchEvent", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.33
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.IL(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_settings_info", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.35
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectLq = kgEqN.Lq();
                jSONObjectLq.put("code", 1);
                return jSONObjectLq;
            }
        });
        this.bX.put("playable_load_main_scene", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.36
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.tC();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_enter_section", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.37
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.eqN(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_end", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.38
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.rri();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_finish_play_playable", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.39
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.kMt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_transfrom_module_show", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.40
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.JAA();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_transfrom_module_change_color", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.41
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.Ja();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_set_scroll_rect", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.42
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_click_area", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.43
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.zx(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_real_play_start", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.44
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_material_first_frame_show", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.46
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.Uw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_stuck_check_pong", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.47
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.DDQ();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_material_adnormal_mask", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.48
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                kgEqN.ldr(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_long_press_panel", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.49
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_alpha_player_play", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.50
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_transfrom_module_highlight", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.51
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_send_click_event", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.52
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_query_media_permission_declare", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.53
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectIR = kgEqN.iR(jSONObject);
                jSONObjectIR.put("code", 1);
                return jSONObjectIR;
            }
        });
        this.bX.put("playable_query_media_permission_enable", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.54
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = com.bytedance.sdk.openadsdk.tuV.ldr.this.eqN();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (kgEqN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                org.json.JSONObject jSONObjectKg = kgEqN.Kg(jSONObject);
                jSONObjectKg.put("code", 1);
                return jSONObjectKg;
            }
        });
        this.bX.put("playable_apply_media_permission", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.55
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_start_kws", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.57
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_close_kws", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.58
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_video_preload_task_add", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.59
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.bX.put("playable_video_preload_task_cancel", new com.bytedance.sdk.openadsdk.tuV.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.60
            @Override // com.bytedance.sdk.openadsdk.tuV.ldr.bg
            public org.json.JSONObject bg(org.json.JSONObject jSONObject) throws java.lang.Throwable {
                com.bytedance.sdk.openadsdk.tuV.bg bgVarZx = com.bytedance.sdk.openadsdk.tuV.ldr.this.zx();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (bgVarZx == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.tuV.Kg eqN() {
        java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.tuV.Kg> weakReference = this.IL;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.tuV.bg zx() {
        com.bytedance.sdk.openadsdk.tuV.Kg kgEqN = eqN();
        if (kgEqN == null) {
            return null;
        }
        return kgEqN.xxp();
    }

    public org.json.JSONObject bg(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.tuV.ldr.bg bgVar = this.bX.get(str);
            if (bgVar == null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return bgVar.bg(jSONObject);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
