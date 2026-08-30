package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceInfo {
    public final int height;
    public final int orientationDegrees;
    public final android.view.Surface surface;
    public final int width;

    public SurfaceInfo(android.view.Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public SurfaceInfo(android.view.Surface surface, int i, int i2, int i3) {
        androidx.media3.common.util.Assertions.checkArgument(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i;
        this.height = i2;
        this.orientationDegrees = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.SurfaceInfo)) {
            return false;
        }
        androidx.media3.common.SurfaceInfo surfaceInfo = (androidx.media3.common.SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees;
    }
}
