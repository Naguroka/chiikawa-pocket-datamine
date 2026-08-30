package com.unity3d.ads.core.utils;

/* JADX INFO: compiled from: CoroutineTimer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/utils/CoroutineTimer;", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "Lkotlinx/coroutines/Job;", "delayStartMillis", "", "repeatMillis", "action", "Lkotlin/Function0;", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CoroutineTimer {
    kotlinx.coroutines.Job start(long delayStartMillis, long repeatMillis, kotlin.jvm.functions.Function0<kotlin.Unit> action);
}
