package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.core.PX.iR {
    private boolean ldr;
    private final com.iab.omid.library.bytedance2.adsession.media.MediaEvents zx;

    public WR(com.iab.omid.library.bytedance2.adsession.AdSession adSession, com.iab.omid.library.bytedance2.adsession.AdEvents adEvents, android.view.View view, com.iab.omid.library.bytedance2.adsession.media.MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.zx = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.iR
    public void bg(boolean z, float f) {
        if (z) {
            this.eqN = com.iab.omid.library.bytedance2.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, true, com.iab.omid.library.bytedance2.adsession.media.Position.STANDALONE);
        } else {
            this.eqN = com.iab.omid.library.bytedance2.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(true, com.iab.omid.library.bytedance2.adsession.media.Position.STANDALONE);
        }
        bg(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.iR
    public void bg(float f, boolean z) {
        if (bg()) {
            this.zx.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.iR
    public void bg(boolean z) {
        this.ldr = z;
        IL(12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.PX.iR
    public void IL(int i) {
        if (bg()) {
            switch (i) {
                case 0:
                    this.zx.pause();
                    break;
                case 1:
                    this.zx.resume();
                    break;
                case 2:
                case 14:
                    this.zx.skipped();
                    break;
                case 4:
                    this.zx.bufferStart();
                    break;
                case 5:
                    this.zx.bufferFinish();
                    break;
                case 6:
                    this.zx.firstQuartile();
                    break;
                case 7:
                    this.zx.midpoint();
                    break;
                case 8:
                    this.zx.thirdQuartile();
                    break;
                case 9:
                    this.zx.complete();
                    break;
                case 10:
                    this.zx.playerStateChange(com.iab.omid.library.bytedance2.adsession.media.PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.zx.playerStateChange(com.iab.omid.library.bytedance2.adsession.media.PlayerState.NORMAL);
                    break;
                case 12:
                    this.zx.volumeChange(this.ldr ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.zx.adUserInteraction(com.iab.omid.library.bytedance2.adsession.media.InteractionType.CLICK);
                    break;
            }
        }
    }
}
