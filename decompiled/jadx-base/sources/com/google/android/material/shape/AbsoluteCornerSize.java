package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public final class AbsoluteCornerSize implements com.google.android.material.shape.CornerSize {
    private final float size;

    public AbsoluteCornerSize(float f) {
        this.size = f;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(android.graphics.RectF rectF) {
        return this.size;
    }

    public float getCornerSize() {
        return this.size;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.material.shape.AbsoluteCornerSize) && this.size == ((com.google.android.material.shape.AbsoluteCornerSize) obj).size;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.size)});
    }
}
