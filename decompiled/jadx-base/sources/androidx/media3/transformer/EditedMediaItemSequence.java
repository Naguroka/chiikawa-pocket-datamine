package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class EditedMediaItemSequence {
    public final com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItem> editedMediaItems;
    public final boolean isLooping;

    public EditedMediaItemSequence(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.transformer.EditedMediaItem... editedMediaItemArr) {
        this(new com.google.common.collect.ImmutableList.Builder().add(editedMediaItem).add((java.lang.Object[]) editedMediaItemArr).build());
    }

    public EditedMediaItemSequence(java.util.List<androidx.media3.transformer.EditedMediaItem> list) {
        this(list, false);
    }

    public EditedMediaItemSequence(java.util.List<androidx.media3.transformer.EditedMediaItem> list, boolean z) {
        androidx.media3.common.util.Assertions.checkArgument(!list.isEmpty());
        this.editedMediaItems = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.isLooping = z;
    }
}
