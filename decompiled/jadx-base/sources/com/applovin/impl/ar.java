package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f631a;
    private final com.applovin.impl.sdk.n b;
    private final android.view.View c;

    public long a(com.applovin.impl.me meVar) {
        long j;
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("ViewabilityTracker", "Checking visibility...");
        }
        android.graphics.Point pointB = com.applovin.impl.z3.b(this.c.getContext());
        if (this.c.isShown()) {
            j = 0;
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.c.getAlpha() < meVar.f0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        android.view.animation.Animation animation = this.c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.c.getParent() == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getWidth());
        if (iPxToDp < java.lang.Math.min(meVar.l0(), pointB.x)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = com.applovin.sdk.AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getHeight());
        if (iPxToDp2 < meVar.h0()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.c.getLocationOnScreen(iArr);
        int i = iArr[0];
        android.graphics.Rect rect2 = new android.graphics.Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + this.c.getHeight());
        if (!android.graphics.Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        android.app.Activity activityB = this.f631a.e().b();
        if (activityB != null && !com.applovin.impl.zq.a(this.c, activityB)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("ViewabilityTracker", "Returning flags: " + java.lang.Long.toBinaryString(j));
        }
        return j;
    }

    public ar(android.view.View view, com.applovin.impl.sdk.j jVar) {
        this.f631a = jVar;
        this.b = jVar.I();
        this.c = view;
    }
}
