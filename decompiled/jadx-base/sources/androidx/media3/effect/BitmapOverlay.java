package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapOverlay extends androidx.media3.effect.TextureOverlay {
    private final float[] flipVerticallyMatrix;
    private android.graphics.Bitmap lastBitmap;
    private int lastBitmapGenerationId;
    private int lastTextureId;

    public abstract android.graphics.Bitmap getBitmap(long j) throws androidx.media3.common.VideoFrameProcessingException;

    public BitmapOverlay() {
        float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        android.opengl.Matrix.scaleM(fArrCreate4x4IdentityMatrix, 0, 1.0f, -1.0f, 1.0f);
        this.flipVerticallyMatrix = fArrCreate4x4IdentityMatrix;
        this.lastTextureId = -1;
    }

    public static androidx.media3.effect.BitmapOverlay createStaticBitmapOverlay(final android.graphics.Bitmap bitmap) {
        return new androidx.media3.effect.BitmapOverlay() { // from class: androidx.media3.effect.BitmapOverlay.1
            @Override // androidx.media3.effect.BitmapOverlay
            public android.graphics.Bitmap getBitmap(long j) {
                return bitmap;
            }
        };
    }

    public static androidx.media3.effect.BitmapOverlay createStaticBitmapOverlay(final android.graphics.Bitmap bitmap, final androidx.media3.effect.OverlaySettings overlaySettings) {
        return new androidx.media3.effect.BitmapOverlay() { // from class: androidx.media3.effect.BitmapOverlay.2
            @Override // androidx.media3.effect.BitmapOverlay
            public android.graphics.Bitmap getBitmap(long j) {
                return bitmap;
            }

            @Override // androidx.media3.effect.TextureOverlay
            public androidx.media3.effect.OverlaySettings getOverlaySettings(long j) {
                return overlaySettings;
            }
        };
    }

    public static androidx.media3.effect.BitmapOverlay createStaticBitmapOverlay(final android.content.Context context, final android.net.Uri uri, final androidx.media3.effect.OverlaySettings overlaySettings) {
        return new androidx.media3.effect.BitmapOverlay() { // from class: androidx.media3.effect.BitmapOverlay.3
            private android.graphics.Bitmap lastBitmap;

            @Override // androidx.media3.effect.BitmapOverlay
            public android.graphics.Bitmap getBitmap(long j) throws androidx.media3.common.VideoFrameProcessingException {
                if (this.lastBitmap == null) {
                    try {
                        this.lastBitmap = new androidx.media3.datasource.DataSourceBitmapLoader(context).loadBitmap(uri).get();
                    } catch (java.lang.InterruptedException e) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new androidx.media3.common.VideoFrameProcessingException(e);
                    } catch (java.util.concurrent.ExecutionException e2) {
                        throw new androidx.media3.common.VideoFrameProcessingException(e2);
                    }
                }
                return this.lastBitmap;
            }

            @Override // androidx.media3.effect.TextureOverlay
            public androidx.media3.effect.OverlaySettings getOverlaySettings(long j) {
                return overlaySettings;
            }
        };
    }

    @Override // androidx.media3.effect.TextureOverlay
    public androidx.media3.common.util.Size getTextureSize(long j) {
        return new androidx.media3.common.util.Size(((android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkNotNull(this.lastBitmap)).getWidth(), ((android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkNotNull(this.lastBitmap)).getHeight());
    }

    @Override // androidx.media3.effect.TextureOverlay
    public int getTextureId(long j) throws androidx.media3.common.VideoFrameProcessingException {
        android.graphics.Bitmap bitmap = getBitmap(j);
        int generationId = bitmap.getGenerationId();
        if (bitmap != this.lastBitmap || generationId != this.lastBitmapGenerationId) {
            this.lastBitmap = bitmap;
            this.lastBitmapGenerationId = generationId;
            try {
                if (this.lastTextureId == -1) {
                    this.lastTextureId = androidx.media3.common.util.GlUtil.generateTexture();
                }
                androidx.media3.common.util.GlUtil.setTexture(this.lastTextureId, bitmap);
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                throw new androidx.media3.common.VideoFrameProcessingException(e);
            }
        }
        return this.lastTextureId;
    }

    @Override // androidx.media3.effect.TextureOverlay
    public float[] getVertexTransformation(long j) {
        return this.flipVerticallyMatrix;
    }

    @Override // androidx.media3.effect.TextureOverlay
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        this.lastBitmap = null;
        int i = this.lastTextureId;
        if (i != -1) {
            try {
                androidx.media3.common.util.GlUtil.deleteTexture(i);
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                throw new androidx.media3.common.VideoFrameProcessingException(e);
            }
        }
        this.lastTextureId = -1;
    }
}
