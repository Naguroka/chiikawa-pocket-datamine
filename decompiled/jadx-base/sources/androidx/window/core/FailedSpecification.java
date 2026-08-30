package androidx.window.core;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0017J/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/window/core/FailedSpecification;", "T", "", "Landroidx/window/core/SpecificationComputer;", "value", "tag", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "logger", "Landroidx/window/core/Logger;", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "exception", "Landroidx/window/core/WindowStrictModeException;", "getException", "()Landroidx/window/core/WindowStrictModeException;", "getLogger", "()Landroidx/window/core/Logger;", "getMessage", "()Ljava/lang/String;", "getTag", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getVerificationMode", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "compute", "require", "condition", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class FailedSpecification<T> extends androidx.window.core.SpecificationComputer<T> {
    private final androidx.window.core.WindowStrictModeException exception;
    private final androidx.window.core.Logger logger;
    private final java.lang.String message;
    private final java.lang.String tag;
    private final T value;
    private final androidx.window.core.SpecificationComputer.VerificationMode verificationMode;

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.window.core.SpecificationComputer.VerificationMode.values().length];
            iArr[androidx.window.core.SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[androidx.window.core.SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[androidx.window.core.SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final T getValue() {
        return this.value;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final androidx.window.core.Logger getLogger() {
        return this.logger;
    }

    public final androidx.window.core.SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public FailedSpecification(T value, java.lang.String tag, java.lang.String message, androidx.window.core.Logger logger, androidx.window.core.SpecificationComputer.VerificationMode verificationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        androidx.window.core.WindowStrictModeException windowStrictModeException = new androidx.window.core.WindowStrictModeException(createMessage(value, message));
        java.lang.StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        java.lang.Object[] array = kotlin.collections.ArraysKt.drop(stackTrace, 2).toArray(new java.lang.StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((java.lang.StackTraceElement[]) array);
            this.exception = windowStrictModeException;
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final androidx.window.core.WindowStrictModeException getException() {
        return this.exception;
    }

    @Override // androidx.window.core.SpecificationComputer
    public androidx.window.core.SpecificationComputer<T> require(java.lang.String message, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> condition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() throws androidx.window.core.WindowStrictModeException {
        int i = androidx.window.core.FailedSpecification.WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i == 1) {
            throw this.exception;
        }
        if (i == 2) {
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
