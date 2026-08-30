package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class DebugTraceUtil {
    private static final boolean ENABLE_TRACES_IN_LOGCAT = false;
    public static final java.lang.String EVENT_RECEIVE_EOS = "ReceiveEOS";
    private static final int MAX_FIRST_LAST_LOGS = 10;
    public static boolean enableTracing = false;
    public static final java.lang.String COMPONENT_ASSET_LOADER = "AssetLoader";
    public static final java.lang.String EVENT_INPUT_FORMAT = "InputFormat";
    public static final java.lang.String EVENT_OUTPUT_FORMAT = "OutputFormat";
    public static final java.lang.String COMPONENT_AUDIO_DECODER = "AudioDecoder";
    public static final java.lang.String EVENT_ACCEPTED_INPUT = "AcceptedInput";
    public static final java.lang.String EVENT_PRODUCED_OUTPUT = "ProducedOutput";
    public static final java.lang.String EVENT_INPUT_ENDED = "InputEnded";
    public static final java.lang.String EVENT_OUTPUT_ENDED = "OutputEnded";
    public static final java.lang.String COMPONENT_AUDIO_GRAPH = "AudioGraph";
    public static final java.lang.String EVENT_REGISTER_NEW_INPUT_STREAM = "RegisterNewInputStream";
    public static final java.lang.String COMPONENT_AUDIO_MIXER = "AudioMixer";
    public static final java.lang.String COMPONENT_AUDIO_ENCODER = "AudioEncoder";
    public static final java.lang.String COMPONENT_VIDEO_DECODER = "VideoDecoder";
    public static final java.lang.String COMPONENT_VFP = "VFP";
    public static final java.lang.String EVENT_SURFACE_TEXTURE_INPUT = "SurfaceTextureInput";
    public static final java.lang.String EVENT_QUEUE_FRAME = "QueueFrame";
    public static final java.lang.String EVENT_QUEUE_BITMAP = "QueueBitmap";
    public static final java.lang.String EVENT_QUEUE_TEXTURE = "QueueTexture";
    public static final java.lang.String EVENT_RENDERED_TO_OUTPUT_SURFACE = "RenderedToOutputSurface";
    public static final java.lang.String EVENT_OUTPUT_TEXTURE_RENDERED = "OutputTextureRendered";
    public static final java.lang.String EVENT_RECEIVE_END_OF_ALL_INPUT = "ReceiveEndOfAllInput";
    public static final java.lang.String EVENT_SIGNAL_ENDED = "SignalEnded";
    public static final java.lang.String COMPONENT_EXTERNAL_TEXTURE_MANAGER = "ExternalTextureManager";
    public static final java.lang.String EVENT_SIGNAL_EOS = "SignalEOS";
    public static final java.lang.String EVENT_SURFACE_TEXTURE_TRANSFORM_FIX = "SurfaceTextureTransformFix";
    public static final java.lang.String COMPONENT_BITMAP_TEXTURE_MANAGER = "BitmapTextureManager";
    public static final java.lang.String COMPONENT_TEX_ID_TEXTURE_MANAGER = "TexIdTextureManager";
    public static final java.lang.String COMPONENT_COMPOSITOR = "Compositor";
    public static final java.lang.String COMPONENT_VIDEO_ENCODER = "VideoEncoder";
    public static final java.lang.String COMPONENT_MUXER = "Muxer";
    public static final java.lang.String EVENT_CAN_WRITE_SAMPLE = "CanWriteSample";
    private static final com.google.common.collect.ImmutableMap<java.lang.String, java.util.List<java.lang.String>> COMPONENTS_TO_EVENTS = com.google.common.collect.ImmutableMap.builder().put(COMPONENT_ASSET_LOADER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_OUTPUT_FORMAT)).put(COMPONENT_AUDIO_DECODER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_OUTPUT_FORMAT, EVENT_ACCEPTED_INPUT, EVENT_PRODUCED_OUTPUT, EVENT_INPUT_ENDED, EVENT_OUTPUT_ENDED)).put(COMPONENT_AUDIO_GRAPH, com.google.common.collect.ImmutableList.of(EVENT_REGISTER_NEW_INPUT_STREAM, EVENT_OUTPUT_ENDED)).put(COMPONENT_AUDIO_MIXER, com.google.common.collect.ImmutableList.of(EVENT_REGISTER_NEW_INPUT_STREAM, EVENT_OUTPUT_FORMAT, EVENT_PRODUCED_OUTPUT)).put(COMPONENT_AUDIO_ENCODER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_OUTPUT_FORMAT, EVENT_ACCEPTED_INPUT, EVENT_PRODUCED_OUTPUT, EVENT_INPUT_ENDED, EVENT_OUTPUT_ENDED)).put(COMPONENT_VIDEO_DECODER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_OUTPUT_FORMAT, EVENT_ACCEPTED_INPUT, EVENT_PRODUCED_OUTPUT, EVENT_INPUT_ENDED, EVENT_OUTPUT_ENDED)).put(COMPONENT_VFP, com.google.common.collect.ImmutableList.of(EVENT_REGISTER_NEW_INPUT_STREAM, EVENT_SURFACE_TEXTURE_INPUT, EVENT_QUEUE_FRAME, EVENT_QUEUE_BITMAP, EVENT_QUEUE_TEXTURE, EVENT_RENDERED_TO_OUTPUT_SURFACE, EVENT_OUTPUT_TEXTURE_RENDERED, EVENT_RECEIVE_END_OF_ALL_INPUT, EVENT_SIGNAL_ENDED)).put(COMPONENT_EXTERNAL_TEXTURE_MANAGER, com.google.common.collect.ImmutableList.of(EVENT_SIGNAL_EOS, EVENT_SURFACE_TEXTURE_TRANSFORM_FIX)).put(COMPONENT_BITMAP_TEXTURE_MANAGER, com.google.common.collect.ImmutableList.of(EVENT_SIGNAL_EOS)).put(COMPONENT_TEX_ID_TEXTURE_MANAGER, com.google.common.collect.ImmutableList.of(EVENT_SIGNAL_EOS)).put(COMPONENT_COMPOSITOR, com.google.common.collect.ImmutableList.of(EVENT_OUTPUT_TEXTURE_RENDERED)).put(COMPONENT_VIDEO_ENCODER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_OUTPUT_FORMAT, EVENT_ACCEPTED_INPUT, EVENT_PRODUCED_OUTPUT, EVENT_INPUT_ENDED, EVENT_OUTPUT_ENDED)).put(COMPONENT_MUXER, com.google.common.collect.ImmutableList.of(EVENT_INPUT_FORMAT, EVENT_CAN_WRITE_SAMPLE, EVENT_ACCEPTED_INPUT, EVENT_INPUT_ENDED, EVENT_OUTPUT_ENDED)).buildOrThrow();
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger>> componentsToEventsToLogs = new java.util.LinkedHashMap();
    private static long startTimeMs = androidx.media3.common.util.SystemClock.DEFAULT.elapsedRealtime();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Component {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Event {
    }

    private static java.lang.String getCodecComponent(boolean z, boolean z2) {
        if (z) {
            return z2 ? COMPONENT_VIDEO_DECODER : COMPONENT_AUDIO_DECODER;
        }
        return z2 ? COMPONENT_VIDEO_ENCODER : COMPONENT_AUDIO_ENCODER;
    }

    public static synchronized void reset() {
        componentsToEventsToLogs.clear();
        startTimeMs = androidx.media3.common.util.SystemClock.DEFAULT.elapsedRealtime();
    }

    public static synchronized void logEvent(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.Object... objArr) {
        if (enableTracing) {
            long jElapsedRealtime = androidx.media3.common.util.SystemClock.DEFAULT.elapsedRealtime() - startTimeMs;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger>> map = componentsToEventsToLogs;
            if (!map.containsKey(str)) {
                map.put(str, new java.util.LinkedHashMap());
            }
            java.util.Map<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger> map2 = map.get(str);
            if (!map2.containsKey(str2)) {
                map2.put(str2, new androidx.media3.effect.DebugTraceUtil.EventLogger());
            }
            map2.get(str2).addLog(new androidx.media3.effect.DebugTraceUtil.EventLog(j, jElapsedRealtime, androidx.media3.common.util.Util.formatInvariant(str3, objArr)));
        }
    }

    public static synchronized void logEvent(java.lang.String str, java.lang.String str2, long j) {
        logEvent(str, str2, j, "", new java.lang.Object[0]);
    }

    public static synchronized void logCodecEvent(boolean z, boolean z2, java.lang.String str, long j, java.lang.String str2, java.lang.Object... objArr) {
        logEvent(getCodecComponent(z, z2), str, j, str2, objArr);
    }

    public static synchronized java.lang.String generateTraceSummary() {
        try {
            if (!enableTracing) {
                return "\"Tracing disabled\"";
            }
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            try {
                try {
                    jsonWriter.beginObject();
                    com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it = COMPONENTS_TO_EVENTS.entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it.next();
                        java.lang.String key = next.getKey();
                        java.util.List<java.lang.String> value = next.getValue();
                        jsonWriter.name(key);
                        java.util.Map<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger> map = componentsToEventsToLogs.get(key);
                        jsonWriter.beginObject();
                        for (java.lang.String str : value) {
                            jsonWriter.name(str);
                            if (map != null && map.containsKey(str)) {
                                ((androidx.media3.effect.DebugTraceUtil.EventLogger) androidx.media3.common.util.Assertions.checkNotNull(map.get(str))).toJson(jsonWriter);
                            } else {
                                jsonWriter.value("No events");
                            }
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endObject();
                    java.lang.String string = stringWriter.toString();
                    androidx.media3.common.util.Util.closeQuietly(jsonWriter);
                    return string;
                } catch (java.lang.Throwable th) {
                    androidx.media3.common.util.Util.closeQuietly(jsonWriter);
                    throw th;
                }
            } catch (java.io.IOException unused) {
                androidx.media3.common.util.Util.closeQuietly(jsonWriter);
                return "\"Error generating trace summary\"";
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void dumpTsv(java.io.Writer writer) throws java.io.IOException {
        if (!enableTracing) {
            writer.write("Tracing disabled");
            return;
        }
        writer.write("component\tevent\ttimestamp\tpresentation\textra\n");
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger>> entry : componentsToEventsToLogs.entrySet()) {
            java.lang.String key = entry.getKey();
            for (java.util.Map.Entry<java.lang.String, androidx.media3.effect.DebugTraceUtil.EventLogger> entry2 : entry.getValue().entrySet()) {
                java.lang.String key2 = entry2.getKey();
                com.google.common.collect.UnmodifiableIterator<androidx.media3.effect.DebugTraceUtil.EventLog> it = entry2.getValue().getLogs().iterator();
                while (it.hasNext()) {
                    androidx.media3.effect.DebugTraceUtil.EventLog next = it.next();
                    writer.write(androidx.media3.common.util.Util.formatInvariant("%s\t%s\t%dms\t%s\t%s\n", key, key2, java.lang.Long.valueOf(next.eventTimeMs), presentationTimeToString(next.presentationTimeUs), next.extra));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String presentationTimeToString(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return "UNSET";
        }
        return j == Long.MIN_VALUE ? "EOS" : j + "us";
    }

    private static final class EventLog {
        public final long eventTimeMs;
        public final java.lang.String extra;
        public final long presentationTimeUs;

        private EventLog(long j, long j2, java.lang.String str) {
            this.presentationTimeUs = j;
            this.eventTimeMs = j2;
            this.extra = str;
        }

        public java.lang.String toString() {
            return androidx.media3.common.util.Util.formatInvariant("%s@%dms", androidx.media3.effect.DebugTraceUtil.presentationTimeToString(this.presentationTimeUs), java.lang.Long.valueOf(this.eventTimeMs)) + (this.extra.isEmpty() ? "" : androidx.media3.common.util.Util.formatInvariant("(%s)", this.extra));
        }
    }

    private static final class EventLogger {
        private final java.util.List<androidx.media3.effect.DebugTraceUtil.EventLog> firstLogs = new java.util.ArrayList(10);
        private final java.util.Queue<androidx.media3.effect.DebugTraceUtil.EventLog> lastLogs = new java.util.ArrayDeque(10);
        private int totalCount = 0;

        public void addLog(androidx.media3.effect.DebugTraceUtil.EventLog eventLog) {
            if (this.firstLogs.size() < 10) {
                this.firstLogs.add(eventLog);
            } else {
                this.lastLogs.add(eventLog);
                if (this.lastLogs.size() > 10) {
                    this.lastLogs.remove();
                }
            }
            this.totalCount++;
        }

        public com.google.common.collect.ImmutableList<androidx.media3.effect.DebugTraceUtil.EventLog> getLogs() {
            return new com.google.common.collect.ImmutableList.Builder().addAll((java.lang.Iterable) this.firstLogs).addAll((java.lang.Iterable) this.lastLogs).build();
        }

        public void toJson(android.util.JsonWriter jsonWriter) throws java.io.IOException {
            jsonWriter.beginObject().name("count").value(this.totalCount).name("first").beginArray();
            java.util.Iterator<androidx.media3.effect.DebugTraceUtil.EventLog> it = this.firstLogs.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next().toString());
            }
            jsonWriter.endArray();
            if (!this.lastLogs.isEmpty()) {
                jsonWriter.name("last").beginArray();
                java.util.Iterator<androidx.media3.effect.DebugTraceUtil.EventLog> it2 = this.lastLogs.iterator();
                while (it2.hasNext()) {
                    jsonWriter.value(it2.next().toString());
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        }
    }
}
