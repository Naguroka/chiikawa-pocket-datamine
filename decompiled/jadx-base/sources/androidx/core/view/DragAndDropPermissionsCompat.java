package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private final android.view.DragAndDropPermissions mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(android.view.DragAndDropPermissions dragAndDropPermissions) {
        this.mDragAndDropPermissions = dragAndDropPermissions;
    }

    public static androidx.core.view.DragAndDropPermissionsCompat request(android.app.Activity activity, android.view.DragEvent dragEvent) {
        android.view.DragAndDropPermissions dragAndDropPermissionsRequestDragAndDropPermissions = androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.requestDragAndDropPermissions(activity, dragEvent);
        if (dragAndDropPermissionsRequestDragAndDropPermissions != null) {
            return new androidx.core.view.DragAndDropPermissionsCompat(dragAndDropPermissionsRequestDragAndDropPermissions);
        }
        return null;
    }

    public void release() {
        androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.release(this.mDragAndDropPermissions);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.view.DragAndDropPermissions requestDragAndDropPermissions(android.app.Activity activity, android.view.DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }

        static void release(android.view.DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }
    }
}
