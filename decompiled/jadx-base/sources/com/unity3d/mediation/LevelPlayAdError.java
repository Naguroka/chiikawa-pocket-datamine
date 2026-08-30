package com.unity3d.mediation;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u0001:\u0001\bB\u001d\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/unity3d/mediation/LevelPlayAdError;", "", "", "toString", "", "getErrorCode", "getErrorMessage", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "ironSourceError", "b", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", "adUnitId", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;Ljava/lang/String;)V", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "errorMessage", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayAdError {
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.logger.IronSourceError ironSourceError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String adUnitId;

    public LevelPlayAdError(com.json.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str) {
        this.ironSourceError = ironSourceError;
        this.adUnitId = str;
    }

    public /* synthetic */ LevelPlayAdError(com.json.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(java.lang.String adUnitId, int i, java.lang.String errorMessage) {
        this(new com.json.mediationsdk.logger.IronSourceError(i, errorMessage), adUnitId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final int getErrorCode() {
        com.json.mediationsdk.logger.IronSourceError ironSourceError = this.ironSourceError;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final java.lang.String getErrorMessage() {
        com.json.mediationsdk.logger.IronSourceError ironSourceError = this.ironSourceError;
        java.lang.String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("adUnitId: ").append(this.adUnitId).append(' ');
        com.json.mediationsdk.logger.IronSourceError ironSourceError = this.ironSourceError;
        return sbAppend.append(ironSourceError != null ? ironSourceError.toString() : null).toString();
    }
}
