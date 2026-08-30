package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 extends android.widget.FrameLayout implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.SurfaceHolder.Callback, android.widget.MediaController.MediaPlayerControl {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f3909a;
    private final android.view.SurfaceView b;
    private final android.view.SurfaceHolder c;
    private final java.lang.String d;
    private final int e;
    private final int f;
    private final boolean g;
    private final long h;
    private final long i;
    private final com.unity3d.player.a1 j;
    private int k;
    private int l;
    private int m;
    private int n;
    private android.media.MediaPlayer o;
    private android.widget.MediaController p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private com.unity3d.player.C w;
    private com.unity3d.player.Y0 x;
    private com.unity3d.player.Z0 y;
    private volatile int z;

    protected a1(android.content.Context context, com.unity3d.player.UnityPlayer unityPlayer, java.lang.String str, int i, int i2, int i3, boolean z, long j, long j2, com.unity3d.player.Y0 y0) {
        super(context);
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.w = null;
        this.z = 0;
        this.x = y0;
        this.f3909a = context;
        this.j = this;
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
        this.b = surfaceView;
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        this.c = holder;
        holder.addCallback(this);
        setBackgroundColor(i);
        addView(surfaceView);
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = j;
        this.i = j2;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.w = com.unity3d.player.D.a(unityPlayer.getActivity(), 1000000, new com.unity3d.player.X0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.z = i;
        com.unity3d.player.Y0 y0 = this.x;
        if (y0 != null) {
            ((com.unity3d.player.c1) y0).a(this.z);
        }
    }

    final boolean a() {
        return this.t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void cancelOnPrepare() {
        a(2);
    }

    protected void destroyPlayer() {
        if (!this.t) {
            pause();
        }
        doCleanUp();
        com.unity3d.player.C c = this.w;
        if (c != null) {
            c.unregisterOnBackPressedCallback();
            this.w = null;
        }
    }

    protected void doCleanUp() {
        com.unity3d.player.Z0 z0 = this.y;
        if (z0 != null) {
            z0.b = true;
            this.y = null;
        }
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.o.release();
            this.o = null;
        }
        this.m = 0;
        this.n = 0;
        this.r = false;
        this.q = false;
    }

    public boolean exitOnKeypress(int i, android.view.KeyEvent keyEvent) {
        java.lang.Runnable runnable;
        if (i != 4 && (this.e != 2 || i == 0 || keyEvent.isSystem())) {
            return false;
        }
        com.unity3d.player.a.c cVar = this.w.f3860a;
        if ((cVar != null) && (runnable = ((com.unity3d.player.B) cVar).f3858a) != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.g) {
            return this.s;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z = this.r && this.q;
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return !z;
        }
        return mediaPlayer.isPlaying() || !z;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
        this.s = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        destroyPlayer();
        a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        android.widget.MediaController mediaController = this.p;
        return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (exitOnKeypress(i, keyEvent)) {
            return true;
        }
        android.widget.MediaController mediaController = this.p;
        return mediaController != null ? mediaController.onKeyUp(i, keyEvent) : super.onKeyUp(i, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.unity3d.player.Z0 z0 = this.y;
        if (z0 != null) {
            z0.b = true;
            this.y = null;
        }
        int i = this.e;
        if (i == 0 || i == 1) {
            android.widget.MediaController mediaController = new android.widget.MediaController(this.f3909a);
            this.p = mediaController;
            mediaController.setMediaPlayer(this);
            this.p.setAnchorView(this);
            this.p.setEnabled(true);
            android.content.Context context = this.f3909a;
            if (context instanceof android.app.Activity) {
                this.p.setSystemUiVisibility(((android.app.Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.p.show();
        }
        this.r = true;
        if (!this.q || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.t) {
            return;
        }
        start();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.e != 2 || action != 0) {
            android.widget.MediaController mediaController = this.p;
            return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.q = true;
        this.m = i;
        this.n = i2;
        if (!this.r || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.t) {
            return;
        }
        start();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.v) {
            this.u = mediaPlayer.getCurrentPosition();
            this.o.pause();
        }
        this.t = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        android.media.MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.v) {
            int i = this.u;
            if (i > 0) {
                mediaPlayer.seekTo(i);
            }
            this.o.start();
            this.u = 0;
        }
        this.t = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.k == i2 && this.l == i3) {
            return;
        }
        this.k = i2;
        this.l = i3;
        if (this.v) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        java.io.FileInputStream fileInputStream;
        this.v = true;
        if (this.t) {
            android.media.MediaPlayer mediaPlayer = this.o;
            if (mediaPlayer == null || this.u <= 0) {
                return;
            }
            mediaPlayer.setDisplay(this.c);
            this.o.seekTo(this.u);
            return;
        }
        android.media.MediaPlayer mediaPlayer2 = this.o;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setDisplay(this.c);
            if (this.t) {
                return;
            }
            int i = this.u;
            if (i > 0) {
                this.o.seekTo(i);
            }
            this.o.start();
            this.u = 0;
            return;
        }
        a(0);
        doCleanUp();
        try {
            android.media.MediaPlayer mediaPlayer3 = new android.media.MediaPlayer();
            this.o = mediaPlayer3;
            if (this.g) {
                mediaPlayer3.setDataSource(this.f3909a, android.net.Uri.parse(this.d));
            } else {
                if (this.i != 0) {
                    fileInputStream = new java.io.FileInputStream(this.d);
                    this.o.setDataSource(fileInputStream.getFD(), this.h, this.i);
                } else {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd = getResources().getAssets().openFd(this.d);
                        this.o.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        assetFileDescriptorOpenFd.close();
                    } catch (java.io.IOException unused) {
                        fileInputStream = new java.io.FileInputStream(this.d);
                        this.o.setDataSource(fileInputStream.getFD());
                        fileInputStream.close();
                    }
                }
                fileInputStream.close();
            }
            this.o.setDisplay(this.c);
            this.o.setScreenOnWhilePlaying(true);
            this.o.setOnBufferingUpdateListener(this);
            this.o.setOnCompletionListener(this);
            this.o.setOnPreparedListener(this);
            this.o.setOnVideoSizeChangedListener(this);
            this.o.setAudioAttributes(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.o.prepareAsync();
            this.y = new com.unity3d.player.Z0(this);
            new java.lang.Thread(this.y).start();
        } catch (java.lang.Exception unused2) {
            a(2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.v = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r8 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void updateVideoLayout() {
        int i;
        int i2;
        int i3;
        if (this.o == null) {
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) this.f3909a.getSystemService("window");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.widthPixels;
        if (i4 > 0 && (i3 = displayMetrics.heightPixels) > 0) {
            this.k = i4;
            this.l = i3;
        }
        int i5 = this.k;
        int i6 = this.l;
        if (this.q) {
            i = this.m;
            i2 = this.n;
            float f = i / i2;
            float f2 = i5;
            float f3 = i6;
            float f4 = f2 / f3;
            int i7 = this.f;
            if (i7 == 1) {
                if (f4 <= f) {
                    i2 = (int) (f2 / f);
                    i = i5;
                } else {
                    i = (int) (f3 * f);
                    i2 = i6;
                }
            } else if (i7 == 2) {
                if (f4 >= f) {
                    i2 = (int) (f2 / f);
                    i = i5;
                } else {
                    i = (int) (f3 * f);
                    i2 = i6;
                }
            }
        } else {
            i = i5;
            i2 = i6;
        }
        if (i5 == i && i6 == i2) {
            return;
        }
        this.j.updateViewLayout(this.b, new android.widget.FrameLayout.LayoutParams(i, i2, 17));
    }
}
