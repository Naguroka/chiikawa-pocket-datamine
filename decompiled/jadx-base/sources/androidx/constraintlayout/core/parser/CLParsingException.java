package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends java.lang.Exception {
    private final java.lang.String mElementClass;
    private final int mLineNumber;
    private final java.lang.String mReason;

    public CLParsingException(java.lang.String str, androidx.constraintlayout.core.parser.CLElement cLElement) {
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            this.mLineNumber = cLElement.getLine();
        } else {
            this.mElementClass = "unknown";
            this.mLineNumber = 0;
        }
    }

    public java.lang.String reason() {
        return this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")";
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
