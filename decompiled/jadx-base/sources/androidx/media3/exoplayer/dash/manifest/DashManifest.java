package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class DashManifest implements androidx.media3.exoplayer.offline.FilterableManifest<androidx.media3.exoplayer.dash.manifest.DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final android.net.Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final java.util.List<androidx.media3.exoplayer.dash.manifest.Period> periods;
    public final androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation;
    public final long publishTimeMs;
    public final androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTiming;

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.dash.manifest.DashManifest copy(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    public DashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation, androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement, androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescriptionElement, android.net.Uri uri, java.util.List<androidx.media3.exoplayer.dash.manifest.Period> list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j2;
        this.minBufferTimeMs = j3;
        this.dynamic = z;
        this.minUpdatePeriodMs = j4;
        this.timeShiftBufferDepthMs = j5;
        this.suggestedPresentationDelayMs = j6;
        this.publishTimeMs = j7;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        this.periods = list == null ? java.util.Collections.emptyList() : list;
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final androidx.media3.exoplayer.dash.manifest.Period getPeriod(int i) {
        return this.periods.get(i);
    }

    public final long getPeriodDurationMs(int i) {
        long j;
        long j2;
        if (i == this.periods.size() - 1) {
            j = this.durationMs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            j2 = this.periods.get(i).startMs;
        } else {
            j = this.periods.get(i + 1).startMs;
            j2 = this.periods.get(i).startMs;
        }
        return j - j2;
    }

    public final long getPeriodDurationUs(int i) {
        return androidx.media3.common.util.Util.msToUs(getPeriodDurationMs(i));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final androidx.media3.exoplayer.dash.manifest.DashManifest copy(java.util.List<androidx.media3.common.StreamKey> list) {
        long j;
        java.util.LinkedList linkedList = new java.util.LinkedList(list);
        java.util.Collections.sort(linkedList);
        linkedList.add(new androidx.media3.common.StreamKey(-1, -1, -1));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j = androidx.media3.common.C.TIME_UNSET;
            if (i >= periodCount) {
                break;
            }
            if (((androidx.media3.common.StreamKey) linkedList.peek()).periodIndex != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != androidx.media3.common.C.TIME_UNSET) {
                    j2 += periodDurationMs;
                }
            } else {
                androidx.media3.exoplayer.dash.manifest.Period period = getPeriod(i);
                arrayList.add(new androidx.media3.exoplayer.dash.manifest.Period(period.id, period.startMs - j2, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i++;
        }
        long j3 = this.durationMs;
        if (j3 != androidx.media3.common.C.TIME_UNSET) {
            j = j3 - j2;
        }
        return new androidx.media3.exoplayer.dash.manifest.DashManifest(this.availabilityStartTimeMs, j, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }

    private static java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.AdaptationSet> copyAdaptationSets(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.LinkedList<androidx.media3.common.StreamKey> linkedList) {
        androidx.media3.common.StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.periodIndex;
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.AdaptationSet> arrayList = new java.util.ArrayList<>();
        do {
            int i2 = streamKeyPoll.groupIndex;
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i2);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list2 = adaptationSet.representations;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i2);
            arrayList.add(new androidx.media3.exoplayer.dash.manifest.AdaptationSet(adaptationSet.id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }
}
