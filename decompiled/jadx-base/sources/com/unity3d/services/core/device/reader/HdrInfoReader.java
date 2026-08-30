package com.unity3d.services.core.device.reader;

/* JADX INFO: loaded from: classes6.dex */
public class HdrInfoReader implements com.unity3d.services.core.device.reader.IHdrInfoReader {
    private static final java.util.concurrent.atomic.AtomicBoolean _hdrMetricsCaptured = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static volatile com.unity3d.services.core.device.reader.HdrInfoReader _instance;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);

    private HdrInfoReader() {
    }

    public static com.unity3d.services.core.device.reader.HdrInfoReader getInstance() {
        if (_instance == null) {
            synchronized (com.unity3d.services.core.device.reader.HdrInfoReader.class) {
                if (_instance == null) {
                    _instance = new com.unity3d.services.core.device.reader.HdrInfoReader();
                }
            }
        }
        return _instance;
    }

    @Override // com.unity3d.services.core.device.reader.IHdrInfoReader
    public void captureHDRCapabilityMetrics(android.app.Activity activity, com.unity3d.services.core.configuration.ExperimentsReader experimentsReader) {
        if (activity != null && experimentsReader.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            if (_hdrMetricsCaptured.compareAndSet(false, true)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(5);
                android.view.Display.HdrCapabilities hdrCapabilities = ((android.view.WindowManager) activity.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i == 1) {
                        z = true;
                    } else if (i == 2) {
                        z2 = true;
                    } else if (i == 3) {
                        z4 = true;
                    } else if (i == 4) {
                        z3 = true;
                    }
                }
                long jRound = java.lang.Math.round(hdrCapabilities.getDesiredMaxAverageLuminance());
                long jRound2 = java.lang.Math.round(hdrCapabilities.getDesiredMaxLuminance());
                long jRound3 = java.lang.Math.round(hdrCapabilities.getDesiredMinLuminance());
                arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_lum_max_average", java.lang.Long.valueOf(jRound)));
                arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_lum_max", java.lang.Long.valueOf(jRound2)));
                arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_lum_min", java.lang.Long.valueOf(jRound3)));
                boolean zIsScreenHdr = android.os.Build.VERSION.SDK_INT >= 26 ? activity.getResources().getConfiguration().isScreenHdr() : false;
                if (z) {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_dolby_vision_success"));
                } else {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_dolby_vision_failure"));
                }
                if (z2) {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hdr10_success"));
                } else {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hdr10_failure"));
                }
                if (z3) {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hdr10_plus_success"));
                } else {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hdr10_plus_failure"));
                }
                if (z4) {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hlg_success"));
                } else {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_hlg_failure"));
                }
                if (zIsScreenHdr) {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_screen_hdr_success"));
                } else {
                    arrayList.add(new com.unity3d.services.core.request.metrics.Metric("native_device_hdr_screen_hdr_failure"));
                }
                this._sdkMetricsSender.sendMetrics(arrayList);
            }
        }
    }
}
