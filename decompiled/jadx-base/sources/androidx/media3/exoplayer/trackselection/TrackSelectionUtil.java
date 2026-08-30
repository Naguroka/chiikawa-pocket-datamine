package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection createAdaptiveTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static androidx.media3.exoplayer.trackselection.ExoTrackSelection[] createTrackSelectionsForDefinitions(androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition[] definitionArr, androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new androidx.media3.exoplayer.trackselection.ExoTrackSelection[definitionArr.length];
        boolean z = false;
        for (int i = 0; i < definitionArr.length; i++) {
            androidx.media3.exoplayer.trackselection.ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                if (definition.tracks.length > 1 && !z) {
                    exoTrackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z = true;
                } else {
                    exoTrackSelectionArr[i] = new androidx.media3.exoplayer.trackselection.FixedTrackSelection(definition.group, definition.tracks[0], definition.type);
                }
            }
        }
        return exoTrackSelectionArr;
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters updateParametersWithOverride(androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters parameters, int i, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, boolean z, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i);
    }

    public static androidx.media3.common.Tracks buildTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, androidx.media3.exoplayer.trackselection.TrackSelection[] trackSelectionArr) {
        java.util.List[] listArr = new java.util.List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            androidx.media3.exoplayer.trackselection.TrackSelection trackSelection = trackSelectionArr[i];
            listArr[i] = trackSelection != null ? com.google.common.collect.ImmutableList.of(trackSelection) : com.google.common.collect.ImmutableList.of();
        }
        return buildTracks(mappedTrackInfo, (java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection>[]) listArr);
    }

    public static androidx.media3.common.Tracks buildTracks(androidx.media3.exoplayer.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection>[] listArr) {
        boolean z;
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            java.util.List<? extends androidx.media3.exoplayer.trackselection.TrackSelection> list = listArr[i];
            for (int i2 = 0; i2 < trackGroups.length; i2++) {
                androidx.media3.common.TrackGroup trackGroup = trackGroups.get(i2);
                boolean z2 = mappedTrackInfo.getAdaptiveSupport(i, i2, false) != 0;
                int[] iArr = new int[trackGroup.length];
                boolean[] zArr = new boolean[trackGroup.length];
                for (int i3 = 0; i3 < trackGroup.length; i3++) {
                    iArr[i3] = mappedTrackInfo.getTrackSupport(i, i2, i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list.size()) {
                            z = false;
                            break;
                        }
                        androidx.media3.exoplayer.trackselection.TrackSelection trackSelection = list.get(i4);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i3) != -1) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    zArr[i3] = z;
                }
                builder.add(new androidx.media3.common.Tracks.Group(trackGroup, z2, iArr, zArr));
            }
        }
        androidx.media3.exoplayer.source.TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i5 = 0; i5 < unmappedTrackGroups.length; i5++) {
            androidx.media3.common.TrackGroup trackGroup2 = unmappedTrackGroups.get(i5);
            int[] iArr2 = new int[trackGroup2.length];
            java.util.Arrays.fill(iArr2, 0);
            builder.add(new androidx.media3.common.Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new androidx.media3.common.Tracks(builder.build());
    }
}
