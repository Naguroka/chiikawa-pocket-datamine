package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1230aN implements com.facebook.ads.redexgen.core.InterfaceC0851Me {
    public final /* synthetic */ com.facebook.ads.MediaViewListener A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1229aM A01;

    public C1230aN(com.facebook.ads.redexgen.core.C1229aM c1229aM, com.facebook.ads.MediaViewListener mediaViewListener) {
        this.A01 = c1229aM;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void ABZ() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void ABq() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void ABw() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void AC3() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void AC5() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void AD1() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void AEB() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0851Me
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
