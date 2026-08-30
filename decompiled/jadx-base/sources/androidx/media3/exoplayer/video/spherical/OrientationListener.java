package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class OrientationListener implements android.hardware.SensorEventListener {
    private final android.view.Display display;
    private final androidx.media3.exoplayer.video.spherical.OrientationListener.Listener[] listeners;
    private boolean recenterMatrixComputed;
    private final float[] deviceOrientationMatrix4x4 = new float[16];
    private final float[] tempMatrix4x4 = new float[16];
    private final float[] recenterMatrix4x4 = new float[16];
    private final float[] angles = new float[3];

    public interface Listener {
        void onOrientationChange(float[] fArr, float f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public OrientationListener(android.view.Display display, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener... listenerArr) {
        this.display = display;
        this.listeners = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        android.hardware.SensorManager.getRotationMatrixFromVector(this.deviceOrientationMatrix4x4, sensorEvent.values);
        rotateAroundZ(this.deviceOrientationMatrix4x4, this.display.getRotation());
        float fExtractRoll = extractRoll(this.deviceOrientationMatrix4x4);
        rotateYtoSky(this.deviceOrientationMatrix4x4);
        recenter(this.deviceOrientationMatrix4x4);
        notifyListeners(this.deviceOrientationMatrix4x4, fExtractRoll);
    }

    private void notifyListeners(float[] fArr, float f) {
        for (androidx.media3.exoplayer.video.spherical.OrientationListener.Listener listener : this.listeners) {
            listener.onOrientationChange(fArr, f);
        }
    }

    private void recenter(float[] fArr) {
        if (!this.recenterMatrixComputed) {
            androidx.media3.exoplayer.video.spherical.FrameRotationQueue.computeRecenterMatrix(this.recenterMatrix4x4, fArr);
            this.recenterMatrixComputed = true;
        }
        float[] fArr2 = this.tempMatrix4x4;
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        android.opengl.Matrix.multiplyMM(fArr, 0, this.tempMatrix4x4, 0, this.recenterMatrix4x4, 0);
    }

    private float extractRoll(float[] fArr) {
        android.hardware.SensorManager.remapCoordinateSystem(fArr, 1, org.objectweb.asm.Opcodes.LXOR, this.tempMatrix4x4);
        android.hardware.SensorManager.getOrientation(this.tempMatrix4x4, this.angles);
        return this.angles[2];
    }

    private void rotateAroundZ(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.tempMatrix4x4;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            android.hardware.SensorManager.remapCoordinateSystem(this.tempMatrix4x4, i2, i3, fArr);
        }
    }

    private static void rotateYtoSky(float[] fArr) {
        android.opengl.Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }
}
