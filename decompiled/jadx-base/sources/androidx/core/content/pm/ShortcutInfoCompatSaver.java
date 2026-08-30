package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public abstract class ShortcutInfoCompatSaver<T> {
    public abstract T addShortcuts(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list);

    public abstract T removeAllShortcuts();

    public abstract T removeShortcuts(java.util.List<java.lang.String> list);

    public java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts() throws java.lang.Exception {
        return new java.util.ArrayList();
    }

    public static class NoopImpl extends androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> {
        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        /* JADX INFO: renamed from: addShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void addShortcuts2(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> list) {
            return null;
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public java.lang.Void removeAllShortcuts() {
            return null;
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        /* JADX INFO: renamed from: removeShortcuts, reason: avoid collision after fix types in other method */
        public java.lang.Void removeShortcuts2(java.util.List<java.lang.String> list) {
            return null;
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void addShortcuts(java.util.List list) {
            return addShortcuts2((java.util.List<androidx.core.content.pm.ShortcutInfoCompat>) list);
        }

        @Override // androidx.core.content.pm.ShortcutInfoCompatSaver
        public /* bridge */ /* synthetic */ java.lang.Void removeShortcuts(java.util.List list) {
            return removeShortcuts2((java.util.List<java.lang.String>) list);
        }
    }
}
