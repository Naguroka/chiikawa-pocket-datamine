package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontRequestWorker {
    static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = new androidx.collection.LruCache<>(16);
    private static final java.util.concurrent.ExecutorService DEFAULT_EXECUTOR_SERVICE = androidx.core.provider.RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
    static final java.lang.Object LOCK = new java.lang.Object();
    static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> PENDING_REPLIES = new androidx.collection.SimpleArrayMap<>();

    private FontRequestWorker() {
    }

    static void resetTypefaceCache() {
        sTypefaceCache.evictAll();
    }

    static android.graphics.Typeface requestFontSync(final android.content.Context context, final androidx.core.provider.FontRequest fontRequest, androidx.core.provider.CallbackWithHandler callbackWithHandler, final int i, int i2) {
        final java.lang.String strCreateCacheId = createCacheId(fontRequest, i);
        android.graphics.Typeface typeface = sTypefaceCache.get(strCreateCacheId);
        if (typeface != null) {
            callbackWithHandler.onTypefaceResult(new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface));
            return typeface;
        }
        if (i2 == -1) {
            androidx.core.provider.FontRequestWorker.TypefaceResult fontSync = getFontSync(strCreateCacheId, context, fontRequest, i);
            callbackWithHandler.onTypefaceResult(fontSync);
            return fontSync.mTypeface;
        }
        try {
            androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult = (androidx.core.provider.FontRequestWorker.TypefaceResult) androidx.core.provider.RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, new java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public androidx.core.provider.FontRequestWorker.TypefaceResult call() {
                    return androidx.core.provider.FontRequestWorker.getFontSync(strCreateCacheId, context, fontRequest, i);
                }
            }, i2);
            callbackWithHandler.onTypefaceResult(typefaceResult);
            return typefaceResult.mTypeface;
        } catch (java.lang.InterruptedException unused) {
            callbackWithHandler.onTypefaceResult(new androidx.core.provider.FontRequestWorker.TypefaceResult(-3));
            return null;
        }
    }

    static android.graphics.Typeface requestFontAsync(final android.content.Context context, final androidx.core.provider.FontRequest fontRequest, final int i, java.util.concurrent.Executor executor, final androidx.core.provider.CallbackWithHandler callbackWithHandler) {
        final java.lang.String strCreateCacheId = createCacheId(fontRequest, i);
        android.graphics.Typeface typeface = sTypefaceCache.get(strCreateCacheId);
        if (typeface != null) {
            callbackWithHandler.onTypefaceResult(new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface));
            return typeface;
        }
        androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult> consumer = new androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public void accept(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    typefaceResult = new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
                }
                callbackWithHandler.onTypefaceResult(typefaceResult);
            }
        };
        synchronized (LOCK) {
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> simpleArrayMap = PENDING_REPLIES;
            java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList = simpleArrayMap.get(strCreateCacheId);
            if (arrayList != null) {
                arrayList.add(consumer);
                return null;
            }
            java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add(consumer);
            simpleArrayMap.put(strCreateCacheId, arrayList2);
            java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult> callable = new java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public androidx.core.provider.FontRequestWorker.TypefaceResult call() {
                    try {
                        return androidx.core.provider.FontRequestWorker.getFontSync(strCreateCacheId, context, fontRequest, i);
                    } catch (java.lang.Throwable unused) {
                        return new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
                    }
                }
            };
            if (executor == null) {
                executor = DEFAULT_EXECUTOR_SERVICE;
            }
            androidx.core.provider.RequestExecutor.execute(executor, callable, new androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                @Override // androidx.core.util.Consumer
                public void accept(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
                    synchronized (androidx.core.provider.FontRequestWorker.LOCK) {
                        java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList3 = androidx.core.provider.FontRequestWorker.PENDING_REPLIES.get(strCreateCacheId);
                        if (arrayList3 == null) {
                            return;
                        }
                        androidx.core.provider.FontRequestWorker.PENDING_REPLIES.remove(strCreateCacheId);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            arrayList3.get(i2).accept(typefaceResult);
                        }
                    }
                }
            });
            return null;
        }
    }

    private static java.lang.String createCacheId(androidx.core.provider.FontRequest fontRequest, int i) {
        return fontRequest.getId() + "-" + i;
    }

    static androidx.core.provider.FontRequestWorker.TypefaceResult getFontSync(java.lang.String str, android.content.Context context, androidx.core.provider.FontRequest fontRequest, int i) {
        androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> lruCache = sTypefaceCache;
        android.graphics.Typeface typeface = lruCache.get(str);
        if (typeface != null) {
            return new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface);
        }
        try {
            androidx.core.provider.FontsContractCompat.FontFamilyResult fontFamilyResult = androidx.core.provider.FontProvider.getFontFamilyResult(context, fontRequest, null);
            int fontFamilyResultStatus = getFontFamilyResultStatus(fontFamilyResult);
            if (fontFamilyResultStatus != 0) {
                return new androidx.core.provider.FontRequestWorker.TypefaceResult(fontFamilyResultStatus);
            }
            android.graphics.Typeface typefaceCreateFromFontInfo = androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, null, fontFamilyResult.getFonts(), i);
            if (typefaceCreateFromFontInfo != null) {
                lruCache.put(str, typefaceCreateFromFontInfo);
                return new androidx.core.provider.FontRequestWorker.TypefaceResult(typefaceCreateFromFontInfo);
            }
            return new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new androidx.core.provider.FontRequestWorker.TypefaceResult(-1);
        }
    }

    private static int getFontFamilyResultStatus(androidx.core.provider.FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i = 1;
        if (fontFamilyResult.getStatusCode() != 0) {
            return fontFamilyResult.getStatusCode() != 1 ? -3 : -2;
        }
        androidx.core.provider.FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null && fonts.length != 0) {
            i = 0;
            for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fonts) {
                int resultCode = fontInfo.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i;
    }

    static final class TypefaceResult {
        final int mResult;
        final android.graphics.Typeface mTypeface;

        TypefaceResult(int i) {
            this.mTypeface = null;
            this.mResult = i;
        }

        TypefaceResult(android.graphics.Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }

        boolean isSuccess() {
            return this.mResult == 0;
        }
    }
}
