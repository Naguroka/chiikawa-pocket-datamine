package com.unity3d.services.core.sensorinfo;

/* JADX INFO: loaded from: classes6.dex */
public class SensorInfoListener implements android.hardware.SensorEventListener {
    private static com.unity3d.services.core.sensorinfo.SensorInfoListener _accelerometerListener;
    private static android.hardware.Sensor _accelerometerSensor;
    private static android.hardware.SensorEvent _latestAccelerometerEvent;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public static boolean startAccelerometerListener(int i) {
        if (_accelerometerListener == null) {
            _accelerometerListener = new com.unity3d.services.core.sensorinfo.SensorInfoListener();
        }
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("sensor");
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        _accelerometerSensor = defaultSensor;
        return sensorManager.registerListener(_accelerometerListener, defaultSensor, i);
    }

    public static void stopAccelerometerListener() {
        if (_accelerometerListener != null) {
            ((android.hardware.SensorManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("sensor")).unregisterListener(_accelerometerListener);
            _accelerometerListener = null;
        }
    }

    public static boolean isAccelerometerListenerActive() {
        return _accelerometerListener != null;
    }

    public static org.json.JSONObject getAccelerometerData() {
        if (_latestAccelerometerEvent == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", _latestAccelerometerEvent.values[0]);
            jSONObject.put("y", _latestAccelerometerEvent.values[1]);
            jSONObject.put("z", _latestAccelerometerEvent.values[2]);
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.exception("JSON error while constructing accelerometer data", e);
            return jSONObject;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            _latestAccelerometerEvent = sensorEvent;
        }
    }
}
