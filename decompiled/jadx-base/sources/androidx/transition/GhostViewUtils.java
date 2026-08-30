package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class GhostViewUtils {
    static androidx.transition.GhostView addGhost(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            return androidx.transition.GhostViewPlatform.addGhost(view, viewGroup, matrix);
        }
        return androidx.transition.GhostViewPort.addGhost(view, viewGroup, matrix);
    }

    static void removeGhost(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            androidx.transition.GhostViewPlatform.removeGhost(view);
        } else {
            androidx.transition.GhostViewPort.removeGhost(view);
        }
    }

    private GhostViewUtils() {
    }
}
