package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes4.dex */
public class PAGMediaView extends android.widget.FrameLayout {
    protected java.lang.Integer bg;

    public void close() {
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(android.content.Context context) {
        super(context);
    }

    public PAGMediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PAGMediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMrcTrackerKey(java.lang.Integer num) {
        this.bg = num;
    }
}
