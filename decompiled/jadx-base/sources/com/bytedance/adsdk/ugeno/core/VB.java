package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public enum VB {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17);

    private java.lang.String Fy;
    private int LZ;

    VB(java.lang.String str, int i) {
        this.Fy = str;
        this.LZ = i;
    }

    public int bg() {
        return this.LZ;
    }

    public static com.bytedance.adsdk.ugeno.core.VB bg(java.lang.String str) {
        for (com.bytedance.adsdk.ugeno.core.VB vb : values()) {
            if (vb.Fy.equals(str)) {
                return vb;
            }
        }
        return UNKNOWN_EVENT;
    }
}
