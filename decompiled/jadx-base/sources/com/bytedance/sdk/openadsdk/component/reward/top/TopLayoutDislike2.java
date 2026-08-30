package com.bytedance.sdk.openadsdk.component.reward.top;

/* JADX INFO: loaded from: classes4.dex */
public class TopLayoutDislike2 extends com.bytedance.sdk.openadsdk.core.zx.zx implements com.bytedance.sdk.openadsdk.component.reward.top.bg<com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private com.bytedance.sdk.openadsdk.core.zx.eqN mCloseBtn;
    private android.view.View mImgDislike;
    private android.widget.ImageView mImgSound;
    private boolean mIsSoundMute;
    private java.lang.CharSequence mProgressStr;
    private android.widget.ImageView mSkipIV;
    private android.widget.TextView mTextViewCountDown;
    private com.bytedance.sdk.openadsdk.component.reward.top.IL mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public void clickDislike() {
    }

    public TopLayoutDislike2(android.content.Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        setOrientation(0);
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        initView();
        this.mImgDislike.setVisibility(0);
        ((android.widget.ImageView) this.mImgDislike).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_reward_full_feedback"));
        if (!com.bytedance.sdk.openadsdk.core.settings.xxp.zU().yDt(java.lang.String.valueOf(tuv.IGR())) || tuv.vb() == 5 || tuv.vb() == 6) {
            this.mSkipIV.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = tuv.Dxa() == null ? 0 : ((int) tuv.Dxa().ldr()) * tuv.Dxa().tC();
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(tuv) && tuv.WR() != null) {
            this.videoDuration = (int) tuv.WR().IL();
        } else if (com.bytedance.sdk.openadsdk.core.model.xxp.eqN(tuv) && tuv.WR() != null) {
            this.videoDuration = (int) tuv.WR().eqN();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (tuv.Fx() == 8 && tuv.VW() != null) {
            this.skipTime = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(tuv.VW().getCodeId());
        } else {
            this.skipTime = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(tuv.VW().getCodeId());
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            this.skipTime = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(tuv.IGR()), tuv.fE());
            this.videoDuration = tuv.gtr();
        }
        int i = this.skipTime;
        this.shouldShowSkipTime = i == -1 || i >= this.videoDuration;
        if (tuv.HXG()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    private android.widget.ImageView getCommonRingBGImageView() {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(getContext());
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 5.0f);
        eqn.setPadding(iBX, iBX, iBX, iBX);
        eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        eqn.setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.bg());
        return eqn;
    }

    private void initView() {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 16.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 20.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(iBX3, iBX3);
        layoutParams.leftMargin = iBX;
        layoutParams.topMargin = iBX2;
        this.mImgSound.setLayoutParams(layoutParams);
        android.widget.ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(iBX3, iBX3);
        layoutParams2.topMargin = iBX2;
        layoutParams2.leftMargin = iBX;
        this.mImgDislike.setLayoutParams(layoutParams2);
        android.view.View view = new android.view.View(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(getContext());
        this.mTextViewCountDown = kg;
        kg.setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.IL());
        this.mTextViewCountDown.setId(520093714);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 28.0f));
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 20.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 16.0f);
        layoutParams2.rightMargin = iBX4;
        layoutParams4.rightMargin = iBX4;
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f);
        com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(iBX5, 0, iBX5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        this.mSkipIV = getCommonRingBGImageView();
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(iBX3, iBX3);
        layoutParams5.topMargin = iBX2;
        layoutParams5.rightMargin = iBX;
        this.mSkipIV.setLayoutParams(layoutParams5);
        this.mSkipIV.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqnIL = com.bytedance.sdk.openadsdk.core.widget.iR.IL(getContext());
        this.mCloseBtn = eqnIL;
        eqnIL.setId(520093708);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 20.0f);
        layoutParams6.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams6);
        this.mCloseBtn.setContentDescription(com.bytedance.sdk.component.utils.Fy.bg(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void initListener() {
        android.view.View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener != null) {
                        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener.bX(view2);
                    }
                }
            });
        }
        android.widget.ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    android.graphics.drawable.Drawable drawableBg;
                    com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 topLayoutDislike2 = com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this;
                    topLayoutDislike2.mIsSoundMute = !topLayoutDislike2.mIsSoundMute;
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mSkipIV != null) {
                        drawableBg = com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mIsSoundMute ? com.bytedance.sdk.component.utils.Fy.bX(com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.Fy.bX(com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableBg = com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mIsSoundMute ? com.bytedance.sdk.openadsdk.utils.Kg.bg(com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : com.bytedance.sdk.openadsdk.utils.Kg.bg(com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableBg);
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener != null) {
                        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener.IL(view2);
                    }
                }
            });
        }
        android.widget.ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener != null) {
                        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener.bg(view2);
                    }
                }
            });
        } else {
            android.widget.TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener != null) {
                            com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener.bg(view2);
                        }
                    }
                });
            }
        }
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.mCloseBtn;
        if (eqn != null) {
            eqn.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    if (com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener != null) {
                        com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.this.mTopListener.eqN(view2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowSkip(boolean z) {
        android.widget.TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (android.text.TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipEnable(boolean z) {
        android.widget.ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        android.widget.TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowSound(boolean z) {
        android.widget.ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSoundMute(boolean z) {
        android.graphics.drawable.Drawable drawableBg;
        this.mIsSoundMute = z;
        if (this.mSkipIV != null) {
            if (z) {
                drawableBg = com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_reward_full_mute");
            } else {
                drawableBg = com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            drawableBg = com.bytedance.sdk.openadsdk.utils.Kg.bg(getContext(), "tt_mute_wrapper");
        } else {
            drawableBg = com.bytedance.sdk.openadsdk.utils.Kg.bg(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableBg);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setTime(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        int i;
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((java.lang.Object) this.mProgressStr) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
            updateTime(false);
            return;
        }
        java.lang.String str = (java.lang.String) this.mProgressStr;
        try {
            int i2 = this.skipTime;
            if (i2 == 0) {
                i = java.lang.Integer.parseInt(str);
            } else {
                i = i2 - (this.videoDuration - java.lang.Integer.parseInt(str));
            }
            if (i > 0) {
                if (this.skipTime == 0) {
                    updateTime(false);
                    return;
                } else {
                    this.mTextViewCountDown.setText(i + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                    updateTime(true);
                    return;
                }
            }
            this.mTextViewCountDown.setText(((java.lang.Object) this.mProgressStr) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
            updateTime(false);
        } catch (java.lang.Exception unused) {
        }
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipText(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        android.widget.ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setShowDislike(boolean z) {
        android.view.View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setListener(com.bytedance.sdk.openadsdk.component.reward.top.IL il) {
        this.mTopListener = il;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void clickSkip() {
        android.widget.ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        android.widget.TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void clickSound() {
        android.widget.ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showSkipButton() {
        android.widget.ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public android.view.View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.bg
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }
}
