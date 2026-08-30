package com.google.android.material.transition.platform;

/* JADX INFO: loaded from: classes5.dex */
class FadeModeEvaluators {
    private static final com.google.android.material.transition.platform.FadeModeEvaluator IN = new com.google.android.material.transition.platform.FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public com.google.android.material.transition.platform.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.platform.FadeModeResult.endOnTop(255, com.google.android.material.transition.platform.TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final com.google.android.material.transition.platform.FadeModeEvaluator OUT = new com.google.android.material.transition.platform.FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public com.google.android.material.transition.platform.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.platform.FadeModeResult.startOnTop(com.google.android.material.transition.platform.TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    private static final com.google.android.material.transition.platform.FadeModeEvaluator CROSS = new com.google.android.material.transition.platform.FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public com.google.android.material.transition.platform.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.platform.FadeModeResult.startOnTop(com.google.android.material.transition.platform.TransitionUtils.lerp(255, 0, f2, f3, f), com.google.android.material.transition.platform.TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final com.google.android.material.transition.platform.FadeModeEvaluator THROUGH = new com.google.android.material.transition.platform.FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public com.google.android.material.transition.platform.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return com.google.android.material.transition.platform.FadeModeResult.startOnTop(com.google.android.material.transition.platform.TransitionUtils.lerp(255, 0, f2, f5, f), com.google.android.material.transition.platform.TransitionUtils.lerp(0, 255, f5, f3, f));
        }
    };

    static com.google.android.material.transition.platform.FadeModeEvaluator get(int i, boolean z) {
        if (i == 0) {
            return z ? IN : OUT;
        }
        if (i == 1) {
            return z ? OUT : IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new java.lang.IllegalArgumentException("Invalid fade mode: " + i);
    }

    private FadeModeEvaluators() {
    }
}
