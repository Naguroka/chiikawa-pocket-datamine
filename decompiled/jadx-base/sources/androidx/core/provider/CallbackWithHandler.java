package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class CallbackWithHandler {
    private final androidx.core.provider.FontsContractCompat.FontRequestCallback mCallback;
    private final android.os.Handler mCallbackHandler;

    CallbackWithHandler(androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, android.os.Handler handler) {
        this.mCallback = fontRequestCallback;
        this.mCallbackHandler = handler;
    }

    CallbackWithHandler(androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this.mCallback = fontRequestCallback;
        this.mCallbackHandler = androidx.core.provider.CalleeHandler.create();
    }

    private void onTypefaceRetrieved(final android.graphics.Typeface typeface) {
        final androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback = this.mCallback;
        this.mCallbackHandler.post(new java.lang.Runnable() { // from class: androidx.core.provider.CallbackWithHandler.1
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRetrieved(typeface);
            }
        });
    }

    private void onTypefaceRequestFailed(final int i) {
        final androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback = this.mCallback;
        this.mCallbackHandler.post(new java.lang.Runnable() { // from class: androidx.core.provider.CallbackWithHandler.2
            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(i);
            }
        });
    }

    void onTypefaceResult(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.isSuccess()) {
            onTypefaceRetrieved(typefaceResult.mTypeface);
        } else {
            onTypefaceRequestFailed(typefaceResult.mResult);
        }
    }
}
