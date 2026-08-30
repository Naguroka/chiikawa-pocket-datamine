package com.unity3d.ads.core.data.model.exception;

/* JADX INFO: compiled from: GatewayException.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/GatewayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "throwable", "", "reason", "reasonDebug", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getReason", "getReasonDebug", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GatewayException extends java.lang.Exception {
    public static final java.lang.String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";
    public static final java.lang.String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";
    private final java.lang.String message;
    private final java.lang.String reason;
    private final java.lang.String reasonDebug;
    private final java.lang.Throwable throwable;

    public static /* synthetic */ com.unity3d.ads.core.data.model.exception.GatewayException copy$default(com.unity3d.ads.core.data.model.exception.GatewayException gatewayException, java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = gatewayException.getMessage();
        }
        if ((i & 2) != 0) {
            th = gatewayException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        return gatewayException.copy(str, th, str2, str3);
    }

    public final java.lang.String component1() {
        return getMessage();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getReasonDebug() {
        return this.reasonDebug;
    }

    public final com.unity3d.ads.core.data.model.exception.GatewayException copy(java.lang.String message, java.lang.Throwable throwable, java.lang.String reason, java.lang.String reasonDebug) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        return new com.unity3d.ads.core.data.model.exception.GatewayException(message, throwable, reason, reasonDebug);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.data.model.exception.GatewayException)) {
            return false;
        }
        com.unity3d.ads.core.data.model.exception.GatewayException gatewayException = (com.unity3d.ads.core.data.model.exception.GatewayException) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getMessage(), gatewayException.getMessage()) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, gatewayException.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, gatewayException.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasonDebug, gatewayException.reasonDebug);
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        java.lang.Throwable th = this.throwable;
        int iHashCode2 = (((iHashCode + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
        java.lang.String str = this.reasonDebug;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "GatewayException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    public /* synthetic */ GatewayException(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final java.lang.String getReasonDebug() {
        return this.reasonDebug;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(java.lang.String message, java.lang.Throwable th, java.lang.String reason, java.lang.String str) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
