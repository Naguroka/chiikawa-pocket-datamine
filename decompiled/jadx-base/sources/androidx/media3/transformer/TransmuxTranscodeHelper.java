package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class TransmuxTranscodeHelper {

    public static final class ResumeMetadata {
        public final com.google.common.collect.ImmutableList<android.util.Pair<java.lang.Integer, java.lang.Long>> firstMediaItemIndexAndOffsetInfo;
        public final long lastSyncSampleTimestampUs;
        public final androidx.media3.common.Format videoFormat;

        public ResumeMetadata(long j, com.google.common.collect.ImmutableList<android.util.Pair<java.lang.Integer, java.lang.Long>> immutableList, androidx.media3.common.Format format) {
            this.lastSyncSampleTimestampUs = j;
            this.firstMediaItemIndexAndOffsetInfo = immutableList;
            this.videoFormat = format;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$1] */
    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.Mp4Info> getMp4Info(final android.content.Context context, final java.lang.String str, final long j) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        new java.lang.Thread("TransmuxTranscodeHelper:Mp4Info") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    settableFutureCreate.set(androidx.media3.transformer.Mp4Info.create(context, str, j));
                } catch (java.lang.Exception e) {
                    settableFutureCreate.setException(e);
                }
            }
        }.start();
        return settableFutureCreate;
    }

    public static androidx.media3.transformer.Composition buildUponCompositionForTrimOptimization(androidx.media3.transformer.Composition composition, long j, long j2, long j3, boolean z, boolean z2) {
        androidx.media3.transformer.Effects effects;
        androidx.media3.transformer.EditedMediaItem editedMediaItem = composition.sequences.get(0).editedMediaItems.get(0);
        androidx.media3.common.MediaItem mediaItemBuild = editedMediaItem.mediaItem.buildUpon().setClippingConfiguration(new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().setStartPositionUs(j).setEndPositionUs(j2).setStartsAtKeyFrame(z).build()).build();
        if (z2) {
            effects = new androidx.media3.transformer.Effects(editedMediaItem.effects.audioProcessors, com.google.common.collect.ImmutableList.of());
        } else {
            effects = editedMediaItem.effects;
        }
        return composition.buildUpon().setSequences(com.google.common.collect.ImmutableList.of(new androidx.media3.transformer.EditedMediaItemSequence(editedMediaItem.buildUpon().setMediaItem(mediaItemBuild).setDurationUs(j3).setEffects(effects).build(), new androidx.media3.transformer.EditedMediaItem[0]))).build();
    }

    private TransmuxTranscodeHelper() {
    }

    public static androidx.media3.transformer.Composition createVideoOnlyComposition(java.lang.String str, long j) {
        return new androidx.media3.transformer.Composition.Builder(com.google.common.collect.ImmutableList.of(new androidx.media3.transformer.EditedMediaItemSequence(com.google.common.collect.ImmutableList.of(new androidx.media3.transformer.EditedMediaItem.Builder(new androidx.media3.common.MediaItem.Builder().setUri(str).setClippingConfiguration(new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().setEndPositionMs(androidx.media3.common.util.Util.usToMs(j)).build()).build()).setRemoveAudio(true).build())))).build();
    }

    public static androidx.media3.transformer.Composition createAudioTranscodeAndVideoTransmuxComposition(androidx.media3.transformer.Composition composition, java.lang.String str) {
        androidx.media3.transformer.Composition compositionBuildUponComposition = buildUponComposition((androidx.media3.transformer.Composition) androidx.media3.common.util.Assertions.checkNotNull(composition), false, true, null);
        androidx.media3.transformer.Composition.Builder builderBuildUpon = compositionBuildUponComposition.buildUpon();
        java.util.ArrayList arrayList = new java.util.ArrayList(compositionBuildUponComposition.sequences);
        arrayList.add(new androidx.media3.transformer.EditedMediaItemSequence(com.google.common.collect.ImmutableList.of(new androidx.media3.transformer.EditedMediaItem.Builder(new androidx.media3.common.MediaItem.Builder().setUri(str).build()).build())));
        builderBuildUpon.setSequences(arrayList);
        builderBuildUpon.setTransmuxVideo(true);
        return builderBuildUpon.build();
    }

    public static androidx.media3.transformer.Composition buildUponComposition(androidx.media3.transformer.Composition composition, boolean z, boolean z2, androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata resumeMetadata) {
        long jLongValue;
        int iIntValue;
        androidx.media3.transformer.Composition.Builder builderBuildUpon = composition.buildUpon();
        com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItemSequence> immutableList = composition.sequences;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.collect.ImmutableList<android.util.Pair<java.lang.Integer, java.lang.Long>> immutableList2 = resumeMetadata != null ? resumeMetadata.firstMediaItemIndexAndOffsetInfo : null;
        int i = 0;
        while (i < immutableList.size()) {
            androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence = immutableList.get(i);
            com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItem> immutableList3 = editedMediaItemSequence.editedMediaItems;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (immutableList2 != null) {
                iIntValue = ((java.lang.Integer) immutableList2.get(i).first).intValue();
                jLongValue = ((java.lang.Long) immutableList2.get(i).second).longValue();
            } else {
                jLongValue = 0;
                iIntValue = 0;
            }
            int i2 = iIntValue;
            while (i2 < immutableList3.size()) {
                androidx.media3.transformer.EditedMediaItem editedMediaItem = immutableList3.get(i2);
                androidx.media3.transformer.EditedMediaItem.Builder builderBuildUpon2 = editedMediaItem.buildUpon();
                if (i2 == iIntValue) {
                    builderBuildUpon2.setMediaItem(editedMediaItem.mediaItem.buildUpon().setClippingConfiguration(editedMediaItem.mediaItem.clippingConfiguration.buildUpon().setStartPositionMs(editedMediaItem.mediaItem.clippingConfiguration.startPositionMs + androidx.media3.common.util.Util.usToMs(jLongValue)).build()).build());
                }
                if (z) {
                    builderBuildUpon2.setRemoveAudio(true);
                }
                if (z2) {
                    builderBuildUpon2.setRemoveVideo(true);
                }
                arrayList2.add(builderBuildUpon2.build());
                i2++;
                immutableList2 = immutableList2;
                builderBuildUpon = builderBuildUpon;
            }
            arrayList.add(new androidx.media3.transformer.EditedMediaItemSequence(arrayList2, editedMediaItemSequence.isLooping));
            i++;
            immutableList2 = immutableList2;
            builderBuildUpon = builderBuildUpon;
        }
        androidx.media3.transformer.Composition.Builder builder = builderBuildUpon;
        builder.setSequences(arrayList);
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$2] */
    public static com.google.common.util.concurrent.ListenableFuture<androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata> getResumeMetadataAsync(final android.content.Context context, final java.lang.String str, final androidx.media3.transformer.Composition composition) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        new java.lang.Thread("TransmuxTranscodeHelper:ResumeMetadata") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (settableFutureCreate.isCancelled()) {
                        return;
                    }
                    androidx.media3.transformer.Mp4Info mp4InfoCreate = androidx.media3.transformer.Mp4Info.create(context, str);
                    long j = mp4InfoCreate.lastSyncSampleTimestampUs;
                    com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
                    if (j != androidx.media3.common.C.TIME_UNSET) {
                        for (int i = 0; i < composition.sequences.size(); i++) {
                            com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItem> immutableList = composition.sequences.get(i).editedMediaItems;
                            long j2 = j;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= immutableList.size() || j2 <= 0) {
                                    j2 = 0;
                                    break;
                                }
                                long mediaItemDurationUs = androidx.media3.transformer.TransmuxTranscodeHelper.getMediaItemDurationUs(context, immutableList.get(i2).mediaItem);
                                if (mediaItemDurationUs > j2) {
                                    break;
                                }
                                j2 -= mediaItemDurationUs;
                                i2++;
                            }
                            builder.add(new android.util.Pair(java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(j2)));
                        }
                    }
                    settableFutureCreate.set(new androidx.media3.transformer.TransmuxTranscodeHelper.ResumeMetadata(j, builder.build(), mp4InfoCreate.videoFormat));
                } catch (java.lang.Exception e) {
                    settableFutureCreate.setException(e);
                }
            }
        }.start();
        return settableFutureCreate;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.transformer.TransmuxTranscodeHelper$3] */
    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> copyFileAsync(final java.io.File file, final java.io.File file2) {
        final com.google.common.util.concurrent.SettableFuture settableFutureCreate = com.google.common.util.concurrent.SettableFuture.create();
        new java.lang.Thread("TransmuxTranscodeHelper:CopyFile") { // from class: androidx.media3.transformer.TransmuxTranscodeHelper.3
            /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:32:0x0052 A[Catch: IOException -> 0x0055, TRY_LEAVE, TryCatch #3 {IOException -> 0x0055, blocks: (B:30:0x004d, B:32:0x0052), top: B:38:0x004d }] */
            /* JADX WARN: Code duplicated, block: B:38:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws java.lang.Throwable {
                java.io.FileOutputStream fileOutputStream;
                java.lang.Throwable th;
                java.io.FileInputStream fileInputStream;
                java.lang.Exception e;
                if (settableFutureCreate.isCancelled()) {
                    return;
                }
                try {
                    try {
                        fileInputStream = new java.io.FileInputStream(file);
                        try {
                            fileOutputStream = new java.io.FileOutputStream(file2);
                            try {
                                try {
                                    com.google.common.io.ByteStreams.copy(fileInputStream, fileOutputStream);
                                    settableFutureCreate.set(null);
                                    fileInputStream.close();
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    settableFutureCreate.setException(e);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    if (fileOutputStream == null) {
                                        return;
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (java.io.IOException unused) {
                                        throw th;
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e3) {
                            fileOutputStream = null;
                            e = e3;
                        } catch (java.lang.Throwable th3) {
                            fileOutputStream = null;
                            th = th3;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.io.IOException unused2) {
                        return;
                    }
                } catch (java.lang.Exception e4) {
                    fileOutputStream = null;
                    e = e4;
                    fileInputStream = null;
                } catch (java.lang.Throwable th4) {
                    fileOutputStream = null;
                    th = th4;
                    fileInputStream = null;
                }
                fileOutputStream.close();
            }
        }.start();
        return settableFutureCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaItemDurationUs(android.content.Context context, androidx.media3.common.MediaItem mediaItem) throws java.io.IOException {
        long jMsToUs;
        java.lang.String string = ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration)).uri.toString();
        long jMsToUs2 = androidx.media3.common.util.Util.msToUs(mediaItem.clippingConfiguration.startPositionMs);
        if (mediaItem.clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
            jMsToUs = androidx.media3.common.util.Util.msToUs(mediaItem.clippingConfiguration.endPositionMs);
        } else {
            jMsToUs = androidx.media3.transformer.Mp4Info.create(context, string).durationUs;
        }
        return jMsToUs - jMsToUs2;
    }
}
