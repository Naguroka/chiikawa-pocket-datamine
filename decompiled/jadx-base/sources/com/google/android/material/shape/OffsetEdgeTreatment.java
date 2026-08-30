package com.google.android.material.shape;

/* JADX INFO: loaded from: classes5.dex */
public final class OffsetEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final float offset;
    private final com.google.android.material.shape.EdgeTreatment other;

    public OffsetEdgeTreatment(com.google.android.material.shape.EdgeTreatment edgeTreatment, float f) {
        this.other = edgeTreatment;
        this.offset = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, com.google.android.material.shape.ShapePath shapePath) {
        this.other.getEdgePath(f, f2 - this.offset, f3, shapePath);
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
        return this.other.forceIntersection();
    }
}
