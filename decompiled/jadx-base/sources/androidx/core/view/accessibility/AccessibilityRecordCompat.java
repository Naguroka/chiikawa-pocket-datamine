package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityRecordCompat {
    private final android.view.accessibility.AccessibilityRecord mRecord;

    @java.lang.Deprecated
    public AccessibilityRecordCompat(java.lang.Object obj) {
        this.mRecord = (android.view.accessibility.AccessibilityRecord) obj;
    }

    @java.lang.Deprecated
    public java.lang.Object getImpl() {
        return this.mRecord;
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain(androidx.core.view.accessibility.AccessibilityRecordCompat accessibilityRecordCompat) {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(android.view.accessibility.AccessibilityRecord.obtain(accessibilityRecordCompat.mRecord));
    }

    @java.lang.Deprecated
    public static androidx.core.view.accessibility.AccessibilityRecordCompat obtain() {
        return new androidx.core.view.accessibility.AccessibilityRecordCompat(android.view.accessibility.AccessibilityRecord.obtain());
    }

    @java.lang.Deprecated
    public void setSource(android.view.View view) {
        this.mRecord.setSource(view);
    }

    @java.lang.Deprecated
    public void setSource(android.view.View view, int i) {
        setSource(this.mRecord, view, i);
    }

    public static void setSource(android.view.accessibility.AccessibilityRecord accessibilityRecord, android.view.View view, int i) {
        androidx.core.view.accessibility.AccessibilityRecordCompat.Api16Impl.setSource(accessibilityRecord, view, i);
    }

    @java.lang.Deprecated
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getSource() {
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mRecord.getSource());
    }

    @java.lang.Deprecated
    public int getWindowId() {
        return this.mRecord.getWindowId();
    }

    @java.lang.Deprecated
    public boolean isChecked() {
        return this.mRecord.isChecked();
    }

    @java.lang.Deprecated
    public void setChecked(boolean z) {
        this.mRecord.setChecked(z);
    }

    @java.lang.Deprecated
    public boolean isEnabled() {
        return this.mRecord.isEnabled();
    }

    @java.lang.Deprecated
    public void setEnabled(boolean z) {
        this.mRecord.setEnabled(z);
    }

    @java.lang.Deprecated
    public boolean isPassword() {
        return this.mRecord.isPassword();
    }

    @java.lang.Deprecated
    public void setPassword(boolean z) {
        this.mRecord.setPassword(z);
    }

    @java.lang.Deprecated
    public boolean isFullScreen() {
        return this.mRecord.isFullScreen();
    }

    @java.lang.Deprecated
    public void setFullScreen(boolean z) {
        this.mRecord.setFullScreen(z);
    }

    @java.lang.Deprecated
    public boolean isScrollable() {
        return this.mRecord.isScrollable();
    }

    @java.lang.Deprecated
    public void setScrollable(boolean z) {
        this.mRecord.setScrollable(z);
    }

    @java.lang.Deprecated
    public int getItemCount() {
        return this.mRecord.getItemCount();
    }

    @java.lang.Deprecated
    public void setItemCount(int i) {
        this.mRecord.setItemCount(i);
    }

    @java.lang.Deprecated
    public int getCurrentItemIndex() {
        return this.mRecord.getCurrentItemIndex();
    }

    @java.lang.Deprecated
    public void setCurrentItemIndex(int i) {
        this.mRecord.setCurrentItemIndex(i);
    }

    @java.lang.Deprecated
    public int getFromIndex() {
        return this.mRecord.getFromIndex();
    }

    @java.lang.Deprecated
    public void setFromIndex(int i) {
        this.mRecord.setFromIndex(i);
    }

    @java.lang.Deprecated
    public int getToIndex() {
        return this.mRecord.getToIndex();
    }

    @java.lang.Deprecated
    public void setToIndex(int i) {
        this.mRecord.setToIndex(i);
    }

    @java.lang.Deprecated
    public int getScrollX() {
        return this.mRecord.getScrollX();
    }

    @java.lang.Deprecated
    public void setScrollX(int i) {
        this.mRecord.setScrollX(i);
    }

    @java.lang.Deprecated
    public int getScrollY() {
        return this.mRecord.getScrollY();
    }

    @java.lang.Deprecated
    public void setScrollY(int i) {
        this.mRecord.setScrollY(i);
    }

    @java.lang.Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.mRecord);
    }

    public static int getMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return androidx.core.view.accessibility.AccessibilityRecordCompat.Api15Impl.getMaxScrollX(accessibilityRecord);
    }

    @java.lang.Deprecated
    public void setMaxScrollX(int i) {
        setMaxScrollX(this.mRecord, i);
    }

    public static void setMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        androidx.core.view.accessibility.AccessibilityRecordCompat.Api15Impl.setMaxScrollX(accessibilityRecord, i);
    }

    @java.lang.Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.mRecord);
    }

    public static int getMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return androidx.core.view.accessibility.AccessibilityRecordCompat.Api15Impl.getMaxScrollY(accessibilityRecord);
    }

    @java.lang.Deprecated
    public void setMaxScrollY(int i) {
        setMaxScrollY(this.mRecord, i);
    }

    public static void setMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
        androidx.core.view.accessibility.AccessibilityRecordCompat.Api15Impl.setMaxScrollY(accessibilityRecord, i);
    }

    @java.lang.Deprecated
    public int getAddedCount() {
        return this.mRecord.getAddedCount();
    }

    @java.lang.Deprecated
    public void setAddedCount(int i) {
        this.mRecord.setAddedCount(i);
    }

    @java.lang.Deprecated
    public int getRemovedCount() {
        return this.mRecord.getRemovedCount();
    }

    @java.lang.Deprecated
    public void setRemovedCount(int i) {
        this.mRecord.setRemovedCount(i);
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getClassName() {
        return this.mRecord.getClassName();
    }

    @java.lang.Deprecated
    public void setClassName(java.lang.CharSequence charSequence) {
        this.mRecord.setClassName(charSequence);
    }

    @java.lang.Deprecated
    public java.util.List<java.lang.CharSequence> getText() {
        return this.mRecord.getText();
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getBeforeText() {
        return this.mRecord.getBeforeText();
    }

    @java.lang.Deprecated
    public void setBeforeText(java.lang.CharSequence charSequence) {
        this.mRecord.setBeforeText(charSequence);
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getContentDescription() {
        return this.mRecord.getContentDescription();
    }

    @java.lang.Deprecated
    public void setContentDescription(java.lang.CharSequence charSequence) {
        this.mRecord.setContentDescription(charSequence);
    }

    @java.lang.Deprecated
    public android.os.Parcelable getParcelableData() {
        return this.mRecord.getParcelableData();
    }

    @java.lang.Deprecated
    public void setParcelableData(android.os.Parcelable parcelable) {
        this.mRecord.setParcelableData(parcelable);
    }

    @java.lang.Deprecated
    public void recycle() {
        this.mRecord.recycle();
    }

    @java.lang.Deprecated
    public int hashCode() {
        android.view.accessibility.AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @java.lang.Deprecated
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.view.accessibility.AccessibilityRecordCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityRecordCompat accessibilityRecordCompat = (androidx.core.view.accessibility.AccessibilityRecordCompat) obj;
        android.view.accessibility.AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return accessibilityRecordCompat.mRecord == null;
        }
        return accessibilityRecord.equals(accessibilityRecordCompat.mRecord);
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void setSource(android.view.accessibility.AccessibilityRecord accessibilityRecord, android.view.View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    static class Api15Impl {
        private Api15Impl() {
        }

        static int getMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static void setMaxScrollX(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        static int getMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void setMaxScrollY(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
