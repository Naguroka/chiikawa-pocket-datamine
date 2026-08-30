package com.google.android.material.animation;

/* JADX INFO: loaded from: classes5.dex */
public class ImageMatrixProperty extends android.util.Property<android.widget.ImageView, android.graphics.Matrix> {
    private final android.graphics.Matrix matrix;

    public ImageMatrixProperty() {
        super(android.graphics.Matrix.class, "imageMatrixProperty");
        this.matrix = new android.graphics.Matrix();
    }

    @Override // android.util.Property
    public void set(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    @Override // android.util.Property
    public android.graphics.Matrix get(android.widget.ImageView imageView) {
        this.matrix.set(imageView.getImageMatrix());
        return this.matrix;
    }
}
