package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {

    @java.lang.Deprecated
    public static final java.lang.String PARCEL_FONT_RESULTS = "font_results";

    @java.lang.Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @java.lang.Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @java.lang.Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(android.graphics.Typeface typeface) {
        }
    }

    private FontsContractCompat() {
    }

    public static android.graphics.Typeface buildTypeface(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
        return androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontRequest fontRequest) throws android.content.pm.PackageManager.NameNotFoundException {
        return androidx.core.provider.FontProvider.getFontFamilyResult(context, fontRequest, cancellationSignal);
    }

    public static void requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, android.os.Handler handler) {
        androidx.core.provider.CallbackWithHandler callbackWithHandler = new androidx.core.provider.CallbackWithHandler(fontRequestCallback);
        androidx.core.provider.FontRequestWorker.requestFontAsync(context.getApplicationContext(), fontRequest, 0, androidx.core.provider.RequestExecutor.createHandlerExecutor(handler), callbackWithHandler);
    }

    public static android.graphics.Typeface requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, int i, boolean z, int i2, android.os.Handler handler, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback) {
        androidx.core.provider.CallbackWithHandler callbackWithHandler = new androidx.core.provider.CallbackWithHandler(fontRequestCallback, handler);
        if (z) {
            return androidx.core.provider.FontRequestWorker.requestFontSync(context, fontRequest, callbackWithHandler, i, i2);
        }
        return androidx.core.provider.FontRequestWorker.requestFontAsync(context, fontRequest, i, null, callbackWithHandler);
    }

    public static void resetTypefaceCache() {
        androidx.core.provider.FontRequestWorker.resetTypefaceCache();
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final android.net.Uri mUri;
        private final int mWeight;

        @java.lang.Deprecated
        public FontInfo(android.net.Uri uri, int i, int i2, boolean z, int i3) {
            this.mUri = (android.net.Uri) androidx.core.util.Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        static androidx.core.provider.FontsContractCompat.FontInfo create(android.net.Uri uri, int i, int i2, boolean z, int i3) {
            return new androidx.core.provider.FontsContractCompat.FontInfo(uri, i, i2, z, i3);
        }

        public android.net.Uri getUri() {
            return this.mUri;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public int getResultCode() {
            return this.mResultCode;
        }
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final androidx.core.provider.FontsContractCompat.FontInfo[] mFonts;
        private final int mStatusCode;

        @java.lang.Deprecated
        public FontFamilyResult(int i, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        public androidx.core.provider.FontsContractCompat.FontInfo[] getFonts() {
            return this.mFonts;
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult create(int i, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
            return new androidx.core.provider.FontsContractCompat.FontFamilyResult(i, fontInfoArr);
        }
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface getFontSync(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z, int i, int i2) {
        return requestFont(context, fontRequest, i2, z, i, androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(handler), new androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter(fontCallback));
    }

    @java.lang.Deprecated
    public static void resetCache() {
        androidx.core.provider.FontRequestWorker.resetTypefaceCache();
    }

    @java.lang.Deprecated
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context context, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, android.os.CancellationSignal cancellationSignal) {
        return androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    @java.lang.Deprecated
    public static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        return androidx.core.provider.FontProvider.getProvider(packageManager, fontRequest, resources);
    }
}
