package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public class DynamicColorsOptions {
    private static final com.google.android.material.color.DynamicColors.Precondition ALWAYS_ALLOW = new com.google.android.material.color.DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(android.app.Activity activity, int i) {
            return true;
        }
    };
    private static final com.google.android.material.color.DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new com.google.android.material.color.DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(android.app.Activity activity) {
        }
    };
    private final com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback;
    private final com.google.android.material.color.DynamicColors.Precondition precondition;
    private final int themeOverlay;

    private DynamicColorsOptions(com.google.android.material.color.DynamicColorsOptions.Builder builder) {
        this.themeOverlay = builder.themeOverlay;
        this.precondition = builder.precondition;
        this.onAppliedCallback = builder.onAppliedCallback;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    public com.google.android.material.color.DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    public com.google.android.material.color.DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    public static class Builder {
        private int themeOverlay;
        private com.google.android.material.color.DynamicColors.Precondition precondition = com.google.android.material.color.DynamicColorsOptions.ALWAYS_ALLOW;
        private com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback = com.google.android.material.color.DynamicColorsOptions.NO_OP_CALLBACK;

        public com.google.android.material.color.DynamicColorsOptions.Builder setThemeOverlay(int i) {
            this.themeOverlay = i;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setPrecondition(com.google.android.material.color.DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions.Builder setOnAppliedCallback(com.google.android.material.color.DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        public com.google.android.material.color.DynamicColorsOptions build() {
            return new com.google.android.material.color.DynamicColorsOptions(this);
        }
    }
}
