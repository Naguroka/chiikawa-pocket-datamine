package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public class AMoAdNativeViewCoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.amoad.AMoAdNativeViewCoder.TouchType f145a = com.amoad.AMoAdNativeViewCoder.TouchType.SingleTap;

    public enum TouchType {
        SingleTap,
        DoubleTap
    }

    public com.amoad.AMoAdNativeViewCoder.TouchType getTouchType() {
        return this.f145a;
    }

    public void setTouchType(com.amoad.AMoAdNativeViewCoder.TouchType touchType) {
        this.f145a = touchType;
    }
}
