package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecs {
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zza;
    private final android.content.Context zzb;

    zzecs(android.content.Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        try {
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures measurementManagerFuturesFrom = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(this.zzb);
            this.zza = measurementManagerFuturesFrom;
            return measurementManagerFuturesFrom == null ? com.google.android.gms.internal.ads.zzgch.zzg(new java.lang.IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzgch.zzg(e);
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.net.Uri uri, android.view.InputEvent inputEvent) {
        try {
            return ((androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures) java.util.Objects.requireNonNull(this.zza)).registerSourceAsync(uri, inputEvent);
        } catch (java.lang.Exception e) {
            return com.google.android.gms.internal.ads.zzgch.zzg(e);
        }
    }
}
