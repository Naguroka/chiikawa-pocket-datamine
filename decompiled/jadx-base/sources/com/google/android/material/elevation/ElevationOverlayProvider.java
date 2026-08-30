package com.google.android.material.elevation;

/* JADX INFO: loaded from: classes5.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) java.lang.Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(android.content.Context context) {
        this(com.google.android.material.resources.MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.elevationOverlayEnabled, false), com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.elevationOverlayColor, 0), com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.elevationOverlayAccentColor, 0), com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z, int i, int i2, int i3, float f) {
        this.elevationOverlayEnabled = z;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i2;
        this.colorSurface = i3;
        this.displayDensity = f;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, android.view.View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.colorSurface, f);
    }

    public int compositeOverlayIfNeeded(int i, float f, android.view.View view) {
        return compositeOverlayIfNeeded(i, f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i, float f) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    public int compositeOverlay(int i, float f, android.view.View view) {
        return compositeOverlay(i, f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlay(int i, float f) {
        int i2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iAlpha = android.graphics.Color.alpha(i);
        int iLayer = com.google.android.material.color.MaterialColors.layer(androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i2 = this.elevationOverlayAccentColor) != 0) {
            iLayer = com.google.android.material.color.MaterialColors.layer(iLayer, androidx.core.graphics.ColorUtils.setAlphaComponent(i2, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return androidx.core.graphics.ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    public int calculateOverlayAlpha(float f) {
        return java.lang.Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        float f2 = this.displayDensity;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return java.lang.Math.min(((((float) java.lang.Math.log1p(f / f2)) * FORMULA_MULTIPLIER) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public float getParentAbsoluteElevation(android.view.View view) {
        return com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(view);
    }

    private boolean isThemeSurfaceColor(int i) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255) == this.colorSurface;
    }
}
