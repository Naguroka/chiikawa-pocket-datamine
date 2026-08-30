package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcj {
    private static java.util.List zzb;
    private static final java.util.Map zza = new java.util.HashMap();
    private static final java.lang.Object zzc = new java.lang.Object();

    public static java.util.List zza(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.lang.Object obj = zzc;
        synchronized (obj) {
            java.util.Map map = zza;
            if (map.containsKey(str)) {
                return (java.util.List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (zzb == null) {
                        zzb = java.util.Arrays.asList(new android.media.MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new java.util.ArrayList();
                    for (android.media.MediaCodecInfo mediaCodecInfo : zzb) {
                        if (!mediaCodecInfo.isEncoder() && java.util.Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            java.util.HashMap map2 = new java.util.HashMap();
                            map2.put("codecName", mediaCodecInfo.getName());
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new java.lang.Integer[]{java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level)});
                            }
                            map2.put("profileLevels", arrayList2);
                            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map2.put("bitRatesBps", zzb(videoCapabilities.getBitrateRange()));
                            map2.put("widthAlignment", java.lang.Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map2.put("heightAlignment", java.lang.Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map2.put("frameRates", zzb(videoCapabilities.getSupportedFrameRates()));
                            map2.put("widths", zzb(videoCapabilities.getSupportedWidths()));
                            map2.put("heights", zzb(videoCapabilities.getSupportedHeights()));
                            map2.put("instancesLimit", java.lang.Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(map2);
                        }
                    }
                    zza.put(str, arrayList);
                }
                return arrayList;
            } catch (java.lang.LinkageError | java.lang.RuntimeException e) {
                java.util.HashMap map3 = new java.util.HashMap();
                map3.put("error", e.getClass().getSimpleName());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(map3);
                zza.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    private static java.lang.Integer[] zzb(android.util.Range range) {
        return new java.lang.Integer[]{(java.lang.Integer) range.getLower(), (java.lang.Integer) range.getUpper()};
    }
}
