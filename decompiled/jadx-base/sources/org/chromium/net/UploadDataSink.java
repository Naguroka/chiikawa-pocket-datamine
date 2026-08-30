package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(java.lang.Exception exc);

    public abstract void onReadSucceeded(boolean z);

    public abstract void onRewindError(java.lang.Exception exc);

    public abstract void onRewindSucceeded();
}
