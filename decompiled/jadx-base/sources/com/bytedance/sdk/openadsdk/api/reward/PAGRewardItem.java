package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes4.dex */
public class PAGRewardItem {
    private final java.lang.String IL;
    private final int bg;

    public PAGRewardItem(int i, java.lang.String str) {
        this.bg = i;
        this.IL = str;
    }

    public int getRewardAmount() {
        return this.bg;
    }

    public java.lang.String getRewardName() {
        return this.IL;
    }
}
