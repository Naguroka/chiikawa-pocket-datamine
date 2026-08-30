package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionCompat {
    private static final java.lang.String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final java.lang.String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final java.lang.String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final java.lang.String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final java.lang.String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final java.lang.String LOG_TAG = "InputConnectionCompat";

    public interface OnCommitContentListener {
        boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean handlePerformPrivateCommand(java.lang.String str, android.os.Bundle bundle, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener onCommitContentListener) throws java.lang.Throwable {
        boolean z;
        android.os.ResultReceiver resultReceiver;
        boolean zOnCommitContent;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (android.text.TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
            z = false;
        } else {
            if (!android.text.TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
                return false;
            }
            z = true;
        }
        try {
            resultReceiver = (android.os.ResultReceiver) bundle.getParcelable(z ? COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY : COMMIT_CONTENT_RESULT_RECEIVER_KEY);
            try {
                android.net.Uri uri = (android.net.Uri) bundle.getParcelable(z ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY);
                android.content.ClipDescription clipDescription = (android.content.ClipDescription) bundle.getParcelable(z ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY);
                android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable(z ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY);
                int i = bundle.getInt(z ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY);
                android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable(z ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY);
                if (uri != null && clipDescription != null) {
                    zOnCommitContent = onCommitContentListener.onCommitContent(new androidx.core.view.inputmethod.InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    r0 = zOnCommitContent;
                    resultReceiver.send(r0, null);
                }
                r0 = zOnCommitContent;
                return r0;
            } catch (java.lang.Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    public static boolean commitContent(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
        boolean z;
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return androidx.core.view.inputmethod.InputConnectionCompat.Api25Impl.commitContent(inputConnection, (android.view.inputmethod.InputContentInfo) inputContentInfoCompat.unwrap(), i, bundle);
        }
        int protocol = androidx.core.view.inputmethod.EditorInfoCompat.getProtocol(editorInfo);
        if (protocol != 2) {
            z = false;
            if (protocol != 3 && protocol != 4) {
                return false;
            }
        } else {
            z = true;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable(z ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY, inputContentInfoCompat.getContentUri());
        bundle2.putParcelable(z ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY, inputContentInfoCompat.getDescription());
        bundle2.putParcelable(z ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY, inputContentInfoCompat.getLinkUri());
        bundle2.putInt(z ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY, i);
        bundle2.putParcelable(z ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY, bundle);
        return inputConnection.performPrivateCommand(z ? COMMIT_CONTENT_INTEROP_ACTION : COMMIT_CONTENT_ACTION, bundle2);
    }

    @java.lang.Deprecated
    public static android.view.inputmethod.InputConnection createWrapper(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, final androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener onCommitContentListener) {
        androidx.core.util.ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        androidx.core.util.ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        androidx.core.util.ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        boolean z = false;
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return new android.view.inputmethod.InputConnectionWrapper(inputConnection, z) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
                    if (onCommitContentListener.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i, bundle);
                }
            };
        }
        return androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new android.view.inputmethod.InputConnectionWrapper(inputConnection, z) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
                if (androidx.core.view.inputmethod.InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            }
        };
    }

    public static android.view.inputmethod.InputConnection createWrapper(android.view.View view, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, createOnCommitContentListenerUsingPerformReceiveContent(view));
    }

    private static androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(final android.view.View view) {
        androidx.core.util.Preconditions.checkNotNull(view);
        return new androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener() { // from class: androidx.core.view.inputmethod.InputConnectionCompat$$ExternalSyntheticLambda0
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
                return androidx.core.view.inputmethod.InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(view, inputContentInfoCompat, i, bundle);
            }
        };
    }

    static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(android.view.View view, androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, int i, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                android.view.inputmethod.InputContentInfo inputContentInfo = (android.view.inputmethod.InputContentInfo) inputContentInfoCompat.unwrap();
                bundle = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle.putParcelable(EXTRA_INPUT_CONTENT_INFO, inputContentInfo);
            } catch (java.lang.Exception e) {
                android.util.Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return androidx.core.view.ViewCompat.performReceiveContent(view, new androidx.core.view.ContentInfoCompat.Builder(new android.content.ClipData(inputContentInfoCompat.getDescription(), new android.content.ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) == null;
    }

    @java.lang.Deprecated
    public InputConnectionCompat() {
    }

    static class Api25Impl {
        private Api25Impl() {
        }

        static boolean commitContent(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }
}
