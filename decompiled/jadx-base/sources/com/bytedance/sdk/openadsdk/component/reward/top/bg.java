package com.bytedance.sdk.openadsdk.component.reward.top;

/* JADX INFO: loaded from: classes4.dex */
public interface bg<T extends android.view.View> {
    void clickSkip();

    void clickSound();

    android.view.View getCloseButton();

    void setListener(com.bytedance.sdk.openadsdk.component.reward.top.IL il);

    void setShowDislike(boolean z);

    void setShowSkip(boolean z);

    void setShowSound(boolean z);

    void setSkipEnable(boolean z);

    void setSkipInvisiable();

    void setSkipText(java.lang.CharSequence charSequence);

    void setSoundMute(boolean z);

    void setTime(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
