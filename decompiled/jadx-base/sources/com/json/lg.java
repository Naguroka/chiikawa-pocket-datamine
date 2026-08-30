package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/lg;", "", "", "other", "", "equals", "", "hashCode", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class lg extends java.lang.Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.logger.IronSourceError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.json.mediationsdk.logger.IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mediationsdk.logger.IronSourceError getError() {
        return this.error;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.json.lg.class, other.getClass())) {
            return false;
        }
        com.json.lg lgVar = (com.json.lg) other;
        if (this.error.getErrorCode() != lgVar.error.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.error.getErrorMessage(), lgVar.error.getErrorMessage());
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.error.getErrorCode()), this.error.getErrorMessage());
    }
}
