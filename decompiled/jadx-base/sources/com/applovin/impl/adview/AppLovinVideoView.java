package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinVideoView extends android.widget.VideoView {
    public AppLovinVideoView(android.content.Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i, int i2) {
        getHolder().setFixedSize(i, i2);
        requestLayout();
        invalidate();
    }
}
