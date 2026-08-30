package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultBandwidthMeter implements androidx.media3.exoplayer.upstream.BandwidthMeter, androidx.media3.datasource.TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static androidx.media3.exoplayer.upstream.DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final androidx.media3.exoplayer.upstream.SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = com.google.common.collect.ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final com.google.common.collect.ImmutableList<java.lang.Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = com.google.common.collect.ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public androidx.media3.datasource.TransferListener getTransferListener() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z) {
    }

    static {
        java.lang.Long lValueOf = java.lang.Long.valueOf(androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = com.google.common.collect.ImmutableList.of((long) lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = com.google.common.collect.ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = com.google.common.collect.ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = com.google.common.collect.ImmutableList.of(2700000L, (long) lValueOf, 1600000L, 1300000L, 1000000L);
    }

    public static final class Builder {
        private androidx.media3.common.util.Clock clock;
        private final android.content.Context context;
        private java.util.Map<java.lang.Integer, java.lang.Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(android.content.Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(androidx.media3.common.util.Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = androidx.media3.common.util.Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(long j) {
            java.util.Iterator<java.lang.Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j);
            }
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(int i, long j) {
            this.initialBitrateEstimates.put(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j));
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setInitialBitrateEstimate(java.lang.String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(com.google.common.base.Ascii.toUpperCase(str));
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder setResetOnNetworkTypeChange(boolean z) {
            this.resetOnNetworkTypeChange = z;
            return this;
        }

        public androidx.media3.exoplayer.upstream.DefaultBandwidthMeter build() {
            return new androidx.media3.exoplayer.upstream.DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        private static java.util.Map<java.lang.Integer, java.lang.Long> getInitialBitrateEstimatesForCountry(java.lang.String str) {
            int[] initialBitrateCountryGroupAssignment = androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            java.util.HashMap map = new java.util.HashMap(8);
            map.put(0, 1000000L);
            map.put(2, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }
    }

    public static synchronized androidx.media3.exoplayer.upstream.DefaultBandwidthMeter getSingletonInstance(android.content.Context context) {
        if (singletonInstance == null) {
            singletonInstance = new androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.Builder(context).build();
        }
        return singletonInstance;
    }

    private DefaultBandwidthMeter(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Long> map, int i, androidx.media3.common.util.Clock clock, boolean z) {
        this.initialBitrateEstimates = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
        this.eventDispatcher = new androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new androidx.media3.exoplayer.upstream.SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context != null) {
            androidx.media3.common.util.NetworkTypeObserver networkTypeObserver = androidx.media3.common.util.NetworkTypeObserver.getInstance(context);
            int networkType = networkTypeObserver.getNetworkType();
            this.networkType = networkType;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
            networkTypeObserver.register(new androidx.media3.common.util.NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
                public final void onNetworkTypeChanged(int i2) {
                    this.f$0.onNetworkTypeChanged(i2);
                }
            });
            return;
        }
        this.networkType = 0;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
    }

    public synchronized void setNetworkTypeOverride(int i) {
        this.networkTypeOverride = i;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        androidx.media3.common.util.Assertions.checkNotNull(handler);
        androidx.media3.common.util.Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += (long) i;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, boolean z) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            androidx.media3.common.util.Assertions.checkState(this.streamCount > 0);
            long jElapsedRealtime = this.clock.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.sampleStartTimeMs);
            this.totalElapsedTimeMs += (long) i;
            long j = this.totalBytesTransferred;
            long j2 = this.sampleBytesTransferred;
            this.totalBytesTransferred = j + j2;
            if (i > 0) {
                this.slidingPercentile.addSample((int) java.lang.Math.sqrt(j2), (j2 * 8000.0f) / i);
                if (this.totalElapsedTimeMs >= 2000 || this.totalBytesTransferred >= 524288) {
                    this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                }
                maybeNotifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
            }
            this.streamCount--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) {
        int i2 = this.networkType;
        if (i2 == 0 || this.resetOnNetworkTypeChange) {
            if (this.networkTypeOverrideSet) {
                i = this.networkTypeOverride;
            }
            if (i2 == i) {
                return;
            }
            this.networkType = i;
            if (i != 1 && i != 0 && i != 8) {
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            }
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        java.lang.Long l = this.initialBitrateEstimates.get(java.lang.Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean isTransferAtFullNetworkSpeed(androidx.media3.datasource.DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(java.lang.String str) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b = 12;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_READY_FALSE /* 2102 */:
                if (str.equals("AW")) {
                    b = 13;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                if (str.equals("AX")) {
                    b = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b = 15;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR /* 2111 */:
                if (str.equals("BA")) {
                    b = 16;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_DISPLAYED /* 2112 */:
                if (str.equals("BB")) {
                    b = 17;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_CLICKED /* 2114 */:
                if (str.equals("BD")) {
                    b = 18;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED /* 2115 */:
                if (str.equals("BE")) {
                    b = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b = 20;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b = 21;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b = 22;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b = 23;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b = 24;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b = 25;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b = 26;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b = 27;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b = 28;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b = 29;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b = 30;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b = 31;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b = 59;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.IS_INSTANCE_INIT_FAILED /* 2206 */:
                if (str.equals("EC")) {
                    b = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b = kotlin.io.encoding.Base64.padSymbol;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b = okio.Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b = 64;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b = 90;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b = 91;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b = 92;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b = 93;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b = 94;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b = 95;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b = 96;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b = 97;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b = 98;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b = 99;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b = 100;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b = 101;
                }
                break;
            case 2346:
                if (str.equals(com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    b = 102;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b = 103;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b = 104;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b = 105;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b = 106;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b = 107;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b = 108;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b = 109;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b = 110;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b = 111;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b = 112;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b = 118;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b = 120;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b = 127;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b = 128;
                }
                break;
            case 2452:
                if (str.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    b = 129;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b = 131;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b = 133;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b = 135;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b = 138;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b = 139;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b = 140;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b = 141;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b = 142;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b = 144;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b = 154;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    b = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b = 160;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b = 167;
                }
                break;
            case 2551:
                if (str.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    b = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b = 187;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b = 188;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b = 191;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b = 192;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b = 194;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b = 202;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b = 205;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b = 207;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b = 208;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b = 210;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b = 213;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b = 214;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b = 216;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b = 218;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b = 220;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b = 223;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b = 224;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b = 225;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b = 226;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b = 227;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b = 228;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b = 229;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b = 230;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b = 231;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b = 232;
                }
                break;
            case com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT /* 2803 */:
                if (str.equals("XK")) {
                    b = 233;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b = 234;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b = 235;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b = 236;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b = 237;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b = 238;
                }
                break;
        }
        switch (b) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case com.ironsource.g3.c.b.INSTANCE_LOAD_SUCCESS /* 202 */:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case 41:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case org.objectweb.asm.Opcodes.IF_ICMPGE /* 162 */:
            case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
            case org.objectweb.asm.Opcodes.ARRAYLENGTH /* 190 */:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case org.objectweb.asm.Opcodes.I2B /* 145 */:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case org.objectweb.asm.Opcodes.D2F /* 144 */:
            case 172:
            case org.objectweb.asm.Opcodes.MONITOREXIT /* 195 */:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case org.objectweb.asm.Opcodes.MONITORENTER /* 194 */:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case org.objectweb.asm.Opcodes.NEW /* 187 */:
            case com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED /* 203 */:
            case com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD /* 206 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case org.objectweb.asm.Opcodes.DRETURN /* 175 */:
            case org.objectweb.asm.Opcodes.ATHROW /* 191 */:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case org.objectweb.asm.Opcodes.L2F /* 137 */:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 39:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case 44:
            case org.objectweb.asm.Opcodes.D2L /* 143 */:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 45:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case 74:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 81:
            case org.objectweb.asm.Opcodes.IFNONNULL /* 199 */:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 82:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case org.objectweb.asm.Opcodes.JSR /* 168 */:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case org.objectweb.asm.Opcodes.IINC /* 132 */:
                return new int[]{2, 0, 0, 1, 3, 2};
            case org.objectweb.asm.Opcodes.I2L /* 133 */:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case org.objectweb.asm.Opcodes.D2I /* 142 */:
                return new int[]{2, 1, 2, 3, 2, 2};
            case org.objectweb.asm.Opcodes.I2C /* 146 */:
                return new int[]{3, 1, 0, 2, 2, 2};
            case org.objectweb.asm.Opcodes.I2S /* 147 */:
                return new int[]{3, 2, 1, 3, 4, 2};
            case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                return new int[]{3, 2, 2, 1, 2, 2};
            case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                return new int[]{0, 0, 3, 0, 0, 2};
            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
                return new int[]{2, 2, 4, 3, 2, 2};
            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                return new int[]{0, 0, 1, 2, 4, 2};
            case org.objectweb.asm.Opcodes.IF_ICMPLE /* 164 */:
                return new int[]{2, 3, 1, 2, 4, 2};
            case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                return new int[]{1, 2, 4, 4, 3, 2};
            case org.objectweb.asm.Opcodes.GOTO /* 167 */:
                return new int[]{2, 2, 3, 1, 2, 2};
            case org.objectweb.asm.Opcodes.RET /* 169 */:
                return new int[]{2, 1, 2, 3, 2, 1};
            case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
                return new int[]{3, 3, 3, 3, 2, 2};
            case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                return new int[]{1, 0, 2, 2, 4, 4};
            case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                return new int[]{2, 0, 2, 1, 2, 0};
            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
                return new int[]{3, 4, 1, 3, 2, 2};
            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case org.objectweb.asm.Opcodes.GETSTATIC /* 178 */:
                return new int[]{1, 4, 4, 4, 4, 2};
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                return new int[]{0, 3, 2, 3, 1, 2};
            case org.objectweb.asm.Opcodes.GETFIELD /* 180 */:
                return new int[]{0, 0, 1, 1, 3, 2};
            case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
                return new int[]{1, 0, 0, 1, 2, 2};
            case org.objectweb.asm.Opcodes.INVOKEVIRTUAL /* 182 */:
                return new int[]{1, 0, 0, 1, 3, 3};
            case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
                return new int[]{3, 3, 2, 0, 2, 2};
            case org.objectweb.asm.Opcodes.INVOKESTATIC /* 184 */:
                return new int[]{3, 1, 1, 2, 2, 0};
            case org.objectweb.asm.Opcodes.INVOKEINTERFACE /* 185 */:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case org.objectweb.asm.Opcodes.INSTANCEOF /* 193 */:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case org.objectweb.asm.Opcodes.MULTIANEWARRAY /* 197 */:
                return new int[]{2, 2, 3, 4, 4, 2};
            case org.objectweb.asm.Opcodes.IFNULL /* 198 */:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case com.ironsource.g3.c.b.INSTANCE_LOAD /* 201 */:
                return new int[]{2, 3, 2, 1, 2, 2};
            case com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS /* 205 */:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }
}
