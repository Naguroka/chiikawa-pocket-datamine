package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    static com.google.android.material.transition.platform.FadeModeResult startOnTop(int i, int i2) {
        return new com.google.android.material.transition.platform.FadeModeResult(i, i2, false);
    }

    static com.google.android.material.transition.platform.FadeModeResult endOnTop(int i, int i2) {
        return new com.google.android.material.transition.platform.FadeModeResult(i, i2, true);
    }

    private FadeModeResult(int i, int i2, boolean z) {
        this.startAlpha = i;
        this.endAlpha = i2;
        this.endOnTop = z;
    }
}
