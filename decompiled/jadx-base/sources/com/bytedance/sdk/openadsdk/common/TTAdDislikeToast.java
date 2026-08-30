package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.zx.bX {
    private static java.lang.String sDislikeSendTip;
    private static java.lang.String sDislikeTip;
    private static java.lang.String sSkipText;
    private final android.os.Handler mHandler;
    private android.widget.TextView mTextView;

    public TTAdDislikeToast(android.content.Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static java.lang.String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static java.lang.String getSkipText() {
        if (sSkipText == null) {
            sSkipText = com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    public static java.lang.String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            sDislikeSendTip = com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static void onResourceUpdated() {
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        sSkipText = com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_reward_screen_skip_tx");
        sDislikeTip = com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_feedback_submit_text");
        sDislikeSendTip = com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.Fy.bg(contextBg, "tt_feedback_experience_text");
    }

    private void initToast(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 75.0f);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 16.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 12.0f);
        this.mTextView.setPadding(iBX, iBX2, iBX, iBX2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(androidx.core.view.GravityCompat.START);
        android.graphics.drawable.Drawable drawableBX = com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_dislike_toast");
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 16.0f);
        drawableBX.setBounds(0, 0, iBX3, iBX3);
        this.mTextView.setCompoundDrawablePadding(iBX3 / 2);
        this.mTextView.setCompoundDrawables(drawableBX, null, null, null);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(android.graphics.Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public void show(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.this.mTextView != null) {
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.this.mTextView.setText(java.lang.String.valueOf(str));
                }
                com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
