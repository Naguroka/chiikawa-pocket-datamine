package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/kr;", "Ljava/lang/IllegalArgumentException;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", "b", "I", "()I", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class kr extends java.lang.IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.logger.IronSourceError error;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(com.json.mediationsdk.logger.IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.errorCode = error.getErrorCode();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mediationsdk.logger.IronSourceError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }
}
