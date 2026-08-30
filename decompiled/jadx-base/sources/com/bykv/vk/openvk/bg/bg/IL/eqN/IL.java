package com.bykv.vk.openvk.bg.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bykv.vk.openvk.bg.bg.IL.eqN.bg {
    private final android.media.MediaPlayer IL;
    private final com.bykv.vk.openvk.bg.bg.IL.eqN.IL.bg bX;
    private com.bykv.vk.openvk.bg.bg.IL.bg.bg eqN;
    private volatile boolean iR;
    private final java.lang.Object ldr;
    private android.view.Surface zx;

    public IL() {
        android.media.MediaPlayer mediaPlayer;
        java.lang.Object obj = new java.lang.Object();
        this.ldr = obj;
        synchronized (obj) {
            mediaPlayer = new android.media.MediaPlayer();
            this.IL = mediaPlayer;
        }
        bg(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (java.lang.Throwable unused) {
        }
        this.bX = new com.bykv.vk.openvk.bg.bg.IL.eqN.IL.bg(this);
        vb();
    }

    private void bg(android.media.MediaPlayer mediaPlayer) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.media.MediaTimeProvider");
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.media.SubtitleController");
            java.lang.Class<?> cls3 = java.lang.Class.forName("android.media.SubtitleController$Anchor");
            java.lang.Object objNewInstance = cls2.getConstructor(android.content.Context.class, cls, java.lang.Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.bg.bg.bg.bX.bg(), null, null);
            java.lang.reflect.Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new android.os.Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (java.lang.Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(android.view.SurfaceHolder surfaceHolder) throws java.lang.Throwable {
        synchronized (this.ldr) {
            try {
                if (!this.iR && surfaceHolder != null && surfaceHolder.getSurface() != null && this.bg) {
                    this.IL.setDisplay(surfaceHolder);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(android.view.Surface surface) {
        xxp();
        this.zx = surface;
        this.IL.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.IL il) throws java.lang.Throwable {
        this.IL.setPlaybackParams(this.IL.getPlaybackParams().setSpeed(il.bg()));
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(java.lang.String str) throws java.lang.Throwable {
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String scheme = uri.getScheme();
        if (!android.text.TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(com.ironsource.y8.h.b)) {
            this.IL.setDataSource(uri.getPath());
        } else {
            this.IL.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(java.io.FileDescriptor fileDescriptor) throws java.lang.Throwable {
        this.IL.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public synchronized void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        this.eqN = com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg(com.bykv.vk.openvk.bg.bg.bg.bX.bg(), bXVar);
        com.bykv.vk.openvk.bg.bg.IL.bg.IL.bX.bg(bXVar);
        this.IL.setDataSource(this.eqN);
    }

    private void Lq() {
        com.bykv.vk.openvk.bg.bg.IL.bg.bg bgVar = this.eqN;
        if (bgVar != null) {
            try {
                bgVar.close();
            } catch (java.lang.Throwable unused) {
            }
            this.eqN = null;
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void zx() throws java.lang.Throwable {
        this.IL.start();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void ldr() throws java.lang.Throwable {
        this.IL.stop();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void iR() throws java.lang.Throwable {
        this.IL.pause();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void Kg() {
        android.media.MediaPlayer mediaPlayer = this.IL;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void IL(boolean z) throws java.lang.Throwable {
        this.IL.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bg(long j, int i) throws java.lang.Throwable {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            this.IL.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.IL.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.IL.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.IL.seekTo((int) j, 2);
        } else if (i == 3) {
            this.IL.seekTo((int) j, 3);
        } else {
            this.IL.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public long WR() {
        try {
            return this.IL.getCurrentPosition();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public long eo() {
        try {
            return this.IL.getDuration();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void VB() throws java.lang.Throwable {
        synchronized (this.ldr) {
            if (!this.iR) {
                this.IL.release();
                this.iR = true;
                xxp();
                Lq();
                bg();
                vb();
            }
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void PX() throws java.lang.Throwable {
        try {
            this.IL.reset();
        } catch (java.lang.Throwable unused) {
        }
        Lq();
        bg();
        vb();
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void bX(boolean z) throws java.lang.Throwable {
        this.IL.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public void eqN(boolean z) throws java.lang.Throwable {
        android.media.MediaPlayer mediaPlayer = this.IL;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public int Ta() {
        android.media.MediaPlayer mediaPlayer = this.IL;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.bg.bg.IL.eqN.bX
    public int yDt() {
        android.media.MediaPlayer mediaPlayer = this.IL;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void vb() {
        this.IL.setOnPreparedListener(this.bX);
        this.IL.setOnBufferingUpdateListener(this.bX);
        this.IL.setOnCompletionListener(this.bX);
        this.IL.setOnSeekCompleteListener(this.bX);
        this.IL.setOnVideoSizeChangedListener(this.bX);
        this.IL.setOnErrorListener(this.bX);
        this.IL.setOnInfoListener(this.bX);
    }

    private static class bg implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.IL.eqN.IL> bg;

        public bg(com.bykv.vk.openvk.bg.bg.IL.eqN.IL il) {
            this.bg = new java.lang.ref.WeakReference<>(il);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                return il != null && il.IL(i, i2);
            } catch (java.lang.Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[3];
                java.lang.Integer.valueOf(i);
                java.lang.Integer.valueOf(i2);
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                return il != null && il.bg(i, i2);
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                if (il != null) {
                    il.bg(i, i2, 1, 1);
                }
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                if (il != null) {
                    il.eqN();
                }
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                if (il != null) {
                    il.bg(i);
                }
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                if (il != null) {
                    il.bX();
                }
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            try {
                com.bykv.vk.openvk.bg.bg.IL.eqN.IL il = this.bg.get();
                if (il != null) {
                    il.IL();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        xxp();
    }

    private void xxp() {
        try {
            android.view.Surface surface = this.zx;
            if (surface != null) {
                surface.release();
                this.zx = null;
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
