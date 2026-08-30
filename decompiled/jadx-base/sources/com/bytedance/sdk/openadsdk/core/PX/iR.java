package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    protected java.lang.String bX;
    protected com.iab.omid.library.bytedance2.adsession.media.VastProperties eqN;
    private final com.iab.omid.library.bytedance2.adsession.AdEvents ldr;
    private final com.iab.omid.library.bytedance2.adsession.AdSession zx;
    private boolean iR = false;
    protected boolean bg = false;
    protected int IL = 0;

    void IL(int i) {
    }

    void bg(float f, boolean z) {
    }

    public void bg(boolean z) {
    }

    public void bg(boolean z, float f) {
    }

    public iR(com.iab.omid.library.bytedance2.adsession.AdSession adSession, com.iab.omid.library.bytedance2.adsession.AdEvents adEvents, android.view.View view) {
        this.zx = adSession;
        this.ldr = adEvents;
        this.bX = adSession.getAdSessionId();
        bg(view);
    }

    void bg(android.view.View view) {
        com.iab.omid.library.bytedance2.adsession.AdSession adSession;
        if (view == null || (adSession = this.zx) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void bg(android.view.View view, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose) {
        com.iab.omid.library.bytedance2.adsession.AdSession adSession = this.zx;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean bg() {
        return this.bg;
    }

    public void bg(int i) {
        int i2;
        int i3;
        if (this.zx == null || this.ldr == null) {
            return;
        }
        boolean z = false;
        if (com.bytedance.sdk.openadsdk.core.PX.zx.bX()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (i3 = this.IL) != 0 && i3 != 4) {
                            this.zx.finish();
                            this.bg = false;
                            z = true;
                        }
                    } else if (!this.iR && ((i2 = this.IL) == 1 || i2 == 2)) {
                        this.ldr.impressionOccurred();
                        this.iR = true;
                        z = true;
                    }
                } else if (this.IL == 0) {
                    this.zx.start();
                    if (this.eqN == null) {
                        this.eqN = com.iab.omid.library.bytedance2.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(true, com.iab.omid.library.bytedance2.adsession.media.Position.STANDALONE);
                    }
                    this.ldr.loaded(this.eqN);
                    this.bg = true;
                    this.eqN = null;
                    z = true;
                }
            } else if (this.IL == 0) {
                this.zx.start();
                this.ldr.loaded();
                this.bg = true;
                z = true;
            }
        }
        if (z) {
            this.IL = i;
        }
    }

    void IL() {
        bg(1);
    }

    void bX() {
        bg(4);
    }

    public void eqN() {
        bg(3);
    }

    public void bg(java.util.Set<android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose>> set) {
        for (android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose> pair : set) {
            bg((android.view.View) pair.first, (com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose) pair.second);
        }
    }
}
