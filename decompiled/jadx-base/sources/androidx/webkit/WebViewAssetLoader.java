package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAssetLoader {
    public static final java.lang.String DEFAULT_DOMAIN = "appassets.androidplatform.net";
    private static final java.lang.String TAG = "WebViewAssetLoader";
    private final java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> mMatchers;

    public interface PathHandler {
        android.webkit.WebResourceResponse handle(java.lang.String str);
    }

    public static final class AssetsPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private androidx.webkit.internal.AssetHelper mAssetHelper;

        public AssetsPathHandler(android.content.Context context) {
            this.mAssetHelper = new androidx.webkit.internal.AssetHelper(context);
        }

        AssetsPathHandler(androidx.webkit.internal.AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String str) {
            try {
                return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, this.mAssetHelper.openAsset(str));
            } catch (java.io.IOException e) {
                android.util.Log.e(androidx.webkit.WebViewAssetLoader.TAG, "Error opening asset path: " + str, e);
                return new android.webkit.WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class ResourcesPathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private androidx.webkit.internal.AssetHelper mAssetHelper;

        public ResourcesPathHandler(android.content.Context context) {
            this.mAssetHelper = new androidx.webkit.internal.AssetHelper(context);
        }

        ResourcesPathHandler(androidx.webkit.internal.AssetHelper assetHelper) {
            this.mAssetHelper = assetHelper;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String str) {
            try {
                return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, this.mAssetHelper.openResource(str));
            } catch (android.content.res.Resources.NotFoundException e) {
                android.util.Log.e(androidx.webkit.WebViewAssetLoader.TAG, "Resource not found from the path: " + str, e);
                return new android.webkit.WebResourceResponse(null, null, null);
            } catch (java.io.IOException e2) {
                android.util.Log.e(androidx.webkit.WebViewAssetLoader.TAG, "Error opening resource from the path: " + str, e2);
                return new android.webkit.WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class InternalStoragePathHandler implements androidx.webkit.WebViewAssetLoader.PathHandler {
        private static final java.lang.String[] FORBIDDEN_DATA_DIRS = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
        private final java.io.File mDirectory;

        public InternalStoragePathHandler(android.content.Context context, java.io.File file) {
            try {
                this.mDirectory = new java.io.File(androidx.webkit.internal.AssetHelper.getCanonicalDirPath(file));
                if (isAllowedInternalStorageDir(context)) {
                } else {
                    throw new java.lang.IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
                }
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        private boolean isAllowedInternalStorageDir(android.content.Context context) throws java.io.IOException {
            java.lang.String canonicalDirPath = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(this.mDirectory);
            java.lang.String canonicalDirPath2 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(context.getCacheDir());
            java.lang.String canonicalDirPath3 = androidx.webkit.internal.AssetHelper.getCanonicalDirPath(androidx.webkit.internal.AssetHelper.getDataDir(context));
            if ((!canonicalDirPath.startsWith(canonicalDirPath2) && !canonicalDirPath.startsWith(canonicalDirPath3)) || canonicalDirPath.equals(canonicalDirPath2) || canonicalDirPath.equals(canonicalDirPath3)) {
                return false;
            }
            for (java.lang.String str : FORBIDDEN_DATA_DIRS) {
                if (canonicalDirPath.startsWith(canonicalDirPath3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        public android.webkit.WebResourceResponse handle(java.lang.String str) {
            try {
                java.io.File canonicalFileIfChild = androidx.webkit.internal.AssetHelper.getCanonicalFileIfChild(this.mDirectory, str);
                if (canonicalFileIfChild != null) {
                    return new android.webkit.WebResourceResponse(androidx.webkit.internal.AssetHelper.guessMimeType(str), null, androidx.webkit.internal.AssetHelper.openFile(canonicalFileIfChild));
                }
                android.util.Log.e(androidx.webkit.WebViewAssetLoader.TAG, java.lang.String.format("The requested file: %s is outside the mounted directory: %s", str, this.mDirectory));
                return new android.webkit.WebResourceResponse(null, null, null);
            } catch (java.io.IOException e) {
                android.util.Log.e(androidx.webkit.WebViewAssetLoader.TAG, "Error opening the requested path: " + str, e);
            }
        }
    }

    static class PathMatcher {
        static final java.lang.String HTTPS_SCHEME = "https";
        static final java.lang.String HTTP_SCHEME = "http";
        final java.lang.String mAuthority;
        final androidx.webkit.WebViewAssetLoader.PathHandler mHandler;
        final boolean mHttpEnabled;
        final java.lang.String mPath;

        PathMatcher(java.lang.String str, java.lang.String str2, boolean z, androidx.webkit.WebViewAssetLoader.PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new java.lang.IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new java.lang.IllegalArgumentException("Path should end with a slash '/'");
            }
            this.mAuthority = str;
            this.mPath = str2;
            this.mHttpEnabled = z;
            this.mHandler = pathHandler;
        }

        public androidx.webkit.WebViewAssetLoader.PathHandler match(android.net.Uri uri) {
            if (uri.getScheme().equals("http") && !this.mHttpEnabled) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.mAuthority) && uri.getPath().startsWith(this.mPath)) {
                return this.mHandler;
            }
            return null;
        }

        public java.lang.String getSuffixPath(java.lang.String str) {
            return str.replaceFirst(this.mPath, "");
        }
    }

    public static final class Builder {
        private java.lang.String mDomain = androidx.webkit.WebViewAssetLoader.DEFAULT_DOMAIN;
        private final java.util.List<androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader.PathHandler>> mHandlerList = new java.util.ArrayList();
        private boolean mHttpAllowed;

        public androidx.webkit.WebViewAssetLoader.Builder setDomain(java.lang.String str) {
            this.mDomain = str;
            return this;
        }

        public androidx.webkit.WebViewAssetLoader.Builder setHttpAllowed(boolean z) {
            this.mHttpAllowed = z;
            return this;
        }

        public androidx.webkit.WebViewAssetLoader.Builder addPathHandler(java.lang.String str, androidx.webkit.WebViewAssetLoader.PathHandler pathHandler) {
            this.mHandlerList.add(androidx.core.util.Pair.create(str, pathHandler));
            return this;
        }

        public androidx.webkit.WebViewAssetLoader build() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.core.util.Pair<java.lang.String, androidx.webkit.WebViewAssetLoader.PathHandler> pair : this.mHandlerList) {
                arrayList.add(new androidx.webkit.WebViewAssetLoader.PathMatcher(this.mDomain, pair.first, this.mHttpAllowed, pair.second));
            }
            return new androidx.webkit.WebViewAssetLoader(arrayList);
        }
    }

    WebViewAssetLoader(java.util.List<androidx.webkit.WebViewAssetLoader.PathMatcher> list) {
        this.mMatchers = list;
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(android.net.Uri uri) {
        android.webkit.WebResourceResponse webResourceResponseHandle;
        for (androidx.webkit.WebViewAssetLoader.PathMatcher pathMatcher : this.mMatchers) {
            androidx.webkit.WebViewAssetLoader.PathHandler pathHandlerMatch = pathMatcher.match(uri);
            if (pathHandlerMatch != null && (webResourceResponseHandle = pathHandlerMatch.handle(pathMatcher.getSuffixPath(uri.getPath()))) != null) {
                return webResourceResponseHandle;
            }
        }
        return null;
    }
}
