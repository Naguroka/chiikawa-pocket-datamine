package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private final java.lang.Object mInfo;

    private static java.lang.String typeToString(int i) {
        if (i == 1) {
            return "TYPE_APPLICATION";
        }
        if (i == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i != 3) {
            return i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
    }

    static androidx.core.view.accessibility.AccessibilityWindowInfoCompat wrapNonNullInstance(java.lang.Object obj) {
        if (obj != null) {
            return new androidx.core.view.accessibility.AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    private AccessibilityWindowInfoCompat(java.lang.Object obj) {
        this.mInfo = obj;
    }

    public int getType() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getType((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public int getLayer() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getLayer((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getRoot((android.view.accessibility.AccessibilityWindowInfo) this.mInfo));
    }

    public boolean isInPictureInPictureMode() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.isInPictureInPictureMode((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
        }
        return false;
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
        return wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getParent((android.view.accessibility.AccessibilityWindowInfo) this.mInfo));
    }

    public int getId() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getId((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public void getRegionInScreen(android.graphics.Region region) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getRegionInScreen((android.view.accessibility.AccessibilityWindowInfo) this.mInfo, region);
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen((android.view.accessibility.AccessibilityWindowInfo) this.mInfo, rect);
        region.set(rect);
    }

    public void getBoundsInScreen(android.graphics.Rect rect) {
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen((android.view.accessibility.AccessibilityWindowInfo) this.mInfo, rect);
    }

    public boolean isActive() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isActive((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isFocused() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isFocused((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public boolean isAccessibilityFocused() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isAccessibilityFocused((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public int getChildCount() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChildCount((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int i) {
        return wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChild((android.view.accessibility.AccessibilityWindowInfo) this.mInfo, i));
    }

    public int getDisplayId() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getDisplayId((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
        }
        return 0;
    }

    public java.lang.CharSequence getTitle() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getTitle((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getAnchor((android.view.accessibility.AccessibilityWindowInfo) this.mInfo));
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
        return wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain());
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (accessibilityWindowInfoCompat == null) {
            return null;
        }
        return wrapNonNullInstance(androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain((android.view.accessibility.AccessibilityWindowInfo) accessibilityWindowInfoCompat.mInfo));
    }

    public void recycle() {
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.recycle((android.view.accessibility.AccessibilityWindowInfo) this.mInfo);
    }

    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
        return (android.view.accessibility.AccessibilityWindowInfo) this.mInfo;
    }

    public int hashCode() {
        java.lang.Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) obj;
        java.lang.Object obj2 = this.mInfo;
        if (obj2 == null) {
            return accessibilityWindowInfoCompat.mInfo == null;
        }
        return obj2.equals(accessibilityWindowInfoCompat.mInfo);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityWindowInfo[id=");
        android.graphics.Rect rect = new android.graphics.Rect();
        getBoundsInScreen(rect);
        sb.append(getId());
        sb.append(", type=").append(typeToString(getType()));
        sb.append(", layer=").append(getLayer());
        sb.append(", bounds=").append(rect);
        sb.append(", focused=").append(isFocused());
        sb.append(", active=").append(isActive());
        sb.append(", hasParent=").append(getParent() != null);
        sb.append(", hasChildren=").append(getChildCount() > 0);
        sb.append(']');
        return sb.toString();
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void getBoundsInScreen(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, android.graphics.Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        static android.view.accessibility.AccessibilityWindowInfo getChild(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        static int getChildCount(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        static int getId(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        static int getLayer(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        static android.view.accessibility.AccessibilityWindowInfo getParent(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        static android.view.accessibility.AccessibilityNodeInfo getRoot(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        static int getType(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        static boolean isAccessibilityFocused(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        static boolean isActive(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        static boolean isFocused(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        static android.view.accessibility.AccessibilityWindowInfo obtain() {
            return android.view.accessibility.AccessibilityWindowInfo.obtain();
        }

        static android.view.accessibility.AccessibilityWindowInfo obtain(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return android.view.accessibility.AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        static void recycle(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static android.view.accessibility.AccessibilityNodeInfo getAnchor(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        static java.lang.CharSequence getTitle(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static int getDisplayId(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        static void getRegionInScreen(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, android.graphics.Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        static boolean isInPictureInPictureMode(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }
}
