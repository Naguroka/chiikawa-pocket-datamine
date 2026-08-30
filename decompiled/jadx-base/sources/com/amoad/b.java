package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static com.amoad.b f266a = new com.amoad.b(com.amoad.AMoAdPlacement.TOP_RIGHT, com.amoad.AMoAdButtonType.MEDIUM, 1.0f);
    final com.amoad.AMoAdPlacement b;
    final com.amoad.AMoAdButtonType c;
    final float d;

    b(com.amoad.AMoAdPlacement aMoAdPlacement, com.amoad.AMoAdButtonType aMoAdButtonType, float f) {
        this.b = aMoAdPlacement;
        this.c = aMoAdButtonType;
        this.d = f <= 0.0f ? 1.0f : f;
    }
}
