package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdError extends java.lang.Throwable {
    public static final int LOAD_FAILED = 1001;
    public static final int NETWORK_ERROR = 9001;
    public static final int NOT_PREPARED = 4001;
    public static final int NO_FILL = 1002;
    public static final int OUT_OF_MEMORY = 9002;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f119a;

    AMoAdError(int i, java.lang.String str) {
        this(i, str, null);
    }

    AMoAdError(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.f119a = i;
    }

    public final int getCode() {
        return this.f119a;
    }
}
