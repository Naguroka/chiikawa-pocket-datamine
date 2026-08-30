package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class DynamicRootView extends android.widget.FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.eqN, com.bytedance.sdk.component.adexpress.theme.bg {
    private java.lang.String bgColor;
    private java.util.Map<java.lang.Integer, java.lang.String> bgMaterialCenterCalcColor;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx dynamicBaseWidget;
    private int logoUnionHeight;
    private android.content.Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.ldr.bg mDynamicClickListener;
    boolean mIsMute;
    private com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.IL.VB mRenderListener;
    private com.bytedance.sdk.component.adexpress.IL.Ta mRenderRequest;
    private android.view.ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.IL muteListener;
    protected final com.bytedance.sdk.component.adexpress.IL.yDt renderResult;
    private int scoreCountWithIcon;
    private java.util.List<com.bytedance.sdk.component.adexpress.dynamic.bX> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.zx videoListener;
    public android.view.View videoView;

    public DynamicRootView(android.content.Context context, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.dynamic.ldr.bg bgVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new java.util.ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.IL.yDt ydt = new com.bytedance.sdk.component.adexpress.IL.yDt();
        this.renderResult = ydt;
        ydt.bg(2);
        this.mDynamicClickListener = bgVar;
        bgVar.bg(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.bg(this);
        this.mIsMute = z;
        this.mRenderRequest = ta;
    }

    public java.lang.String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(java.lang.String str) {
        this.bgColor = str;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.IL.VB vb) {
        this.mRenderListener = vb;
        this.mDynamicClickListener.bg(vb);
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, int i) {
        this.dynamicBaseWidget = renderDynamicView(kg, this, i);
        this.renderResult.bg(true);
        this.renderResult.bg(this.dynamicBaseWidget.zx);
        this.renderResult.IL(this.dynamicBaseWidget.ldr);
        this.renderResult.bg(this.videoView);
        this.mRenderListener.bg(this.renderResult);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, android.view.ViewGroup viewGroup, int i) {
        if (kg == null) {
            return null;
        }
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB = kg.VB();
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVarBg = com.bytedance.sdk.component.adexpress.dynamic.bg.IL.bg(this.mContext, this, kg);
        if (zxVarBg instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VW) {
            callBackRenderFail(i == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(kg);
        zxVarBg.bX();
        if (viewGroup != null) {
            viewGroup.addView(zxVarBg);
            setClipChildren(viewGroup, kg);
        }
        if (listVB == null || listVB.size() <= 0) {
            return null;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> it = listVB.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), zxVarBg, i);
        }
        return zxVarBg;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx;
        com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVarEo = kg.eo();
        if (zxVarEo == null || (ldrVarZx = zxVarEo.zx()) == null) {
            return;
        }
        this.renderResult.IL(ldrVarZx.mLT());
    }

    public java.util.Map<java.lang.Integer, java.lang.String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public void setBgMaterialCenterCalcColor(java.util.Map<java.lang.Integer, java.lang.String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    private void setClipChildren(android.view.ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        android.view.ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (android.view.ViewGroup) viewGroup.getParent()) == null || !kg.kMt()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.bX(d);
        this.renderResult.eqN(d2);
        this.renderResult.zx(d3);
        this.renderResult.ldr(d4);
        this.renderResult.bg(f);
        this.renderResult.IL(f);
        this.renderResult.bX(f);
        this.renderResult.eqN(f);
    }

    public void callBackRenderFail(int i, java.lang.String str) {
        this.renderResult.bg(false);
        this.renderResult.IL(i);
        this.renderResult.bg(str);
        this.mRenderListener.bg(this.renderResult);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.IL il) {
        this.muteListener = il;
    }

    public void setDislikeView(android.view.View view) {
        this.mDynamicClickListener.IL(view);
    }

    public com.bytedance.sdk.component.adexpress.IL.VB getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ldr.bg getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    private boolean checkSizeValid() {
        return this.dynamicBaseWidget.zx > 0.0f && this.dynamicBaseWidget.ldr > 0.0f;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.bg
    public void onThemeChanged(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar = this.dynamicBaseWidget;
        if (zxVar == null) {
            return;
        }
        zxVar.bg(i);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, int i) {
        if (zxVar == null) {
            return;
        }
        if (zxVar.getBeginInvisibleAndShow()) {
            zxVar.setVisibility(i);
            if (zxVar.Lq != null) {
                zxVar.Lq.setVisibility(i);
            }
        }
        int childCount = zxVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (zxVar.getChildAt(i2) instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx) {
                beginShowFromInvisible((com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx) zxVar.getChildAt(i2), i);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTime(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).bg(charSequence, i == 1, i2, z);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.IL il = this.muteListener;
        if (il != null) {
            il.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void onvideoComplate() {
        try {
            this.videoListener.bg();
        } catch (java.lang.Exception unused) {
        }
    }

    public android.view.ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public void setTimeOut(android.view.ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public int getTimedown() {
        return this.timedown;
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.dynamic.bX> getTimeOutListener() {
        return this.timeOutListener;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.bX bXVar) {
        this.timeOutListener.add(bXVar);
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.zx zxVar) {
        this.videoListener = zxVar;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public com.bytedance.sdk.component.adexpress.IL.Ta getRenderRequest() {
        return this.mRenderRequest;
    }
}
