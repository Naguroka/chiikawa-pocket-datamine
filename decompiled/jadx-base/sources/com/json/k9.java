package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/k9;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "throwable", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "stackTrace", "Z", "d", "()Z", "isIronsourceCrash", "<init>", "(Ljava/lang/Throwable;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.Throwable throwable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String stackTrace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isIronsourceCrash;

    public k9(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(java.lang.System.lineSeparator());
        boolean z = false;
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + java.lang.System.lineSeparator());
            java.lang.String string = stackTraceElement.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "elem.toString()");
            java.lang.String strE = com.json.l9.d().e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strE, "getInstance().keyword");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) strE, false, 2, (java.lang.Object) null)) {
                z = true;
            }
        }
        java.lang.Throwable cause = this.throwable.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(java.lang.System.lineSeparator());
            sb.append(cause.toString());
            sb.append(java.lang.System.lineSeparator());
            java.lang.StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (java.lang.StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + java.lang.System.lineSeparator());
                java.lang.String string2 = stackTraceElement2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "elem.toString()");
                java.lang.String strE2 = com.json.l9.d().e();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strE2, "getInstance().keyword");
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) string2, (java.lang.CharSequence) strE2, false, 2, (java.lang.Object) null)) {
                    z = true;
                }
            }
        }
        java.lang.String string3 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "builder.toString()");
        this.stackTrace = string3;
        this.isIronsourceCrash = z;
    }

    public static /* synthetic */ com.json.k9 a(com.json.k9 k9Var, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = k9Var.throwable;
        }
        return k9Var.a(th);
    }

    public final com.json.k9 a(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new com.json.k9(throwable);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getStackTrace() {
        return this.stackTrace;
    }

    public final java.lang.Throwable c() {
        return this.throwable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsIronsourceCrash() {
        return this.isIronsourceCrash;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.k9) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.json.k9) other).throwable);
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public java.lang.String toString() {
        return "CrashReportWrapper(throwable=" + this.throwable + ')';
    }
}
