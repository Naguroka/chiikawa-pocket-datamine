package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LW extends android.view.TextureView implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.view.TextureView.SurfaceTextureListener, com.facebook.ads.redexgen.core.InterfaceC0982Rf {
    public static byte[] A0O;
    public static java.lang.String[] A0P = {"8kg0gsxxraVcY9760AfDDdqqLp5YK9AT", "N8j2Ddyx", "HVNw4PtkXrEg8LlUN7XWbo", "maxPy5SeUtgOYTWaW", "FkAKyJNQQf2eCz2ilXM7tuAli1jbjSs3", "vA9Mb9Xk6BXUb", "TQHC", "vy65DpAohCvDmaIHVnToJ2EB52e80kqi"};
    public static final java.lang.String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public android.media.MediaPlayer A06;
    public android.net.Uri A07;
    public android.view.Surface A08;
    public android.view.View A09;
    public android.widget.MediaController A0A;
    public com.facebook.ads.redexgen.core.EnumC0969Qs A0B;
    public com.facebook.ads.redexgen.core.EnumC0984Rh A0C;
    public com.facebook.ads.redexgen.core.EnumC0984Rh A0D;
    public com.facebook.ads.redexgen.core.InterfaceC0985Ri A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final android.widget.MediaController.MediaPlayerControl A0M;
    public final com.facebook.ads.redexgen.core.C1199Zs A0N;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A0O = new byte[]{115, 125, 113, 115, -74, -55, -59, -61, -78, 115, 113, -117, 113, 115, -54, 37, -115, -85, -72, -72, -71, -66, 106, -70, -68, -81, -70, -85, -68, -81, 106, -73, -81, -82, -77, -85, 106, -70, -74, -85, -61, -81, -68, 106, -63, -77, -66, -78, 106, -99, -65, -68, -80, -85, -83, -81, -98, -81, -62, -66, -65, -68, -81, -124, 106, -70, -26, -20, -29, -37, -27, -98, -21, -105, -23, -36, -21, -23, -32, -36, -19, -36, -105, -19, -32, -37, -36, -26, -105, -32, -27, -35, -26, -23, -28, -40, -21, -32, -26, -27, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -6, -5, -16, -7, -85, -20, -2, -2, -16, -1, -2, -104, -64, -64, -72, -67, -74, 113, -78, -67, -56, -78, -54, -60, 113, -59, -71, -61, -64, -56, 113, -78, -65, 113, -74, -55, -76, -74, -63, -59, -70, -64, -65, 113, -56, -70, -59, -71, 113, -60, -74, -59, -109, -78, -76, -68, -72, -61, -64, -58, -65, -75, -107, -61, -78, -56, -78, -77, -67, -74, 113, -64, -65, 113, -97, -64, -58, -72, -78, -59, 113, -78, -77, -64, -57, -74, 127, 113, -60, -64, 113, -56, -74, 113, -60, -70, -67, -74, -65, -59, -67, -54, 113, -70, -72, -65, -64, -61, -74, 113, -70, -59, 127, -23, 17, 17, 9, 14, 7, -62, 3, 14, 25, 3, 27, 21, -62, 22, 10, 20, 17, 25, -62, 3, 16, -62, 7, 26, 5, 7, 18, 22, 11, 17, 16, -62, 25, 11, 22, 10, -62, 21, 7, 22, -24, 17, 20, 7, 9, 20, 17, 23, 16, 6, -62, 17, 16, -62, -16, 17, 23, 9, 3, 22, -62, 3, 4, 17, 24, 7, -48, -62, 21, 17, -62, 25, 7, -62, 21, 11, 14, 7, 16, 22, 14, 27, -62, 11, 9, 16, 17, 20, 7, -62, 11, 22, -48, -47, -22, -35, -34, -24, -31, -100, -16, -21, -100, -33, -24, -21, -17, -31, -13, 16, 7, -66, 17, 6, 13, 19, 10, 2, -66, 12, 13, 18, -66, 0, 3, -66, 3, 11, 14, 18, 23, -52, -4, 15, 10, 11, 21, -58, 25, 26, 7, 26, 11, -58, 9, 14, 7, 20, 13, 11, 10, -58, 26, 21, -58, -97, -79, -79, -93, -78, 26, 22, 11, 35, 15, 28, 12, -77, 8, -7, -14, 5, -77, -79, -53, -79, -77};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0N)) {
            android.media.MediaPlayer mediaPlayer = this.A06;
            if (A0P[4].charAt(10) != '2') {
                throw new java.lang.RuntimeException();
            }
            A0P[4] = "ZKmo0lxTtT2mJSQRRhI8B7lsvNxlt9ka";
            if (mediaPlayer == null || !A07()) {
                return;
            }
            if (!this.A0I) {
                this.A0I = true;
                this.A0N.A0E().AG4();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0E != null) {
                this.A0E.AC1(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A04();
        A0Q = com.facebook.ads.redexgen.core.LW.class.getSimpleName();
    }

    public LW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A0C = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0M = new com.facebook.ads.redexgen.core.C0979Rc(this);
        this.A0I = false;
        this.A0N = c1199Zs;
    }

    public LW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        super(c1199Zs, attributeSet);
        this.A0C = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0M = new com.facebook.ads.redexgen.core.C0979Rc(this);
        this.A0I = false;
        this.A0N = c1199Zs;
    }

    public LW(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A0C = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0M = new com.facebook.ads.redexgen.core.C0979Rc(this);
        this.A0I = false;
        this.A0N = c1199Zs;
    }

    private final void A05(android.media.MediaPlayer mediaPlayer, android.net.Uri uri) {
        java.lang.String strA03 = A03(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_EASING, 15, 64);
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    java.lang.String uriPath = uri.getPath();
                    if (!android.text.TextUtils.isEmpty(uriPath)) {
                        android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd = getContext().getAssets().openFd(uriPath.substring(1));
                        mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        if (assetFileDescriptorOpenFd != null) {
                            assetFileDescriptorOpenFd.close();
                            return;
                        }
                        return;
                    }
                    throw new java.io.IOException(A03(332, 24, 98));
                } catch (java.lang.Throwable th) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (java.io.IOException e) {
                            android.util.Log.w(A0Q, strA03, e);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException | java.lang.SecurityException e2) {
                android.util.Log.w(A0Q, A03(100, 21, 79), e2);
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
                this.A0N.A0E().A3T(2);
                if (0 != 0) {
                    assetFileDescriptor.close();
                }
            }
        } catch (java.io.IOException e3) {
            java.lang.String str = A0Q;
            if (A0P[6].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            A0P[3] = "IDdSaYeoVr3R4FZ1u";
            android.util.Log.w(str, strA03, e3);
        }
    }

    private boolean A06() {
        return (this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A08 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A07 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A06;
    }

    private boolean A08() {
        return (this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A08 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A07) ? false : true;
    }

    private boolean A09() {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.reset();
            return true;
        } catch (java.lang.IllegalStateException e) {
            this.A0N.A07().AA0(A03(androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 6, 110), com.facebook.ads.redexgen.core.C8E.A2H, new com.facebook.ads.redexgen.core.C8F(e));
            return false;
        }
    }

    private boolean A0A(android.view.Surface surface) {
        if (this.A06 == null) {
            return false;
        }
        try {
            this.A06.setSurface(surface);
            return true;
        } catch (java.lang.IllegalStateException e) {
            this.A0N.A07().AA0(A03(androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 6, 110), com.facebook.ads.redexgen.core.C8E.A2I, new com.facebook.ads.redexgen.core.C8F(e));
            return false;
        }
    }

    public final /* synthetic */ void A0C() {
        android.app.Activity activity = this.A0N.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8o();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void A8o() {
        if (!this.A0F) {
            AEN(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A90() {
        if (this.A06 == null || android.os.Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (android.media.MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                if (trackInfo.getTrackType() == 2) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e(A0Q, A03(65, 35, 59), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A91() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A9a() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AEN(boolean z, int i) {
        this.A0N.A0E().A3P(i);
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0J = z;
            this.A06.pause();
            if (this.A0C != com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A05);
                return;
            }
            return;
        }
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AGo(int i) {
        this.A0N.A0E().AAs(i);
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A09);
        AH1(5);
        this.A03 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AGt(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs, int i) {
        this.A0N.A0E().A3a(i);
        this.A0J = false;
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A0A;
        this.A0B = enumC0969Qs;
        if (this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A07 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A04 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            if (this.A06 == null) {
                setup(this.A07);
            } else {
                if (this.A03 > 0) {
                    this.A06.seekTo(this.A03);
                }
                this.A06.start();
                if (this.A0C != com.facebook.ads.redexgen.core.EnumC0984Rh.A07 || this.A0K) {
                    setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A0A);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AH1(int i) {
        this.A0N.A0E().A3c(i);
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        if (this.A06 != null) {
            int currentPosition = this.A06.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            A09();
            this.A06.release();
            this.A06 = null;
            if (this.A0A != null) {
                this.A0A.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            android.media.MediaPlayer mediaPlayer = this.A06;
            if (A0P[1].length() == 0) {
                throw new java.lang.RuntimeException();
            }
            A0P[3] = "r7bVcQo0vwDc4SuX1";
            mediaPlayer.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getDuration() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public com.facebook.ads.redexgen.core.EnumC0969Qs getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public com.facebook.ads.redexgen.core.EnumC0984Rh getState() {
        return this.A0C;
    }

    public com.facebook.ads.redexgen.core.EnumC0984Rh getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public android.view.View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
            this.A0N.A0E().A3T(5);
            AH1(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        if (this.A06 != null) {
            this.A06.pause();
        }
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        this.A0N.A0E().AAr(A03(390, 11, 85) + i + A03(0, 14, 21) + i2 + A03(14, 2, 108));
        if (this.A01 > 0 && getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
            this.A01--;
            AH1(6);
            AGt(this.A0B, 10);
        } else {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
            this.A0N.A0E().A3T(1);
            AH1(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 3:
                this.A0K = true;
                if (this.A0D == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
                    setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A0A);
                }
                return true;
            case 701:
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A02);
                return false;
            case 702:
                if (!A08()) {
                    return false;
                }
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A0A);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A07);
        if (this.A0H && !this.A0G) {
            android.app.Activity activityA0D = this.A0N.A0D();
            if (activityA0D != null) {
                this.A0A = new android.widget.MediaController(activityA0D);
                this.A0A.setAnchorView(this.A09 == null ? this : this.A09);
                this.A0A.setMediaPlayer(this.A0M);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A03 > 0) {
            int i = this.A03;
            android.media.MediaPlayer mediaPlayer2 = this.A06;
            if (A0P[3].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A0P[5] = "vYKpudhGuKF00mC0lqJEZv1Z";
            if (i >= mediaPlayer2.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        if (this.A0D == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
            AGt(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        if (this.A0E == null) {
            return;
        }
        this.A0E.ADW(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new android.view.Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
            this.A0N.A0E().A3T(4);
            destroy();
        } else if (this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 && !this.A0J) {
            AGt(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        A0A(null);
        if (this.A08 != null) {
            this.A08.release();
            this.A08 = null;
        }
        if (this.A0C != com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
            AEN(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        if (this.A0A != null && this.A0A.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
                if (!this.A0N.A0G().A01()) {
                    boolean zA1v = com.facebook.ads.redexgen.core.C0762Im.A1v(this.A0N);
                    if (A0P[2].length() != 22) {
                        throw new java.lang.RuntimeException();
                    }
                    A0P[5] = "q2iXdwHPhxMMYJm8CrOmbfqNZQSE";
                    if (zA1v) {
                        if (android.os.Build.VERSION.SDK_INT >= 24) {
                            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Rb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.A00.A0C();
                                }
                            }, 1000L);
                            return;
                        }
                    }
                } else if (android.os.Build.VERSION.SDK_INT >= 24) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.Rb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0C();
                        }
                    }, 1000L);
                    return;
                }
                A8o();
                return;
            }
            return;
        }
        com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh = this.A0C;
        com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh2 = com.facebook.ads.redexgen.core.EnumC0984Rh.A05;
        if (A0P[6].length() == 4) {
            A0P[6] = "r8oy";
            if (enumC0984Rh != enumC0984Rh2) {
                return;
            }
        } else if (enumC0984Rh != enumC0984Rh2) {
            return;
        }
        if (!this.A0J) {
            com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs = this.A0B;
            if (A0P[3].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A0P[1] = "grk6xKjGgtFswoEyrqXB";
            AGt(enumC0969Qs, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void seekTo(int i) {
        if (this.A06 != null && A07()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.w(A0Q, A03(121, 102, 21));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setControlsAnchorView(android.view.View view) {
        this.A09 = view;
        view.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0981Re(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.w(A0Q, A03(223, 94, 102));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0980Rd(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 == null || this.A0C == com.facebook.ads.redexgen.core.EnumC0984Rh.A08) {
            return;
        }
        com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh = this.A0C;
        java.lang.String[] strArr = A0P;
        if (strArr[0].charAt(16) == strArr[7].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        A0P[3] = "xC5rxgqNbqLUjjPrr";
        if (enumC0984Rh != com.facebook.ads.redexgen.core.EnumC0984Rh.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setVideoMPD(java.lang.String str) {
    }

    private void setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh) {
        if (enumC0984Rh != this.A0C) {
            if (this.A0N.A04().A9O()) {
                java.lang.String str = A03(356, 23, 106) + enumC0984Rh;
            }
            this.A0C = enumC0984Rh;
            if (this.A0E != null) {
                this.A0E.AEA(enumC0984Rh);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setVideoStateChangeListener(com.facebook.ads.redexgen.core.InterfaceC0985Ri interfaceC0985Ri) {
        this.A0E = interfaceC0985Ri;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setup(android.net.Uri uri) {
        android.media.MediaPlayer mediaPlayer;
        this.A0N.A0E().A3S();
        this.A0K = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
        } else {
            mediaPlayer = new android.media.MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(379, 5, 2))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A08);
        } catch (java.lang.Exception e) {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
            this.A0N.A0E().A3T(3);
            mediaPlayer.release();
            android.util.Log.e(A0Q, A03(16, 49, 14) + e);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
