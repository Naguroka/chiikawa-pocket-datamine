package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T7 extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC0985Ri, com.facebook.ads.redexgen.core.InterfaceC0961Qk {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final com.facebook.ads.redexgen.core.C1011Si A0G;
    public static final com.facebook.ads.redexgen.core.SZ A0H;
    public static final com.facebook.ads.redexgen.core.C0983Rg A0I;
    public static final com.facebook.ads.redexgen.core.R0 A0J;
    public static final com.facebook.ads.redexgen.core.C0976Qz A0K;
    public static final com.facebook.ads.redexgen.core.C0973Qw A0L;
    public static final com.facebook.ads.redexgen.core.QQ A0M;
    public static final com.facebook.ads.redexgen.core.QP A0N;
    public int A00;
    public com.facebook.ads.redexgen.core.JF A01;
    public com.facebook.ads.redexgen.core.C0966Qp A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final android.os.Handler A07;
    public final android.os.Handler A08;
    public final android.view.View.OnTouchListener A09;
    public final com.facebook.ads.redexgen.core.C1199Zs A0A;
    public final com.facebook.ads.redexgen.core.C05338w<com.facebook.ads.redexgen.core.AbstractC05348x, com.facebook.ads.redexgen.core.C05328v> A0B;
    public final java.util.List<com.facebook.ads.redexgen.core.InterfaceC0970Qt> A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC0982Rf A0D;

    public static java.lang.String A0F(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
            i4++;
        }
    }

    public static void A0I() {
        A0E = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0I();
        A0I = new com.facebook.ads.redexgen.core.C0983Rg();
        A0G = new com.facebook.ads.redexgen.core.C1011Si();
        A0J = new com.facebook.ads.redexgen.core.R0();
        A0K = new com.facebook.ads.redexgen.core.C0976Qz();
        A0H = new com.facebook.ads.redexgen.core.SZ();
        A0L = new com.facebook.ads.redexgen.core.C0973Qw();
        A0N = new com.facebook.ads.redexgen.core.QP();
        A0M = new com.facebook.ads.redexgen.core.QQ();
    }

    public T7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A0C = new java.util.ArrayList();
        this.A07 = new android.os.Handler();
        this.A08 = new android.os.Handler();
        this.A0B = new com.facebook.ads.redexgen.core.C05338w<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0960Qj(this);
        this.A0A = c1199Zs;
        if (A0S(c1199Zs)) {
            this.A0D = new com.facebook.ads.redexgen.core.LX(c1199Zs);
        } else {
            this.A0D = new com.facebook.ads.redexgen.core.LW(c1199Zs);
        }
        A0G();
    }

    public T7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        super(c1199Zs, attributeSet);
        this.A0C = new java.util.ArrayList();
        this.A07 = new android.os.Handler();
        this.A08 = new android.os.Handler();
        this.A0B = new com.facebook.ads.redexgen.core.C05338w<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0960Qj(this);
        this.A0A = c1199Zs;
        if (A0S(c1199Zs)) {
            this.A0D = new com.facebook.ads.redexgen.core.LX(c1199Zs, attributeSet);
        } else {
            this.A0D = new com.facebook.ads.redexgen.core.LW(c1199Zs, attributeSet);
        }
        A0G();
    }

    public T7(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A0C = new java.util.ArrayList();
        this.A07 = new android.os.Handler();
        this.A08 = new android.os.Handler();
        this.A0B = new com.facebook.ads.redexgen.core.C05338w<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0960Qj(this);
        this.A0A = c1199Zs;
        if (A0S(c1199Zs)) {
            this.A0D = new com.facebook.ads.redexgen.core.LX(c1199Zs, attributeSet, i);
        } else {
            this.A0D = new com.facebook.ads.redexgen.core.LW(c1199Zs, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.R0 A0D() {
        com.facebook.ads.redexgen.core.R0 r0 = A0J;
        if (A0F[7].charAt(27) == '4') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0F;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return r0;
    }

    private void A0G() {
        this.A06 = com.facebook.ads.redexgen.core.C0762Im.A0q(this.A0A);
        this.A0A.A0E().A3O();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new com.facebook.ads.redexgen.core.C0966Qp(this.A0A, this.A0D);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new com.facebook.ads.redexgen.core.TB(this), this.A00);
    }

    private final void A0J() {
        for (com.facebook.ads.redexgen.core.InterfaceC0970Qt interfaceC0970Qt : this.A0C) {
            boolean z = interfaceC0970Qt instanceof com.facebook.ads.redexgen.core.AbstractC1015Sm;
            java.lang.String[] strArr = A0F;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            A0F[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0Q((com.facebook.ads.redexgen.core.AbstractC1015Sm) interfaceC0970Qt);
            }
            interfaceC0970Qt.A9r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        if (com.facebook.ads.redexgen.core.C0762Im.A0w(this.A0A)) {
            android.widget.Toast.makeText(this.A0A, A0F(21, 13, 1) + (i / 1000.0f) + A0F(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(com.facebook.ads.redexgen.core.JE je) {
        if (this.A01 == null) {
            return;
        }
        this.A01.A04(je, null);
    }

    private void A0P(com.facebook.ads.redexgen.core.InterfaceC0970Qt interfaceC0970Qt) {
        if (interfaceC0970Qt instanceof com.facebook.ads.redexgen.core.AbstractC1015Sm) {
            A0R((com.facebook.ads.redexgen.core.AbstractC1015Sm) interfaceC0970Qt);
        }
        interfaceC0970Qt.AHD(this);
    }

    private void A0Q(com.facebook.ads.redexgen.core.AbstractC1015Sm abstractC1015Sm) {
        if (abstractC1015Sm.getParent() == null) {
            if (abstractC1015Sm instanceof com.facebook.ads.redexgen.core.C7V) {
                this.A02.A00(abstractC1015Sm);
            } else {
                addView(abstractC1015Sm);
            }
        }
    }

    private void A0R(com.facebook.ads.redexgen.core.AbstractC1015Sm abstractC1015Sm) {
        if (abstractC1015Sm instanceof com.facebook.ads.redexgen.core.C7V) {
            this.A02.A01(abstractC1015Sm);
        } else {
            com.facebook.ads.redexgen.core.M3.A0J(abstractC1015Sm);
        }
    }

    private boolean A0S(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        return com.facebook.ads.redexgen.core.C0762Im.A2o(c1199Zs, com.facebook.ads.redexgen.core.RS.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0j()) {
            return;
        }
        this.A0D.A8o();
    }

    public final void A0X() {
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC0970Qt> it = this.A0C.iterator();
        while (it.hasNext()) {
            A0P(it.next());
        }
        this.A0C.clear();
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AH1(i);
    }

    public final void A0a(com.facebook.ads.redexgen.core.EnumC0964Qn enumC0964Qn) {
        com.facebook.ads.redexgen.core.T8 t8 = new com.facebook.ads.redexgen.core.T8(this);
        if (this.A06) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(t8);
        } else {
            this.A08.post(t8);
        }
        this.A0D.AGo(enumC0964Qn.A03());
    }

    public final void A0b(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs, int i) {
        if (this.A03 && this.A0D.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            this.A03 = false;
        }
        this.A0D.AGt(enumC0969Qs, i);
        if (A0F[7].charAt(27) == '4') {
            throw new java.lang.RuntimeException();
        }
        A0F[3] = "hMpnI8E";
    }

    public final void A0c(com.facebook.ads.redexgen.core.InterfaceC0970Qt interfaceC0970Qt) {
        this.A0C.add(interfaceC0970Qt);
    }

    public final void A0d(com.facebook.ads.redexgen.core.InterfaceC0970Qt interfaceC0970Qt) {
        this.A0C.remove(interfaceC0970Qt);
        A0P(interfaceC0970Qt);
    }

    public final void A0e(boolean z, int i) {
        if (A0j()) {
            return;
        }
        this.A0D.AEN(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A90();
    }

    public final boolean A0h() {
        return this.A0D.A91();
    }

    public final boolean A0i() {
        return getVolume() == 0.0f;
    }

    public final boolean A0j() {
        return getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A05;
    }

    public final boolean A0k() {
        return A0j() && this.A0D.A9a();
    }

    public final boolean A0l() {
        return getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A;
    }

    public final boolean A0m() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public final boolean A9R() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public final boolean A9U() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0985Ri
    public final void AC1(final long j, final long j2, final long j3, final float f) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1q(this.A0A)) {
            return;
        }
        this.A0B.A02(new com.facebook.ads.redexgen.core.AbstractC1014Sl(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.9Q
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0985Ri
    public final void ACe() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0985Ri
    public final void ACf() {
        A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0985Ri
    public final void ADW(int i, int i2) {
        com.facebook.ads.redexgen.core.T9 t9 = new com.facebook.ads.redexgen.core.T9(this, i, i2);
        if (this.A06) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(t9);
        } else {
            this.A08.post(t9);
        }
        A0H();
        if (A0F[3].length() == 1) {
            throw new java.lang.RuntimeException();
        }
        A0F[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0985Ri
    public final void AEA(com.facebook.ads.redexgen.core.EnumC0984Rh enumC0984Rh) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        com.facebook.ads.redexgen.core.TA ta = new com.facebook.ads.redexgen.core.TA(this, enumC0984Rh, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(ta);
        } else {
            this.A08.post(ta);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    public com.facebook.ads.redexgen.core.C05338w<com.facebook.ads.redexgen.core.AbstractC05348x, com.facebook.ads.redexgen.core.C05328v> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public com.facebook.ads.redexgen.core.EnumC0984Rh getState() {
        return this.A0D.getState();
    }

    public android.os.Handler getStateHandler() {
        return this.A08;
    }

    public android.view.TextureView getTextureView() {
        return (android.view.TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public android.view.View getVideoImplView() {
        return this.A0D.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public com.facebook.ads.redexgen.core.EnumC0969Qs getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public android.view.View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0961Qk
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(android.view.View view) {
        if (this.A0D != null) {
            this.A0D.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(com.facebook.ads.redexgen.core.JF jf) {
        this.A01 = jf;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(java.lang.String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(android.net.Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            if (A0F[2].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "2vtziZXFfU";
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(java.lang.String str) {
        this.A0A.A0E().A3V(str);
        setVideoURI(str != null ? com.facebook.ads.redexgen.core.L5.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(com.facebook.ads.redexgen.core.JE.A0l);
            this.A0A.A0E().A3Z();
        } else {
            A0L(com.facebook.ads.redexgen.core.JE.A0k);
            this.A0A.A0E().A3Y();
        }
        this.A0D.setRequestedVolume(f);
        getEventBus().A02(A0L);
    }
}
