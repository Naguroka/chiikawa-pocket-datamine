package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class Hct {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DE_MAX_ERROR = 1.0E-9f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private float chroma;
    private float hue;
    private float tone;

    public static com.google.android.material.color.Hct from(float f, float f2, float f3) {
        return new com.google.android.material.color.Hct(f, f2, f3);
    }

    public static com.google.android.material.color.Hct fromInt(int i) {
        com.google.android.material.color.Cam16 cam16FromInt = com.google.android.material.color.Cam16.fromInt(i);
        return new com.google.android.material.color.Hct(cam16FromInt.getHue(), cam16FromInt.getChroma(), com.google.android.material.color.ColorUtils.lstarFromInt(i));
    }

    private Hct(float f, float f2, float f3) {
        setInternalState(gamutMap(f, f2, f3));
    }

    public float getHue() {
        return this.hue;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getTone() {
        return this.tone;
    }

    public int toInt() {
        return gamutMap(this.hue, this.chroma, this.tone);
    }

    public void setHue(float f) {
        setInternalState(gamutMap(com.google.android.material.color.MathUtils.sanitizeDegrees(f), this.chroma, this.tone));
    }

    public void setChroma(float f) {
        setInternalState(gamutMap(this.hue, f, this.tone));
    }

    public void setTone(float f) {
        setInternalState(gamutMap(this.hue, this.chroma, f));
    }

    private void setInternalState(int i) {
        com.google.android.material.color.Cam16 cam16FromInt = com.google.android.material.color.Cam16.fromInt(i);
        float fLstarFromInt = com.google.android.material.color.ColorUtils.lstarFromInt(i);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = fLstarFromInt;
    }

    private static int gamutMap(float f, float f2, float f3) {
        return gamutMapInViewingConditions(f, f2, f3, com.google.android.material.color.ViewingConditions.DEFAULT);
    }

    static int gamutMapInViewingConditions(float f, float f2, float f3, com.google.android.material.color.ViewingConditions viewingConditions) {
        if (f2 < 1.0d || java.lang.Math.round(f3) <= 0.0d || java.lang.Math.round(f3) >= 100.0d) {
            return com.google.android.material.color.ColorUtils.intFromLstar(f3);
        }
        float fSanitizeDegrees = com.google.android.material.color.MathUtils.sanitizeDegrees(f);
        com.google.android.material.color.Cam16 cam16 = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (java.lang.Math.abs(f4 - f2) >= CHROMA_SEARCH_ENDPOINT) {
            com.google.android.material.color.Cam16 cam16FindCamByJ = findCamByJ(fSanitizeDegrees, f5, f3);
            if (!z) {
                if (cam16FindCamByJ == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    cam16 = cam16FindCamByJ;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (cam16FindCamByJ != null) {
                    return cam16FindCamByJ.viewed(viewingConditions);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        if (cam16 == null) {
            return com.google.android.material.color.ColorUtils.intFromLstar(f3);
        }
        return cam16.viewed(viewingConditions);
    }

    private static com.google.android.material.color.Cam16 findCamByJ(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        com.google.android.material.color.Cam16 cam16 = null;
        float f7 = 1000.0f;
        while (java.lang.Math.abs(f6 - f4) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int i = com.google.android.material.color.Cam16.fromJch(f8, f2, f).getInt();
            float fLstarFromInt = com.google.android.material.color.ColorUtils.lstarFromInt(i);
            float fAbs = java.lang.Math.abs(f3 - fLstarFromInt);
            if (fAbs < 0.2f) {
                com.google.android.material.color.Cam16 cam16FromInt = com.google.android.material.color.Cam16.fromInt(i);
                float fDistance = cam16FromInt.distance(com.google.android.material.color.Cam16.fromJch(cam16FromInt.getJ(), cam16FromInt.getChroma(), f));
                if (fDistance <= 1.0f && fDistance <= f5) {
                    cam16 = cam16FromInt;
                    f7 = fAbs;
                    f5 = fDistance;
                }
            }
            if (f7 == 0.0f && f5 < DE_MAX_ERROR) {
                break;
            }
            if (fLstarFromInt < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return cam16;
    }
}
