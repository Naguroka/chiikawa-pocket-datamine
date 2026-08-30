package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class GlTextureInfo {
    public static final androidx.media3.common.GlTextureInfo UNSET = new androidx.media3.common.GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public GlTextureInfo(int i, int i2, int i3, int i4, int i5) {
        this.texId = i;
        this.fboId = i2;
        this.rboId = i3;
        this.width = i4;
        this.height = i5;
    }

    public void release() throws androidx.media3.common.util.GlUtil.GlException {
        int i = this.texId;
        if (i != -1) {
            androidx.media3.common.util.GlUtil.deleteTexture(i);
        }
        int i2 = this.fboId;
        if (i2 != -1) {
            androidx.media3.common.util.GlUtil.deleteFbo(i2);
        }
        int i3 = this.rboId;
        if (i3 != -1) {
            androidx.media3.common.util.GlUtil.deleteRbo(i3);
        }
    }
}
