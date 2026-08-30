package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public final class RelativeCornerSize implements com.google.android.material.shape.CornerSize {
    private final float percent;

    public RelativeCornerSize(float f) {
        this.percent = f;
    }

    public float getRelativePercent() {
        return this.percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(android.graphics.RectF rectF) {
        return this.percent * rectF.height();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.shape.RelativeCornerSize) && this.percent == ((com.google.android.material.shape.RelativeCornerSize) obj).percent;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.percent)});
    }
}
