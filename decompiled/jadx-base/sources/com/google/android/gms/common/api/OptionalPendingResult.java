package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class OptionalPendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public abstract R get();

    public abstract boolean isDone();
}
