package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class SingleColorLut implements androidx.media3.effect.ColorLut {
    private final android.graphics.Bitmap lut;
    private int lutTextureId = -1;

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public static androidx.media3.effect.SingleColorLut createFromCube(int[][][] iArr) {
        boolean z;
        if (iArr.length > 0) {
            int[][] iArr2 = iArr[0];
            if (iArr2.length <= 0 || iArr2[0].length <= 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z, "LUT must have three dimensions.");
        int length = iArr.length;
        int[][] iArr3 = iArr[0];
        androidx.media3.common.util.Assertions.checkArgument(length == iArr3.length && iArr.length == iArr3[0].length, androidx.media3.common.util.Util.formatInvariant("All three dimensions of a LUT must match, received %d x %d x %d.", java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(iArr[0].length), java.lang.Integer.valueOf(iArr[0][0].length)));
        return new androidx.media3.effect.SingleColorLut(transformCubeIntoBitmap(iArr));
    }

    public static androidx.media3.effect.SingleColorLut createFromBitmap(android.graphics.Bitmap bitmap) {
        androidx.media3.common.util.Assertions.checkArgument(bitmap.getWidth() * bitmap.getWidth() == bitmap.getHeight(), androidx.media3.common.util.Util.formatInvariant("LUT needs to be in a N x N^2 format, received %d x %d.", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight())));
        androidx.media3.common.util.Assertions.checkArgument(bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888, "Color representation needs to be ARGB_8888.");
        return new androidx.media3.effect.SingleColorLut(bitmap);
    }

    private SingleColorLut(android.graphics.Bitmap bitmap) {
        this.lut = bitmap;
    }

    private static android.graphics.Bitmap transformCubeIntoBitmap(int[][][] iArr) {
        int length = iArr.length;
        int i = length * length;
        int[] iArr2 = new int[i * length];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr2[(((length * i2) + i3) * length) + i4] = iArr[i2][i3][i4];
                }
            }
        }
        return android.graphics.Bitmap.createBitmap(iArr2, length, i, android.graphics.Bitmap.Config.ARGB_8888);
    }

    @Override // androidx.media3.effect.ColorLut
    public int getLutTextureId(long j) {
        androidx.media3.common.util.Assertions.checkState(this.lutTextureId != -1, "The LUT has not been stored as a texture in OpenGL yet. You must to call #toGlShaderProgram() first.");
        return this.lutTextureId;
    }

    @Override // androidx.media3.effect.ColorLut
    public int getLength(long j) {
        return this.lut.getWidth();
    }

    @Override // androidx.media3.effect.ColorLut
    public void release() throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.GlUtil.deleteTexture(this.lutTextureId);
    }

    @Override // androidx.media3.effect.ColorLut, androidx.media3.effect.GlEffect
    public androidx.media3.effect.BaseGlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkState(!z, "HDR is currently not supported.");
        try {
            this.lutTextureId = androidx.media3.common.util.GlUtil.createTexture(this.lut);
            return new androidx.media3.effect.ColorLutShaderProgram(context, this, z);
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException("Could not store the LUT as a texture.", e);
        }
    }
}
