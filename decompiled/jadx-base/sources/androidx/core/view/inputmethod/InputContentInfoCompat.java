package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
public final class InputContentInfoCompat {
    private final androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl mImpl;

    private interface InputContentInfoCompatImpl {
        android.net.Uri getContentUri();

        android.content.ClipDescription getDescription();

        java.lang.Object getInputContentInfo();

        android.net.Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    private static final class InputContentInfoCompatBaseImpl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        private final android.net.Uri mContentUri;
        private final android.content.ClipDescription mDescription;
        private final android.net.Uri mLinkUri;

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public java.lang.Object getInputContentInfo() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
        }

        InputContentInfoCompatBaseImpl(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
            this.mContentUri = uri;
            this.mDescription = clipDescription;
            this.mLinkUri = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getContentUri() {
            return this.mContentUri;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.content.ClipDescription getDescription() {
            return this.mDescription;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getLinkUri() {
            return this.mLinkUri;
        }
    }

    private static final class InputContentInfoCompatApi25Impl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        final android.view.inputmethod.InputContentInfo mObject;

        InputContentInfoCompatApi25Impl(java.lang.Object obj) {
            this.mObject = (android.view.inputmethod.InputContentInfo) obj;
        }

        InputContentInfoCompatApi25Impl(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
            this.mObject = new android.view.inputmethod.InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getContentUri() {
            return this.mObject.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.content.ClipDescription getDescription() {
            return this.mObject.getDescription();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public android.net.Uri getLinkUri() {
            return this.mObject.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public java.lang.Object getInputContentInfo() {
            return this.mObject;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void requestPermission() {
            this.mObject.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void releasePermission() {
            this.mObject.releasePermission();
        }
    }

    public InputContentInfoCompat(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            this.mImpl = new androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.mImpl = new androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }

    private InputContentInfoCompat(androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.mImpl = inputContentInfoCompatImpl;
    }

    public android.net.Uri getContentUri() {
        return this.mImpl.getContentUri();
    }

    public android.content.ClipDescription getDescription() {
        return this.mImpl.getDescription();
    }

    public android.net.Uri getLinkUri() {
        return this.mImpl.getLinkUri();
    }

    public static androidx.core.view.inputmethod.InputContentInfoCompat wrap(java.lang.Object obj) {
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 25) {
            return new androidx.core.view.inputmethod.InputContentInfoCompat(new androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl(obj));
        }
        return null;
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getInputContentInfo();
    }

    public void requestPermission() {
        this.mImpl.requestPermission();
    }

    public void releasePermission() {
        this.mImpl.releasePermission();
    }
}
