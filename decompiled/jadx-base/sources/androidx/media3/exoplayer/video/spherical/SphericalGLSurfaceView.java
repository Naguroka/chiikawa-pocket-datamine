package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
public final class SphericalGLSurfaceView extends android.opengl.GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final android.os.Handler mainHandler;
    private final androidx.media3.exoplayer.video.spherical.OrientationListener orientationListener;
    private final android.hardware.Sensor orientationSensor;
    private final androidx.media3.exoplayer.video.spherical.SceneRenderer scene;
    private final android.hardware.SensorManager sensorManager;
    private android.view.Surface surface;
    private android.graphics.SurfaceTexture surfaceTexture;
    private final androidx.media3.exoplayer.video.spherical.TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> videoSurfaceListeners;

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(android.view.Surface surface);

        void onVideoSurfaceDestroyed(android.view.Surface surface);
    }

    public SphericalGLSurfaceView(android.content.Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) androidx.media3.common.util.Assertions.checkNotNull(context.getSystemService("sensor"));
        this.sensorManager = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.orientationSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        androidx.media3.exoplayer.video.spherical.SceneRenderer sceneRenderer = new androidx.media3.exoplayer.video.spherical.SceneRenderer();
        this.scene = sceneRenderer;
        androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.Renderer renderer = new androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.Renderer(sceneRenderer);
        androidx.media3.exoplayer.video.spherical.TouchTracker touchTracker = new androidx.media3.exoplayer.video.spherical.TouchTracker(context, renderer, PX_PER_DEGREES);
        this.touchTracker = touchTracker;
        this.orientationListener = new androidx.media3.exoplayer.video.spherical.OrientationListener(((android.view.WindowManager) androidx.media3.common.util.Assertions.checkNotNull((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay(), touchTracker, renderer);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    public void addVideoSurfaceListener(androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.add(videoSurfaceListener);
    }

    public void removeVideoSurfaceListener(androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener videoSurfaceListener) {
        this.videoSurfaceListeners.remove(videoSurfaceListener);
    }

    public android.view.Surface getVideoSurface() {
        return this.surface;
    }

    public androidx.media3.exoplayer.video.VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.scene;
    }

    public androidx.media3.exoplayer.video.spherical.CameraMotionListener getCameraMotionListener() {
        return this.scene;
    }

    public void setDefaultStereoMode(int i) {
        this.scene.setDefaultStereoMode(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.useSensorRotation = z;
        updateOrientationListenerRegistration();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m221x99583d2c();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onDetachedFromWindow$0$androidx-media3-exoplayer-video-spherical-SphericalGLSurfaceView, reason: not valid java name */
    /* synthetic */ void m221x99583d2c() {
        android.view.Surface surface = this.surface;
        if (surface != null) {
            java.util.Iterator<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> it = this.videoSurfaceListeners.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        releaseSurface(this.surfaceTexture, surface);
        this.surfaceTexture = null;
        this.surface = null;
    }

    private void updateOrientationListenerRegistration() {
        boolean z = this.useSensorRotation && this.isStarted;
        android.hardware.Sensor sensor = this.orientationSensor;
        if (sensor == null || z == this.isOrientationListenerRegistered) {
            return;
        }
        if (z) {
            this.sensorManager.registerListener(this.orientationListener, sensor, 0);
        } else {
            this.sensorManager.unregisterListener(this.orientationListener);
        }
        this.isOrientationListenerRegistered = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceTextureAvailable(final android.graphics.SurfaceTexture surfaceTexture) {
        this.mainHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m222x24c550f4(surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onSurfaceTextureAvailable$1$androidx-media3-exoplayer-video-spherical-SphericalGLSurfaceView, reason: not valid java name */
    /* synthetic */ void m222x24c550f4(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2 = this.surfaceTexture;
        android.view.Surface surface = this.surface;
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.surfaceTexture = surfaceTexture;
        this.surface = surface2;
        java.util.Iterator<androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener> it = this.videoSurfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        releaseSurface(surfaceTexture2, surface);
    }

    private static void releaseSurface(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    final class Renderer implements android.opengl.GLSurfaceView.Renderer, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener, androidx.media3.exoplayer.video.spherical.OrientationListener.Listener {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final androidx.media3.exoplayer.video.spherical.SceneRenderer scene;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] projectionMatrix = new float[16];
        private final float[] viewProjectionMatrix = new float[16];
        private final float[] viewMatrix = new float[16];
        private final float[] tempMatrix = new float[16];

        public Renderer(androidx.media3.exoplayer.video.spherical.SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.deviceOrientationMatrix = fArr;
            float[] fArr2 = new float[16];
            this.touchPitchMatrix = fArr2;
            float[] fArr3 = new float[16];
            this.touchYawMatrix = fArr3;
            this.scene = sceneRenderer;
            androidx.media3.common.util.GlUtil.setToIdentity(fArr);
            androidx.media3.common.util.GlUtil.setToIdentity(fArr2);
            androidx.media3.common.util.GlUtil.setToIdentity(fArr3);
            this.deviceRoll = androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.UPRIGHT_ROLL;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.this.onSurfaceTextureAvailable(this.scene.init());
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
            android.opengl.GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            android.opengl.Matrix.perspectiveM(this.projectionMatrix, 0, calculateFieldOfViewInYDirection(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
            synchronized (this) {
                android.opengl.Matrix.multiplyMM(this.tempMatrix, 0, this.deviceOrientationMatrix, 0, this.touchYawMatrix, 0);
                android.opengl.Matrix.multiplyMM(this.viewMatrix, 0, this.touchPitchMatrix, 0, this.tempMatrix, 0);
            }
            android.opengl.Matrix.multiplyMM(this.viewProjectionMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
            this.scene.drawFrame(this.viewProjectionMatrix, false);
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        public synchronized void onOrientationChange(float[] fArr, float f) {
            float[] fArr2 = this.deviceOrientationMatrix;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.deviceRoll = -f;
            updatePitchMatrix();
        }

        private void updatePitchMatrix() {
            android.opengl.Matrix.setRotateM(this.touchPitchMatrix, 0, -this.touchPitch, (float) java.lang.Math.cos(this.deviceRoll), (float) java.lang.Math.sin(this.deviceRoll), 0.0f);
        }

        @Override // androidx.media3.exoplayer.video.spherical.TouchTracker.Listener
        public synchronized void onScrollChange(android.graphics.PointF pointF) {
            this.touchPitch = pointF.y;
            updatePitchMatrix();
            android.opengl.Matrix.setRotateM(this.touchYawMatrix, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // androidx.media3.exoplayer.video.spherical.TouchTracker.Listener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            return androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.this.performClick();
        }

        private float calculateFieldOfViewInYDirection(float f) {
            if (f > 1.0f) {
                return (float) (java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.tan(java.lang.Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }
    }
}
