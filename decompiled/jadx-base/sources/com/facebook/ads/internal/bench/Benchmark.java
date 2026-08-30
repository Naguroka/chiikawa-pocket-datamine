package com.facebook.ads.internal.bench;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Benchmark {
    int failAtMillis() default Integer.MAX_VALUE;

    int warnAtMillis() default Integer.MAX_VALUE;
}
