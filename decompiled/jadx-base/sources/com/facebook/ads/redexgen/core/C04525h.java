package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04525h implements com.facebook.ads.internal.api.MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final java.lang.String A0I;
    public com.facebook.ads.MediaViewVideoRenderer A00;
    public com.facebook.ads.VideoAutoplayBehavior A01;
    public com.facebook.ads.redexgen.core.C1199Zs A03;
    public com.facebook.ads.redexgen.core.JR A04;
    public com.facebook.ads.redexgen.core.C0606Bu A05;
    public boolean A06;
    public boolean A07;
    public com.facebook.ads.NativeAd A08;
    public final com.facebook.ads.redexgen.core.R9 A0D = new com.facebook.ads.redexgen.core.FJ(this);
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A0C = new com.facebook.ads.redexgen.core.FB(this);
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A0B = new com.facebook.ads.redexgen.core.FA(this);
    public final com.facebook.ads.redexgen.core.R1 A0E = new com.facebook.ads.redexgen.core.F3(this);
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A09 = new com.facebook.ads.redexgen.core.Es(this);
    public final com.facebook.ads.redexgen.core.AbstractC0956Qf A0F = new com.facebook.ads.redexgen.core.Em(this);
    public final com.facebook.ads.redexgen.core.AbstractC1010Sh A0A = new com.facebook.ads.redexgen.core.C0671El(this);
    public com.facebook.ads.redexgen.core.C5Y A02 = new com.facebook.ads.redexgen.core.C5Y();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{31, 56, 32, 55, 58, okio.Utf8.REPLACEMENT_BYTE, 50, 118, 0, okio.Utf8.REPLACEMENT_BYTE, 51, 33, 118, 53, 57, 56, 37, 34, 36, 35, 53, 34, 57, 36, 118, 38, 55, 36, 55, 59, 37, 118, 34, 47, 38, 51, 120, 126, 72, 72, 70, 68, 67, 74, 13, 64, 88, 94, 89, 13, 79, 72, 13, 93, 95, 72, 78, 72, 73, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 1, 13, 76, 67, 73, 13, 75, 66, 65, 65, 66, 90, 72, 73, 13, 79, 84, 13, 76, 13, 78, 76, 65, 65, 13, 89, 66, 13, 73, 68, 94, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 3, 38, 43, 49, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 98, 33, 35, 46, 46, 39, 38, 98, 53, 43, 54, 42, 45, 55, 54, 98, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 108, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 41, 106, 104, 101, 101, 108, 109, 41, 126, 96, 125, 97, 102, 124, 125, 41, 109, 96, 122, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 39};
    }

    static {
        A02();
        A0I = com.facebook.ads.MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((android.net.Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.W7.A0L(this.A08.getInternalNativeAd()).A1e(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.JR jr = this.A04;
            if (A0H[6].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            A0H[6] = "qaG";
            jr.AHF();
        }
    }

    public final void A04(com.facebook.ads.NativeAd nativeAd) {
        this.A08 = nativeAd;
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA11 = ((com.facebook.ads.redexgen.core.W7) nativeAd.getInternalNativeAd()).A11();
        com.facebook.ads.redexgen.core.C1199Zs adObjectContext = this.A03;
        adObjectContext.A0K(c1199ZsA11);
        com.facebook.ads.redexgen.core.C04555k c04555k = (com.facebook.ads.redexgen.core.C04555k) nativeAd.getNativeAdApi();
        this.A05.setClientToken(com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd()).A1B());
        this.A05.setVideoMPD(c04555k.A01());
        this.A05.setVideoURI(c04555k.A02());
        com.facebook.ads.redexgen.core.C1358cU c1358cUA0y = com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd()).A0y();
        if (c1358cUA0y != null) {
            this.A05.setVideoProgressReportIntervalMs(c1358cUA0y.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c04555k.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AGY(nativeAd);
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.J7 j7) {
        this.A05.setAdEventManager(j7);
    }

    public final void A06(com.facebook.ads.redexgen.core.JR jr) {
        this.A04 = jr;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC0851Me interfaceC0851Me) {
        this.A05.setListener(interfaceC0851Me);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0V();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(com.facebook.ads.VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                java.lang.String str = A0I;
                java.lang.String strA01 = A01(127, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                android.util.Log.w(str, strA01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0b(com.facebook.ads.redexgen.core.AbstractC0846Lz.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                android.util.Log.w(A0I, A01(org.objectweb.asm.Opcodes.GOTO, 40, 10));
            }
        } else {
            this.A06 = true;
            this.A07 = com.facebook.ads.redexgen.core.EnumC0984Rh.A0A.equals(this.A05.getState());
            this.A05.A0e(false, 1);
            this.A00.onSeekEngaged();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final android.view.View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer) {
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA03;
        this.A00 = mediaViewVideoRenderer;
        android.content.Context context = adViewConstructorParams.getContext();
        if (context instanceof com.facebook.ads.redexgen.core.C1199Zs) {
            c1199ZsA03 = (com.facebook.ads.redexgen.core.C1199Zs) context;
        } else {
            c1199ZsA03 = com.facebook.ads.redexgen.core.C04465b.A03(context);
        }
        this.A03 = c1199ZsA03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new com.facebook.ads.redexgen.core.C0606Bu(c1199ZsA03);
                break;
            case 1:
                this.A05 = new com.facebook.ads.redexgen.core.C0606Bu(c1199ZsA03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new com.facebook.ads.redexgen.core.C0606Bu(c1199ZsA03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new com.facebook.ads.redexgen.core.C0606Bu(c1199ZsA03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new java.lang.IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        com.facebook.ads.redexgen.core.LU.A04(this.A05, com.facebook.ads.redexgen.core.LU.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0e(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(com.facebook.ads.VideoStartReason videoStartReason) {
        this.A05.A0b(com.facebook.ads.redexgen.core.AbstractC0846Lz.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i) {
        if (!this.A06) {
            boolean zIsDebugBuild = com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild();
            java.lang.String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (zIsDebugBuild) {
                android.util.Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0Y(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            return false;
        }
        return this.A01 == com.facebook.ads.VideoAutoplayBehavior.ON || this.A01 == com.facebook.ads.VideoAutoplayBehavior.DEFAULT;
    }
}
