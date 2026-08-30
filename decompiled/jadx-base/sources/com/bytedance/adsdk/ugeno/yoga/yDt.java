package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class yDt extends com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase {
    protected void finalize() throws java.lang.Throwable {
        try {
            PX();
        } finally {
            super.finalize();
        }
    }

    public void PX() {
        if (this.bg != 0) {
            long j = this.bg;
            this.bg = 0L;
            com.bytedance.adsdk.ugeno.yoga.YogaNative.jni_YGNodeDeallocateJNI(j);
        }
    }
}
