package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bX extends com.bytedance.sdk.openadsdk.core.zx.iR {
    com.bytedance.sdk.openadsdk.core.zx.bX IL;
    final com.bytedance.sdk.openadsdk.component.WR.iR Kg;
    com.bytedance.sdk.openadsdk.core.widget.bX PX;
    com.bytedance.sdk.openadsdk.core.zx.Kg VB;
    com.bytedance.sdk.openadsdk.core.widget.VzQ WR;
    com.bytedance.sdk.openadsdk.core.zx.eqN bX;
    com.bytedance.sdk.openadsdk.core.zx.eqN bg;
    com.bytedance.sdk.openadsdk.core.zx.Kg eo;
    com.bytedance.sdk.openadsdk.core.widget.PAGLogoView eqN;
    com.bytedance.sdk.openadsdk.core.zx.Kg iR;
    com.bytedance.sdk.openadsdk.core.widget.VzQ ldr;
    com.bytedance.sdk.openadsdk.core.zx.Kg zx;

    public abstract com.bytedance.sdk.openadsdk.core.zx.eqN getAdIconView();

    public abstract com.bytedance.sdk.openadsdk.core.zx.Kg getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.zx.zx getOverlayLayout() {
        return null;
    }

    public abstract com.bytedance.sdk.openadsdk.core.widget.xxp getScoreBar();

    public abstract android.view.View getUserInfo();

    public bX(android.content.Context context) {
        super(context);
        this.Kg = new com.bytedance.sdk.openadsdk.component.WR.iR(context);
    }

    public com.bytedance.sdk.openadsdk.core.widget.VzQ getIconOnlyView() {
        return this.WR;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getTitle() {
        return this.eo;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getContent() {
        return this.VB;
    }

    public com.bytedance.sdk.openadsdk.core.zx.eqN getBackImage() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.zx.bX getVideoContainer() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.zx.eqN getImageView() {
        return this.bX;
    }

    public com.bytedance.sdk.openadsdk.core.widget.PAGLogoView getAdLogo() {
        return this.eqN;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getClickButton() {
        return this.zx;
    }

    public com.bytedance.sdk.openadsdk.core.widget.VzQ getHostAppIcon() {
        return this.ldr;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getHostAppName() {
        return this.iR;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bX getDspAdChoice() {
        return this.PX;
    }

    public android.view.View getTopDisLike() {
        com.bytedance.sdk.openadsdk.component.WR.iR iRVar = this.Kg;
        if (iRVar != null) {
            return iRVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.zx.eqN getTopSkip() {
        com.bytedance.sdk.openadsdk.component.WR.iR iRVar = this.Kg;
        if (iRVar != null) {
            return iRVar.getTopSkip();
        }
        return null;
    }
}
