package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: MeasurementManagerApi31Ext9Impl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerApi31Ext9Impl;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasurementManagerApi31Ext9Impl extends androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public MeasurementManagerApi31Ext9Impl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.adservices.measurement.MeasurementManager measurementManager = android.adservices.measurement.MeasurementManager.get(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
        super(measurementManager);
    }
}
