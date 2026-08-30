package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends androidx.media3.common.PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
    public final androidx.media3.common.Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final java.lang.String rendererName;
    public final int type;
    private static final java.lang.String FIELD_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1001);
    private static final java.lang.String FIELD_RENDERER_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(1002);
    private static final java.lang.String FIELD_RENDERER_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1003);
    private static final java.lang.String FIELD_RENDERER_FORMAT = androidx.media3.common.util.Util.intToStringMaxRadix(1004);
    private static final java.lang.String FIELD_RENDERER_FORMAT_SUPPORT = androidx.media3.common.util.Util.intToStringMaxRadix(1005);
    private static final java.lang.String FIELD_IS_RECOVERABLE = androidx.media3.common.util.Util.intToStringMaxRadix(1006);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForSource(java.io.IOException iOException, int i) {
        return new androidx.media3.exoplayer.ExoPlaybackException(0, iOException, i);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForRenderer(java.lang.Throwable th, java.lang.String str, int i, androidx.media3.common.Format format, int i2, boolean z, int i3) {
        return new androidx.media3.exoplayer.ExoPlaybackException(1, th, null, i3, str, i, format, format == null ? 4 : i2, z);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException, int i) {
        return new androidx.media3.exoplayer.ExoPlaybackException(2, runtimeException, i);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForRemote(java.lang.String str) {
        return new androidx.media3.exoplayer.ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, androidx.media3.common.Format format, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, format, i4), th, i2, i, str2, i3, format, i4, null, android.os.SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(android.os.Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : androidx.media3.common.Format.fromBundle(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, androidx.media3.common.Format format, int i4, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) {
        super(str, th, i, android.os.Bundle.EMPTY, j);
        androidx.media3.common.util.Assertions.checkArgument(!z || i2 == 1);
        androidx.media3.common.util.Assertions.checkArgument(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z;
    }

    public java.io.IOException getSourceException() {
        androidx.media3.common.util.Assertions.checkState(this.type == 0);
        return (java.io.IOException) androidx.media3.common.util.Assertions.checkNotNull(getCause());
    }

    public java.lang.Exception getRendererException() {
        androidx.media3.common.util.Assertions.checkState(this.type == 1);
        return (java.lang.Exception) androidx.media3.common.util.Assertions.checkNotNull(getCause());
    }

    public java.lang.RuntimeException getUnexpectedException() {
        androidx.media3.common.util.Assertions.checkState(this.type == 2);
        return (java.lang.RuntimeException) androidx.media3.common.util.Assertions.checkNotNull(getCause());
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean errorInfoEquals(androidx.media3.common.PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = (androidx.media3.exoplayer.ExoPlaybackException) androidx.media3.common.util.Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && androidx.media3.common.util.Util.areEqual(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && androidx.media3.common.util.Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && androidx.media3.common.util.Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    androidx.media3.exoplayer.ExoPlaybackException copyWithMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return new androidx.media3.exoplayer.ExoPlaybackException((java.lang.String) androidx.media3.common.util.Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    private static java.lang.String deriveMessage(int i, java.lang.String str, java.lang.String str2, int i2, androidx.media3.common.Format format, int i3) {
        java.lang.String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + androidx.media3.common.util.Util.getFormatSupportString(i3);
        }
        return !android.text.TextUtils.isEmpty(str) ? str3 + ": " + str : str3;
    }

    public static androidx.media3.exoplayer.ExoPlaybackException fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.exoplayer.ExoPlaybackException(bundle);
    }

    @Override // androidx.media3.common.PlaybackException
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        androidx.media3.common.Format format = this.rendererFormat;
        if (format != null) {
            bundle.putBundle(FIELD_RENDERER_FORMAT, format.toBundle(false));
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }
}
