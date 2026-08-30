package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    static com.google.android.material.shape.CornerTreatment createCornerTreatment(int i) {
        if (i == 0) {
            return new com.google.android.material.shape.RoundedCornerTreatment();
        }
        if (i == 1) {
            return new com.google.android.material.shape.CutCornerTreatment();
        }
        return createDefaultCornerTreatment();
    }

    static com.google.android.material.shape.CornerTreatment createDefaultCornerTreatment() {
        return new com.google.android.material.shape.RoundedCornerTreatment();
    }

    static com.google.android.material.shape.EdgeTreatment createDefaultEdgeTreatment() {
        return new com.google.android.material.shape.EdgeTreatment();
    }

    public static void setElevation(android.view.View view, float f) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof com.google.android.material.shape.MaterialShapeDrawable) {
            ((com.google.android.material.shape.MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public static void setParentAbsoluteElevation(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof com.google.android.material.shape.MaterialShapeDrawable) {
            setParentAbsoluteElevation(view, (com.google.android.material.shape.MaterialShapeDrawable) background);
        }
    }

    public static void setParentAbsoluteElevation(android.view.View view, com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(view));
        }
    }
}
