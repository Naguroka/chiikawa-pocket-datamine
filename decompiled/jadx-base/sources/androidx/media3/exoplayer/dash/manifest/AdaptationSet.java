package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class AdaptationSet {
    public static final long ID_UNSET = -1;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> accessibilityDescriptors;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> essentialProperties;
    public final long id;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> representations;
    public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> supplementalProperties;
    public final int type;

    public AdaptationSet(long j, int i, java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4) {
        this.id = j;
        this.type = i;
        this.representations = java.util.Collections.unmodifiableList(list);
        this.accessibilityDescriptors = java.util.Collections.unmodifiableList(list2);
        this.essentialProperties = java.util.Collections.unmodifiableList(list3);
        this.supplementalProperties = java.util.Collections.unmodifiableList(list4);
    }
}
