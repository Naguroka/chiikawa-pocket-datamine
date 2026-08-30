package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ir;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "errorMessage", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ir {
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String errorMessage;

    public ir(int i, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorCode = i;
        this.errorMessage = errorMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ir(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        java.lang.String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public static /* synthetic */ com.json.ir a(com.json.ir irVar, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = irVar.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = irVar.errorMessage;
        }
        return irVar.a(i, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public final com.json.ir a(int errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new com.json.ir(errorCode, errorMessage);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final int c() {
        return this.errorCode;
    }

    public final java.lang.String d() {
        return this.errorMessage;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.ir)) {
            return false;
        }
        com.json.ir irVar = (com.json.ir) other;
        return this.errorCode == irVar.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, irVar.errorMessage);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
    }

    public java.lang.String toString() {
        return "SdkError(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
    }
}
