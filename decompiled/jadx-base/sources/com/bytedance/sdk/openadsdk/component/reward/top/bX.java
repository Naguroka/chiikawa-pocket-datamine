package com.bytedance.sdk.openadsdk.component.reward.top;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends android.view.View implements com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> {
    private com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bg;

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    public bX(android.content.Context context) {
        this(context, null);
    }

    public bX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public android.view.View getITopLayout() {
        java.lang.Object obj = this.bg;
        if (obj instanceof android.view.View) {
            return (android.view.View) obj;
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.bX bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (this.bg != null) {
            return this;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 topLayoutDislike2M717load = new com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2(getContext()).load(tuv);
        this.bg = topLayoutDislike2M717load;
        android.view.ViewParent parent = getParent();
        if (parent != null && (parent instanceof android.view.ViewGroup)) {
            bg(topLayoutDislike2M717load, (android.view.ViewGroup) parent);
        }
        return this;
    }

    private void bg(android.view.View view, android.view.ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(com.bytedance.sdk.openadsdk.utils.Ta.NU);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowSkip(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipEnable(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipInvisiable() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipText(java.lang.CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showCountDownText() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showSkipButton() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.showSkipButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowSound(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setTime(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowDislike(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setListener(com.bytedance.sdk.openadsdk.component.reward.top.IL il) {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.setListener(il);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void clickSkip() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void clickSound() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.clickSound();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showCloseButton() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            bgVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public android.view.View getCloseButton() {
        com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.bX> bgVar = this.bg;
        if (bgVar != null) {
            return bgVar.getCloseButton();
        }
        return null;
    }
}
