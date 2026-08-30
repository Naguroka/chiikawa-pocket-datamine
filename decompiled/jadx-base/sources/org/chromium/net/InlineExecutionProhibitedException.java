package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineExecutionProhibitedException extends java.util.concurrent.RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
