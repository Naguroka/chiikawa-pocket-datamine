package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LX extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, com.facebook.ads.redexgen.core.RP, com.facebook.ads.redexgen.core.InterfaceC0982Rf, com.facebook.ads.redexgen.core.RR {
    public static byte[] A0O;
    public static java.lang.String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final java.lang.String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public android.net.Uri A06;
    public android.view.Surface A07;
    public android.view.View A08;
    public android.widget.MediaController A09;
    public com.facebook.ads.redexgen.core.C1199Zs A0A;
    public com.facebook.ads.redexgen.core.EnumC0969Qs A0B;
    public com.facebook.ads.redexgen.core.RS A0C;
    public com.facebook.ads.redexgen.core.EnumC0984Rh A0D;
    public com.facebook.ads.redexgen.core.EnumC0984Rh A0E;
    public com.facebook.ads.redexgen.core.InterfaceC0985Ri A0F;
    public java.lang.String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-54, -14, -14, -22, -17, -24, -93, -28, -17, -6, -28, -4, -10, -93, -9, -21, -11, -14, -6, -93, -28, -15, -93, -24, -5, -26, -24, -13, -9, -20, -14, -15, -93, -6, -20, -9, -21, -93, -10, -24, -9, -59, -28, -26, -18, -22, -11, -14, -8, -15, -25, -57, -11, -28, -6, -28, -27, -17, -24, -93, -14, -15, -93, -47, -14, -8, -22, -28, -9, -93, -28, -27, -14, -7, -24, -79, -93, -10, -14, -93, -6, -24, -93, -10, -20, -17, -24, -15, -9, -17, -4, -93, -20, -22, -15, -14, -11, -24, -93, -20, -9, -79, -22, 18, 18, 10, 15, 8, -61, 4, 15, 26, 4, 28, 22, -61, 23, 11, 21, 18, 26, -61, 4, 17, -61, 8, 27, 6, 8, 19, 23, 12, 18, 17, -61, 26, 12, 23, 11, -61, 22, 8, 23, -23, 18, 21, 8, 10, 21, 18, 24, 17, 7, -61, 18, 17, -61, -15, 18, 24, 10, 4, 23, -61, 4, 5, 18, 25, 8, -47, -61, 22, 18, -61, 26, 8, -61, 22, 12, 15, 8, 17, 23, 15, 28, -61, 12, 10, 17, 18, 21, 8, -61, 12, 23, -47, -11, 8, 3, 4, 14, -65, 18, 19, 0, 19, 4, -65, 2, 7, 0, 13, 6, 4, 3, -65, 19, 14, -65, -60, -62, -53, -62, -49, -58, -64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        if (com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0A)) {
            com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh = this.A0D;
            if (A0P[6].length() != 18) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC0984Rh == com.facebook.ads.redexgen.core.EnumC0984Rh.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0E().AG0();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.AC1(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = com.facebook.ads.redexgen.core.LX.class.getSimpleName();
    }

    public LX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1199Zs;
    }

    public LX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        super(c1199Zs, attributeSet);
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1199Zs;
    }

    public LX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A0D = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = com.facebook.ads.redexgen.core.EnumC0969Qs.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1199Zs;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    private void A04() {
        this.A0C = new com.facebook.ads.redexgen.core.RS(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            android.app.Activity activityA0D = this.A0A.A0D();
            if (activityA0D != null) {
                this.A09 = new android.widget.MediaController(activityA0D);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new com.facebook.ads.redexgen.core.RY(this));
                this.A09.setEnabled(true);
            } else if (A0P[5].charAt(4) != 'y') {
                A0P[6] = "TO7k5EC8ZWp6tpojZW";
                this.A09 = null;
            } else {
                java.lang.String[] strArr = A0P;
                strArr[0] = "fS";
                strArr[1] = "9d";
                this.A09 = null;
            }
        }
        if (this.A0G != null) {
            java.lang.String str = this.A0G;
            if (A0P[6].length() != 18) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0P;
            strArr2[0] = "Pg";
            strArr2[1] = "vu";
            if (str.length() == 0 || this.A0K) {
                this.A0C.A0F(this.A0A.A01(), this.A06);
            }
        } else {
            this.A0C.A0F(this.A0A.A01(), this.A06);
        }
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        com.facebook.ads.redexgen.core.RQ videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return com.facebook.ads.redexgen.core.RS.A03();
    }

    public final /* synthetic */ void A0A() {
        android.app.Activity activity = this.A0A.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8o();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void A8o() {
        if (!this.A0H) {
            AEN(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A90() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A91() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final boolean A9a() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.core.RP
    public final void AD7(java.lang.String str, java.lang.Exception exc) {
        this.A0A.A0E().AAr(str);
        this.A0A.A0E().A3T(1);
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
        this.A0A.A07().AA0(A03(219, 7, 15), com.facebook.ads.redexgen.core.C8E.A1N, new com.facebook.ads.redexgen.core.C8F(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3 = com.facebook.ads.redexgen.core.EnumC0984Rh.A05;
        r2 = com.facebook.ads.redexgen.core.LX.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r2[4].length() == r2[7].length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        com.facebook.ads.redexgen.core.LX.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.RP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AD8(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                if (this.A0F == null) {
                    return;
                }
                com.facebook.ads.redexgen.core.InterfaceC0985Ri interfaceC0985Ri = this.A0F;
                int seekFrom = getCurrentPosition();
                interfaceC0985Ri.ADW(i2, seekFrom);
                return;
            case 3:
                A05();
                this.A04 = java.lang.System.currentTimeMillis();
                setRequestedVolume(this.A00);
                if (this.A05 > 0 && this.A05 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z) {
                    boolean z2 = this.A0N;
                    if (A0P[5].charAt(4) == 'y') {
                        A0P[5] = "3r7lyS1P0Mh4AObuDTaZ0iezAfx5hfrS";
                    } else {
                        java.lang.String[] strArr = A0P;
                        strArr[3] = "T7dswaxt6nrXidjLTysunwDPvSX4Ru7O";
                        strArr[2] = "ANtZP5BaeS0Nfv6aTfoZkiJnjx34FJZx";
                    }
                    break;
                }
                if (z || this.A0D == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
                    return;
                }
                setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A07);
                com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh = this.A0E;
                java.lang.String[] strArr2 = A0P;
                if (strArr2[3].charAt(16) != strArr2[2].charAt(16)) {
                    throw new java.lang.RuntimeException();
                }
                A0P[6] = "MPZySUBjU8eQIDiJ8j";
                if (enumC0984Rh != com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
                    return;
                }
                AGt(this.A0B, 8);
                this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A06);
                }
                if (this.A0C != null) {
                    this.A0C.A0I(false);
                    if (A0P[5].charAt(4) == 'y') {
                        java.lang.String[] strArr3 = A0P;
                        strArr3[4] = "0npepmR7M4IL";
                        strArr3[7] = "iLUr5jfc2zzHXCQiIz3oIHQjifgBE";
                        if (!z) {
                            this.A0C.A0A();
                        }
                    }
                }
                this.A0N = false;
                return;
            default:
                return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AE8(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AEN(boolean z, int i) {
        this.A0A.A0E().A3P(i);
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A05;
        this.A0M = z;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AGo(int i) {
        this.A0A.A0E().AAs(i);
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A09);
        AH1(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AGt(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs, int i) {
        this.A0A.A0E().A3a(i);
        this.A0M = false;
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A0A;
        this.A0B = enumC0969Qs;
        if (this.A0C == null) {
            setup(this.A06);
            return;
        }
        if (this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A07 && this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A05 && this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            return;
        }
        this.A0C.A0I(true);
        com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh = com.facebook.ads.redexgen.core.EnumC0984Rh.A0A;
        java.lang.String[] strArr = A0P;
        if (strArr[4].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0P;
        strArr2[0] = "Wi";
        strArr2[1] = "9L";
        setVideoState(enumC0984Rh);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void AH1(int i) {
        this.A0A.A0E().A3c(i);
        this.A0E = com.facebook.ads.redexgen.core.EnumC0984Rh.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public com.facebook.ads.redexgen.core.EnumC0969Qs getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public com.facebook.ads.redexgen.core.EnumC0984Rh getState() {
        return this.A0D;
    }

    public com.facebook.ads.redexgen.core.EnumC0984Rh getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public android.view.View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (com.facebook.ads.redexgen.core.C0762Im.A2Y(getContext()) && !isHardwareAccelerated()) {
            setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh.A03);
            AH1(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new android.view.Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 && !this.A0M) {
            AGt(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                this.A0C.A0E(null);
            }
        }
        if (this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
            AEN(false, 5);
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
                if ((this.A0A.A0G().A01() || com.facebook.ads.redexgen.core.C0762Im.A1v(this.A0A)) && android.os.Build.VERSION.SDK_INT >= 24) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.RX
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A8o();
                    return;
                }
            }
            return;
        }
        if (this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A05 || this.A0M) {
            return;
        }
        AGt(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
        } else {
            this.A05 = i;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.w(A0Q, A03(0, 102, 53));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setControlsAnchorView(android.view.View view) {
        this.A08 = view;
        view.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0977Ra(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.w(A0Q, A03(102, 94, 85));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new com.facebook.ads.redexgen.core.RZ(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A08 && this.A0D != com.facebook.ads.redexgen.core.EnumC0984Rh.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setVideoMPD(java.lang.String str) {
        this.A0G = str;
    }

    private void setVideoState(com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh) {
        if (enumC0984Rh != this.A0D) {
            if (this.A0A.A04().A9O()) {
                java.lang.String str = A03(196, 23, 81) + enumC0984Rh;
            }
            this.A0D = enumC0984Rh;
            if (this.A0D == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AEA(enumC0984Rh);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setVideoStateChangeListener(com.facebook.ads.redexgen.core.InterfaceC0985Ri interfaceC0985Ri) {
        this.A0F = interfaceC0985Ri;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0982Rf
    public void setup(android.net.Uri uri) {
        this.A0A.A0E().A3S();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
