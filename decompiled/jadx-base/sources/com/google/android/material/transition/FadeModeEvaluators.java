package com.google.android.material.transition;

/* JADX INFO: loaded from: classes5.dex */
class FadeModeEvaluators {
    private static final com.google.android.material.transition.FadeModeEvaluator IN = new com.google.android.material.transition.FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public com.google.android.material.transition.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.FadeModeResult.endOnTop(255, com.google.android.material.transition.TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final com.google.android.material.transition.FadeModeEvaluator OUT = new com.google.android.material.transition.FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public com.google.android.material.transition.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.FadeModeResult.startOnTop(com.google.android.material.transition.TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    private static final com.google.android.material.transition.FadeModeEvaluator CROSS = new com.google.android.material.transition.FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public com.google.android.material.transition.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return com.google.android.material.transition.FadeModeResult.startOnTop(com.google.android.material.transition.TransitionUtils.lerp(255, 0, f2, f3, f), com.google.android.material.transition.TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final com.google.android.material.transition.FadeModeEvaluator THROUGH = new com.google.android.material.transition.FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public com.google.android.material.transition.FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return com.google.android.material.transition.FadeModeResult.startOnTop(com.google.android.material.transition.TransitionUtils.lerp(255, 0, f2, f5, f), com.google.android.material.transition.TransitionUtils.lerp(0, 255, f5, f3, f));
        }
    };

    static com.google.android.material.transition.FadeModeEvaluator get(int i, boolean z) {
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
