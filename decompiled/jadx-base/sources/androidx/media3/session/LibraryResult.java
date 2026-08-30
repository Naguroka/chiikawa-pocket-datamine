package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryResult<V> {
    public static final int RESULT_ERROR_BAD_VALUE = -3;
    public static final int RESULT_ERROR_INVALID_STATE = -2;
    public static final int RESULT_ERROR_IO = -5;
    public static final int RESULT_ERROR_NOT_SUPPORTED = -6;
    public static final int RESULT_ERROR_PERMISSION_DENIED = -4;
    public static final int RESULT_ERROR_SESSION_AUTHENTICATION_EXPIRED = -102;
    public static final int RESULT_ERROR_SESSION_CONCURRENT_STREAM_LIMIT = -104;
    public static final int RESULT_ERROR_SESSION_DISCONNECTED = -100;
    public static final int RESULT_ERROR_SESSION_NOT_AVAILABLE_IN_REGION = -106;
    public static final int RESULT_ERROR_SESSION_PARENTAL_CONTROL_RESTRICTED = -105;
    public static final int RESULT_ERROR_SESSION_PREMIUM_ACCOUNT_REQUIRED = -103;
    public static final int RESULT_ERROR_SESSION_SETUP_REQUIRED = -108;
    public static final int RESULT_ERROR_SESSION_SKIP_LIMIT_REACHED = -107;
    public static final int RESULT_ERROR_UNKNOWN = -1;
    public static final int RESULT_INFO_SKIPPED = 1;
    public static final int RESULT_SUCCESS = 0;
    private static final int VALUE_TYPE_ERROR = 4;
    private static final int VALUE_TYPE_ITEM = 2;
    private static final int VALUE_TYPE_ITEM_LIST = 3;
    private static final int VALUE_TYPE_VOID = 1;
    public final long completionTimeMs;
    public final androidx.media3.session.MediaLibraryService.LibraryParams params;
    public final int resultCode;
    public final androidx.media3.session.SessionError sessionError;
    public final V value;
    private final int valueType;
    private static final java.lang.String FIELD_RESULT_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_COMPLETION_TIME_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_PARAMS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_VALUE = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_VALUE_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_SESSION_ERROR = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Code {
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> ofVoid() {
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> ofVoid(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, null, 1);
    }

    public static androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem> ofItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyMediaItem(mediaItem);
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, mediaItem, 2);
    }

    public static androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>> ofItemList(java.util.List<androidx.media3.common.MediaItem> list, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        java.util.Iterator<androidx.media3.common.MediaItem> it = list.iterator();
        while (it.hasNext()) {
            verifyMediaItem(it.next());
        }
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list), 3);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(int i) {
        return ofError(new androidx.media3.session.SessionError(i, "no error message provided", android.os.Bundle.EMPTY));
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(int i, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(i, android.os.SystemClock.elapsedRealtime(), libraryParams, new androidx.media3.session.SessionError(i, "no error message provided", android.os.Bundle.EMPTY), null, 4);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(androidx.media3.session.SessionError sessionError) {
        return new androidx.media3.session.LibraryResult<>(sessionError.code, android.os.SystemClock.elapsedRealtime(), null, sessionError, null, 4);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(androidx.media3.session.SessionError sessionError, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(sessionError.code, android.os.SystemClock.elapsedRealtime(), libraryParams, sessionError, null, 4);
    }

    private LibraryResult(int i, long j, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.SessionError sessionError, V v, int i2) {
        this.resultCode = i;
        this.completionTimeMs = j;
        this.params = libraryParams;
        this.sessionError = sessionError;
        this.value = v;
        this.valueType = i2;
    }

    private static void verifyMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.util.Assertions.checkNotEmpty(mediaItem.mediaId, "mediaId must not be empty");
        androidx.media3.common.util.Assertions.checkArgument(mediaItem.mediaMetadata.isBrowsable != null, "mediaMetadata must specify isBrowsable");
        androidx.media3.common.util.Assertions.checkArgument(mediaItem.mediaMetadata.isPlayable != null, "mediaMetadata must specify isPlayable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2 != 4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RESULT_CODE, this.resultCode);
        bundle.putLong(FIELD_COMPLETION_TIME_MS, this.completionTimeMs);
        androidx.media3.session.MediaLibraryService.LibraryParams libraryParams = this.params;
        if (libraryParams != null) {
            bundle.putBundle(FIELD_PARAMS, libraryParams.toBundle());
        }
        androidx.media3.session.SessionError sessionError = this.sessionError;
        if (sessionError != null) {
            bundle.putBundle(FIELD_SESSION_ERROR, sessionError.toBundle());
        }
        bundle.putInt(FIELD_VALUE_TYPE, this.valueType);
        V v = this.value;
        if (v == null) {
            return bundle;
        }
        int i = this.valueType;
        if (i != 1) {
            if (i == 2) {
                bundle.putBundle(FIELD_VALUE, ((androidx.media3.common.MediaItem) v).toBundle());
            } else if (i == 3) {
                androidx.core.app.BundleCompat.putBinder(bundle, FIELD_VALUE, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList((com.google.common.collect.ImmutableList) this.value, new com.google.common.base.Function() { // from class: androidx.media3.session.LibraryResult$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.common.MediaItem) obj).toBundle();
                    }
                })));
            }
            return bundle;
        }
        throw new java.lang.IllegalStateException();
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> fromVoidBundle(android.os.Bundle bundle) {
        return fromUnknownBundle(bundle);
    }

    public static androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem> fromItemBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 2);
    }

    public static androidx.media3.session.LibraryResult<com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem>> fromItemListBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 3);
    }

    public static androidx.media3.session.LibraryResult<?> fromUnknownBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    private static androidx.media3.session.LibraryResult<?> fromBundle(android.os.Bundle bundle, java.lang.Integer num) {
        androidx.media3.session.SessionError sessionError;
        androidx.media3.session.SessionError sessionError2;
        int i;
        android.os.Bundle bundle2;
        android.os.IBinder binder;
        int i2 = bundle.getInt(FIELD_RESULT_CODE, 0);
        long j = bundle.getLong(FIELD_COMPLETION_TIME_MS, android.os.SystemClock.elapsedRealtime());
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_PARAMS);
        java.lang.Object objFromBundle = null;
        androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle = bundle3 == null ? null : androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle3);
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_SESSION_ERROR);
        if (bundle4 != null) {
            sessionError2 = androidx.media3.session.SessionError.fromBundle(bundle4);
        } else {
            if (i2 != 0) {
                sessionError2 = new androidx.media3.session.SessionError(i2, "no error message provided");
            } else {
                sessionError = null;
            }
            i = bundle.getInt(FIELD_VALUE_TYPE);
            if (i != 1) {
                if (i != 2) {
                    androidx.media3.common.util.Assertions.checkState(num != null || num.intValue() == 2);
                    bundle2 = bundle.getBundle(FIELD_VALUE);
                    if (bundle2 != null) {
                        objFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle2);
                    }
                } else if (i != 3) {
                    androidx.media3.common.util.Assertions.checkState(num != null || num.intValue() == 3);
                    binder = androidx.core.app.BundleCompat.getBinder(bundle, FIELD_VALUE);
                    if (binder != null) {
                        objFromBundle = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(binder));
                    }
                } else if (i != 4) {
                    throw new java.lang.IllegalStateException();
                }
            }
            return new androidx.media3.session.LibraryResult<>(i2, j, libraryParamsFromBundle, sessionError, objFromBundle, i);
        }
        sessionError = sessionError2;
        i = bundle.getInt(FIELD_VALUE_TYPE);
        if (i != 1) {
            if (i != 2) {
                androidx.media3.common.util.Assertions.checkState(num != null || num.intValue() == 2);
                bundle2 = bundle.getBundle(FIELD_VALUE);
                if (bundle2 != null) {
                    objFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle2);
                }
            } else if (i != 3) {
                androidx.media3.common.util.Assertions.checkState(num != null || num.intValue() == 3);
                binder = androidx.core.app.BundleCompat.getBinder(bundle, FIELD_VALUE);
                if (binder != null) {
                    objFromBundle = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.LibraryResult$$ExternalSyntheticLambda1(), androidx.media3.common.BundleListRetriever.getList(binder));
                }
            } else if (i != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        return new androidx.media3.session.LibraryResult<>(i2, j, libraryParamsFromBundle, sessionError, objFromBundle, i);
    }
}
