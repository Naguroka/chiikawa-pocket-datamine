package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public interface TrustedWebActivityDisplayMode {
    public static final java.lang.String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    android.os.Bundle toBundle();

    static androidx.browser.trusted.TrustedWebActivityDisplayMode fromBundle(android.os.Bundle bundle) {
        if (bundle.getInt(KEY_ID) == 1) {
            return androidx.browser.trusted.TrustedWebActivityDisplayMode.ImmersiveMode.fromBundle(bundle);
        }
        return new androidx.browser.trusted.TrustedWebActivityDisplayMode.DefaultMode();
    }

    public static class DefaultMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        private static final int ID = 0;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 0);
            return bundle;
        }
    }

    public static class ImmersiveMode implements androidx.browser.trusted.TrustedWebActivityDisplayMode {
        private static final int ID = 1;
        public static final java.lang.String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final java.lang.String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
        private final boolean mIsSticky;
        private final int mLayoutInDisplayCutoutMode;

        public ImmersiveMode(boolean z, int i) {
            this.mIsSticky = z;
            this.mLayoutInDisplayCutoutMode = i;
        }

        static androidx.browser.trusted.TrustedWebActivityDisplayMode fromBundle(android.os.Bundle bundle) {
            return new androidx.browser.trusted.TrustedWebActivityDisplayMode.ImmersiveMode(bundle.getBoolean(KEY_STICKY), bundle.getInt(KEY_CUTOUT_MODE));
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(androidx.browser.trusted.TrustedWebActivityDisplayMode.KEY_ID, 1);
            bundle.putBoolean(KEY_STICKY, this.mIsSticky);
            bundle.putInt(KEY_CUTOUT_MODE, this.mLayoutInDisplayCutoutMode);
            return bundle;
        }

        public boolean isSticky() {
            return this.mIsSticky;
        }

        public int layoutInDisplayCutoutMode() {
            return this.mLayoutInDisplayCutoutMode;
        }
    }
}
