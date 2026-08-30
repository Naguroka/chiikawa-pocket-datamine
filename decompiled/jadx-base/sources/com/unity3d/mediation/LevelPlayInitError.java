package com.unity3d.mediation;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/unity3d/mediation/LevelPlayInitError;", "", "", "toString", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getErrorCode", "()I", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "b", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "<init>", "(ILjava/lang/String;)V", "Lcom/ironsource/ir;", "sdkError", "(Lcom/ironsource/ir;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String errorMessage;

    public LevelPlayInitError(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = i;
        this.errorMessage = errorMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(com.json.ir sdkError) {
        this(sdkError.c(), sdkError.d());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkError, "sdkError");
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public java.lang.String toString() {
        return "LevelPlayError(errorCode=" + this.errorCode + ", errorMessage='" + this.errorMessage + "')";
    }
}
