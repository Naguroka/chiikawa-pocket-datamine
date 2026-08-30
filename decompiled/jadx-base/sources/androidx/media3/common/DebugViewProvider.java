package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface DebugViewProvider {
    public static final androidx.media3.common.DebugViewProvider NONE = new androidx.media3.common.DebugViewProvider() { // from class: androidx.media3.common.DebugViewProvider$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.DebugViewProvider
        public final android.view.SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            return androidx.media3.common.DebugViewProvider.lambda$static$0(i, i2);
        }
    };

    static /* synthetic */ android.view.SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    android.view.SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
