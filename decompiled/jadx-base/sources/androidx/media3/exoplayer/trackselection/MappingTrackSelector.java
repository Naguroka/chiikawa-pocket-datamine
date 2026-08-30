package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class MappingTrackSelector extends androidx.media3.exoplayer.trackselection.TrackSelector {
    private androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo;

    protected abstract android.util.Pair<androidx.media3.exoplayer.RendererConfiguration[], androidx.media3.exoplayer.trackselection.ExoTrackSelection[]> selectTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException;

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final java.lang.String[] rendererNames;
        private final androidx.media3.exoplayer.source.TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final androidx.media3.exoplayer.source.TrackGroupArray unmappedTrackGroups;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        MappedTrackInfo(java.lang.String[] strArr, int[] iArr, androidx.media3.exoplayer.source.TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public java.lang.String getRendererName(int i) {
            return this.rendererNames[i];
        }

        public int getRendererType(int i) {
            return this.rendererTrackTypes[i];
        }

        public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups(int i) {
            return this.rendererTrackGroups[i];
        }

        public int getRendererSupport(int i) {
            int iMax = 0;
            for (int[] iArr : this.rendererFormatSupports[i]) {
                for (int i2 : iArr) {
                    int formatSupport = androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(i2);
                    int i3 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new java.lang.IllegalStateException();
                        }
                        i3 = 2;
                    }
                    iMax = java.lang.Math.max(iMax, i3);
                }
            }
            return iMax;
        }

        public int getTypeSupport(int i) {
            int iMax = 0;
            for (int i2 = 0; i2 < this.rendererCount; i2++) {
                if (this.rendererTrackTypes[i2] == i) {
                    iMax = java.lang.Math.max(iMax, getRendererSupport(i2));
                }
            }
            return iMax;
        }

        public int getCapabilities(int i, int i2, int i3) {
            return this.rendererFormatSupports[i][i2][i3];
        }

        public int getTrackSupport(int i, int i2, int i3) {
            return androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(getCapabilities(i, i2, i3));
        }

        public int getAdaptiveSupport(int i, int i2, boolean z) {
            int i3 = this.rendererTrackGroups[i].get(i2).length;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int trackSupport = getTrackSupport(i, i2, i5);
                if (trackSupport == 4 || (z && trackSupport == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return getAdaptiveSupport(i, i2, java.util.Arrays.copyOf(iArr, i4));
        }

        public int getAdaptiveSupport(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            java.lang.String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                java.lang.String str2 = this.rendererTrackGroups[i].get(i2).getFormat(iArr[i3]).sampleMimeType;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !androidx.media3.common.util.Util.areEqual(str, str2);
                }
                iMin = java.lang.Math.min(iMin, androidx.media3.exoplayer.RendererCapabilities.getAdaptiveSupport(this.rendererFormatSupports[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? java.lang.Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i]) : iMin;
        }

        public androidx.media3.exoplayer.source.TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }
    }

    public final androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void onSelectionActivated(java.lang.Object obj) {
        this.currentMappedTrackInfo = (androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo) obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException {
        int[] formatSupport;
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        androidx.media3.common.TrackGroup[][] trackGroupArr = new androidx.media3.common.TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            trackGroupArr[i] = new androidx.media3.common.TrackGroup[trackGroupArray.length];
            iArr2[i] = new int[trackGroupArray.length][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i2 = 0; i2 < trackGroupArray.length; i2++) {
            androidx.media3.common.TrackGroup trackGroup = trackGroupArray.get(i2);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, trackGroup.type == 5);
            if (iFindRenderer == rendererCapabilitiesArr.length) {
                formatSupport = new int[trackGroup.length];
            } else {
                formatSupport = getFormatSupport(rendererCapabilitiesArr[iFindRenderer], trackGroup);
            }
            int i3 = iArr[iFindRenderer];
            trackGroupArr[iFindRenderer][i3] = trackGroup;
            iArr2[iFindRenderer][i3] = formatSupport;
            iArr[iFindRenderer] = i3 + 1;
        }
        androidx.media3.exoplayer.source.TrackGroupArray[] trackGroupArrayArr = new androidx.media3.exoplayer.source.TrackGroupArray[rendererCapabilitiesArr.length];
        java.lang.String[] strArr = new java.lang.String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(trackGroupArr[i4], i5));
            iArr2[i4] = (int[][]) androidx.media3.common.util.Util.nullSafeArrayCopy(iArr2[i4], i5);
            strArr[i4] = rendererCapabilitiesArr[i4].getName();
            iArr3[i4] = rendererCapabilitiesArr[i4].getTrackType();
        }
        androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo = new androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new androidx.media3.exoplayer.source.TrackGroupArray((androidx.media3.common.TrackGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        android.util.Pair<androidx.media3.exoplayer.RendererConfiguration[], androidx.media3.exoplayer.trackselection.ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new androidx.media3.exoplayer.trackselection.TrackSelectorResult((androidx.media3.exoplayer.RendererConfiguration[]) pairSelectTracks.first, (androidx.media3.exoplayer.trackselection.ExoTrackSelection[]) pairSelectTracks.second, androidx.media3.exoplayer.trackselection.TrackSelectionUtil.buildTracks(mappedTrackInfo, (androidx.media3.exoplayer.trackselection.TrackSelection[]) pairSelectTracks.second), mappedTrackInfo);
    }

    private static int findRenderer(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.common.TrackGroup trackGroup, int[] iArr, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < rendererCapabilitiesArr.length; i2++) {
            androidx.media3.exoplayer.RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                iMax = java.lang.Math.max(iMax, androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(rendererCapabilities.supportsFormat(trackGroup.getFormat(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(androidx.media3.exoplayer.RendererCapabilities rendererCapabilities, androidx.media3.common.TrackGroup trackGroup) throws androidx.media3.exoplayer.ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i = 0; i < trackGroup.length; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr) throws androidx.media3.exoplayer.ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rendererCapabilitiesArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }
}
