package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityEventCompat {
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;

    @java.lang.Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;

    @java.lang.Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 128;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 256;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_SCROLLED = 4096;

    @java.lang.Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;

    @java.lang.Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }

    private AccessibilityEventCompat() {
    }

    @java.lang.Deprecated
    public static int getRecordCount(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    @java.lang.Deprecated
    public static void appendRecord(android.view.accessibility.AccessibilityEvent accessibilityEvent, androidx.core.view.accessibility.AccessibilityRecordCompat accessibilityRecordCompat) {
        accessibilityEvent.appendRecord((android.view.accessibility.AccessibilityRecord) accessibilityRecordCompat.getImpl());
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat getRecord(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(accessibilityEvent.getRecord(i));
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat asRecord(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(accessibilityEvent);
    }

    public static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        androidx.core.view.accessibility.AccessibilityEventCompat.Api19Impl.setContentChangeTypes(accessibilityEvent, i);
    }

    public static int getContentChangeTypes(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return androidx.core.view.accessibility.AccessibilityEventCompat.Api19Impl.getContentChangeTypes(accessibilityEvent);
    }

    public static void setMovementGranularity(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        androidx.core.view.accessibility.AccessibilityEventCompat.Api16Impl.setMovementGranularity(accessibilityEvent, i);
    }

    public static int getMovementGranularity(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return androidx.core.view.accessibility.AccessibilityEventCompat.Api16Impl.getMovementGranularity(accessibilityEvent);
    }

    public static void setAction(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
        androidx.core.view.accessibility.AccessibilityEventCompat.Api16Impl.setAction(accessibilityEvent, i);
    }

    public static int getAction(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return androidx.core.view.accessibility.AccessibilityEventCompat.Api16Impl.getAction(accessibilityEvent);
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }

        static int getContentChangeTypes(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void setMovementGranularity(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }

        static int getMovementGranularity(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        static void setAction(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        static int getAction(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }
    }
}
