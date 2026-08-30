package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends java.lang.RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(java.lang.String str) {
        super(androidx.core.util.ObjectsCompat.toString(str, "The operation has been canceled."));
    }
}
